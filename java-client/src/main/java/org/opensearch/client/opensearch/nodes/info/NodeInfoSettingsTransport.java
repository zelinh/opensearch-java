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

import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.util.Objects;

// typedef: nodes.info.NodeInfoSettingsTransport
public final class NodeInfoSettingsTransport implements ToJsonp {
	private final JsonValue type;

	@Nullable
	private final String type_default;

	// ---------------------------------------------------------------------------------------------

	protected NodeInfoSettingsTransport(Builder builder) {

		this.type = Objects.requireNonNull(builder.type, "type");
		this.type_default = builder.type_default;

	}

	/**
	 * API name: {@code type}
	 */
	public JsonValue type() {
		return this.type;
	}

	/**
	 * API name: {@code type.default}
	 */
	@Nullable
	public String type_default() {
		return this.type_default;
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

		generator.writeKey("type");
		generator.write(this.type);

		if (this.type_default != null) {

			generator.writeKey("type.default");
			generator.write(this.type_default);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoSettingsTransport}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoSettingsTransport> {
		private JsonValue type;

		@Nullable
		private String type_default;

		/**
		 * API name: {@code type}
		 */
		public Builder type(JsonValue value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code type.default}
		 */
		public Builder type_default(@Nullable String value) {
			this.type_default = value;
			return this;
		}

		/**
		 * Builds a {@link NodeInfoSettingsTransport}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoSettingsTransport build() {

			return new NodeInfoSettingsTransport(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for NodeInfoSettingsTransport
	 */
	public static final JsonpDeserializer<NodeInfoSettingsTransport> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NodeInfoSettingsTransport::setupNodeInfoSettingsTransportDeserializer);

	protected static void setupNodeInfoSettingsTransportDeserializer(
			DelegatingDeserializer<NodeInfoSettingsTransport.Builder> op) {

		op.add(Builder::type, JsonpDeserializer.jsonValueDeserializer(), "type");
		op.add(Builder::type_default, JsonpDeserializer.stringDeserializer(), "type.default");

	}

}
