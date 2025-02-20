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

package org.opensearch.client.opensearch.cluster;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.base.OpenSearchError;
import org.opensearch.client.base.Endpoint;
import org.opensearch.client.opensearch._types.RequestBase;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import java.util.Collections;
import java.util.Objects;

// typedef: cluster.remote_info.Request
public final class RemoteInfoRequest extends RequestBase implements ToJsonp {
	private final String stub;

	// ---------------------------------------------------------------------------------------------

	protected RemoteInfoRequest(Builder builder) {

		this.stub = Objects.requireNonNull(builder.stub, "stub");

	}

	/**
	 * API name: {@code stub}
	 */
	public String stub() {
		return this.stub;
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

		generator.writeKey("stub");
		generator.write(this.stub);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RemoteInfoRequest}.
	 */
	public static class Builder implements ObjectBuilder<RemoteInfoRequest> {
		private String stub;

		/**
		 * API name: {@code stub}
		 */
		public Builder stub(String value) {
			this.stub = value;
			return this;
		}

		/**
		 * Builds a {@link RemoteInfoRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RemoteInfoRequest build() {

			return new RemoteInfoRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RemoteInfoRequest
	 */
	public static final JsonpDeserializer<RemoteInfoRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RemoteInfoRequest::setupRemoteInfoRequestDeserializer);

	protected static void setupRemoteInfoRequestDeserializer(DelegatingDeserializer<RemoteInfoRequest.Builder> op) {

		op.add(Builder::stub, JsonpDeserializer.stringDeserializer(), "stub");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cluster.remote_info}".
	 */
	public static final Endpoint<RemoteInfoRequest, RemoteInfoResponse, OpenSearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_remote/info";

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, RemoteInfoResponse.DESERIALIZER);
}
