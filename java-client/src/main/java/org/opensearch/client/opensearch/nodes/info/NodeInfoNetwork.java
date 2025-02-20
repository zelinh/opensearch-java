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
import java.util.function.Function;

// typedef: nodes.info.NodeInfoNetwork
public final class NodeInfoNetwork implements ToJsonp {
	private final NodeInfoNetworkInterface primaryInterface;

	private final Number refreshInterval;

	// ---------------------------------------------------------------------------------------------

	protected NodeInfoNetwork(Builder builder) {

		this.primaryInterface = Objects.requireNonNull(builder.primaryInterface, "primary_interface");
		this.refreshInterval = Objects.requireNonNull(builder.refreshInterval, "refresh_interval");

	}

	/**
	 * API name: {@code primary_interface}
	 */
	public NodeInfoNetworkInterface primaryInterface() {
		return this.primaryInterface;
	}

	/**
	 * API name: {@code refresh_interval}
	 */
	public Number refreshInterval() {
		return this.refreshInterval;
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

		generator.writeKey("primary_interface");
		this.primaryInterface.toJsonp(generator, mapper);

		generator.writeKey("refresh_interval");
		generator.write(this.refreshInterval.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoNetwork}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoNetwork> {
		private NodeInfoNetworkInterface primaryInterface;

		private Number refreshInterval;

		/**
		 * API name: {@code primary_interface}
		 */
		public Builder primaryInterface(NodeInfoNetworkInterface value) {
			this.primaryInterface = value;
			return this;
		}

		/**
		 * API name: {@code primary_interface}
		 */
		public Builder primaryInterface(
				Function<NodeInfoNetworkInterface.Builder, ObjectBuilder<NodeInfoNetworkInterface>> fn) {
			return this.primaryInterface(fn.apply(new NodeInfoNetworkInterface.Builder()).build());
		}

		/**
		 * API name: {@code refresh_interval}
		 */
		public Builder refreshInterval(Number value) {
			this.refreshInterval = value;
			return this;
		}

		/**
		 * Builds a {@link NodeInfoNetwork}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoNetwork build() {

			return new NodeInfoNetwork(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for NodeInfoNetwork
	 */
	public static final JsonpDeserializer<NodeInfoNetwork> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NodeInfoNetwork::setupNodeInfoNetworkDeserializer);

	protected static void setupNodeInfoNetworkDeserializer(DelegatingDeserializer<NodeInfoNetwork.Builder> op) {

		op.add(Builder::primaryInterface, NodeInfoNetworkInterface.DESERIALIZER, "primary_interface");
		op.add(Builder::refreshInterval, JsonpDeserializer.numberDeserializer(), "refresh_interval");

	}

}
