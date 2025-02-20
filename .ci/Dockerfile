#
# SPDX-License-Identifier: Apache-2.0
#
# The OpenSearch Contributors require contributions made to
# this file be licensed under the Apache-2.0 license or a
# compatible open source license.
#
# Licensed to Elasticsearch B.V. under one or more contributor
# license agreements. See the NOTICE file distributed with
# this work for additional information regarding copyright
# ownership. Elasticsearch B.V. licenses this file to you under
# the Apache License, Version 2.0 (the "License"); you may
# not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing,
# software distributed under the License is distributed on an
# "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
# KIND, either express or implied.  See the License for the
# specific language governing permissions and limitations
# under the License.
#
# Modifications Copyright OpenSearch Contributors. See
# GitHub history for details.
#

# Build a Docker image that has Gradle and all project dependencies ready.
# Needs to be run with .git and java-client/src mounted under /opensearch-java.

FROM openjdk:15

WORKDIR /opensearch-java/

# Download and initialize Gradle
COPY gradlew ./
COPY gradle ./gradle
RUN ./gradlew

COPY LICENSE.txt NOTICE.txt ./

# Prefetch dependencies
COPY build.gradle.kts settings.gradle.kts ./
COPY buildSrc ./buildSrc/
COPY java-client/build.gradle.kts ./java-client/
RUN ./gradlew resolveDependencies

ENTRYPOINT ["./gradlew"]
