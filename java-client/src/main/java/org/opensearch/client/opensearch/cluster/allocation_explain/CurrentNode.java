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

package org.opensearch.client.opensearch.cluster.allocation_explain;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// typedef: cluster.allocation_explain.CurrentNode
public final class CurrentNode implements ToJsonp {
	private final String id;

	private final String name;

	private final Map<String, String> attributes;

	private final String transportAddress;

	private final Number weightRanking;

	// ---------------------------------------------------------------------------------------------

	protected CurrentNode(Builder builder) {

		this.id = Objects.requireNonNull(builder.id, "id");
		this.name = Objects.requireNonNull(builder.name, "name");
		this.attributes = Objects.requireNonNull(builder.attributes, "attributes");
		this.transportAddress = Objects.requireNonNull(builder.transportAddress, "transport_address");
		this.weightRanking = Objects.requireNonNull(builder.weightRanking, "weight_ranking");

	}

	/**
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code attributes}
	 */
	public Map<String, String> attributes() {
		return this.attributes;
	}

	/**
	 * API name: {@code transport_address}
	 */
	public String transportAddress() {
		return this.transportAddress;
	}

	/**
	 * API name: {@code weight_ranking}
	 */
	public Number weightRanking() {
		return this.weightRanking;
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

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("attributes");
		generator.writeStartObject();
		for (Map.Entry<String, String> item0 : this.attributes.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

		generator.writeKey("transport_address");
		generator.write(this.transportAddress);

		generator.writeKey("weight_ranking");
		generator.write(this.weightRanking.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CurrentNode}.
	 */
	public static class Builder implements ObjectBuilder<CurrentNode> {
		private String id;

		private String name;

		private Map<String, String> attributes;

		private String transportAddress;

		private Number weightRanking;

		/**
		 * API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code attributes}
		 */
		public Builder attributes(Map<String, String> value) {
			this.attributes = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #attributes(Map)}, creating the map if needed.
		 */
		public Builder putAttributes(String key, String value) {
			if (this.attributes == null) {
				this.attributes = new HashMap<>();
			}
			this.attributes.put(key, value);
			return this;
		}

		/**
		 * API name: {@code transport_address}
		 */
		public Builder transportAddress(String value) {
			this.transportAddress = value;
			return this;
		}

		/**
		 * API name: {@code weight_ranking}
		 */
		public Builder weightRanking(Number value) {
			this.weightRanking = value;
			return this;
		}

		/**
		 * Builds a {@link CurrentNode}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CurrentNode build() {

			return new CurrentNode(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for CurrentNode
	 */
	public static final JsonpDeserializer<CurrentNode> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, CurrentNode::setupCurrentNodeDeserializer);

	protected static void setupCurrentNodeDeserializer(DelegatingDeserializer<CurrentNode.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::attributes, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"attributes");
		op.add(Builder::transportAddress, JsonpDeserializer.stringDeserializer(), "transport_address");
		op.add(Builder::weightRanking, JsonpDeserializer.numberDeserializer(), "weight_ranking");

	}

}
