/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.client.opensearch.nodes.info;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import java.util.Objects;

// typedef: nodes.info.NodeInfoSearchRemote
public final class NodeInfoSearchRemote implements ToJsonp {
	private final String connect;

	// ---------------------------------------------------------------------------------------------

	protected NodeInfoSearchRemote(Builder builder) {

		this.connect = Objects.requireNonNull(builder.connect, "connect");

	}

	/**
	 * API name: {@code connect}
	 */
	public String connect() {
		return this.connect;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("connect");
		generator.write(this.connect);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoSearchRemote}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoSearchRemote> {
		private String connect;

		/**
		 * API name: {@code connect}
		 */
		public Builder connect(String value) {
			this.connect = value;
			return this;
		}

		/**
		 * Builds a {@link NodeInfoSearchRemote}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoSearchRemote build() {

			return new NodeInfoSearchRemote(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for NodeInfoSearchRemote
	 */
	public static final JsonpDeserializer<NodeInfoSearchRemote> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NodeInfoSearchRemote::setupNodeInfoSearchRemoteDeserializer);

	protected static void setupNodeInfoSearchRemoteDeserializer(
			DelegatingDeserializer<NodeInfoSearchRemote.Builder> op) {

		op.add(Builder::connect, JsonpDeserializer.stringDeserializer(), "connect");

	}

}
