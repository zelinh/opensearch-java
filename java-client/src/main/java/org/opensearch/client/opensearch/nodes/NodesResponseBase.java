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

package org.opensearch.client.opensearch.nodes;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.opensearch._types.NodeStatistics;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import java.util.Objects;
import java.util.function.Function;

// typedef: nodes._types.NodesResponseBase
public abstract class NodesResponseBase implements ToJsonp {
	private final NodeStatistics nodeStats;

	// ---------------------------------------------------------------------------------------------

	protected NodesResponseBase(AbstractBuilder<?> builder) {

		this.nodeStats = Objects.requireNonNull(builder.nodeStats, "_nodes");

	}

	/**
	 * Contains statistics about the number of nodes selected by the request's node
	 * filters.
	 *
	 * API name: {@code _nodes}
	 */
	public NodeStatistics nodeStats() {
		return this.nodeStats;
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

		generator.writeKey("_nodes");
		this.nodeStats.toJsonp(generator, mapper);

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> {
		private NodeStatistics nodeStats;

		/**
		 * Contains statistics about the number of nodes selected by the request's node
		 * filters.
		 *
		 * API name: {@code _nodes}
		 */
		public BuilderT nodeStats(NodeStatistics value) {
			this.nodeStats = value;
			return self();
		}

		/**
		 * Contains statistics about the number of nodes selected by the request's node
		 * filters.
		 *
		 * API name: {@code _nodes}
		 */
		public BuilderT nodeStats(Function<NodeStatistics.Builder, ObjectBuilder<NodeStatistics>> fn) {
			return this.nodeStats(fn.apply(new NodeStatistics.Builder()).build());
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupNodesResponseBaseDeserializer(
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::nodeStats, NodeStatistics.DESERIALIZER, "_nodes");

	}

}
