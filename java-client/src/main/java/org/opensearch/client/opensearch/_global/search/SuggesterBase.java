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

package org.opensearch.client.opensearch._global.search;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ToJsonp;

import javax.annotation.Nullable;
import java.util.Objects;

// typedef: _global.search._types.SuggesterBase
public abstract class SuggesterBase implements ToJsonp {
	private final String field;

	@Nullable
	private final String analyzer;

	@Nullable
	private final Number size;

	// ---------------------------------------------------------------------------------------------

	protected SuggesterBase(AbstractBuilder<?> builder) {

		this.field = Objects.requireNonNull(builder.field, "field");
		this.analyzer = builder.analyzer;
		this.size = builder.size;

	}

	/**
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code analyzer}
	 */
	@Nullable
	public String analyzer() {
		return this.analyzer;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public Number size() {
		return this.size;
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

		generator.writeKey("field");
		generator.write(this.field);

		if (this.analyzer != null) {

			generator.writeKey("analyzer");
			generator.write(this.analyzer);

		}
		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size.doubleValue());

		}

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> {
		private String field;

		@Nullable
		private String analyzer;

		@Nullable
		private Number size;

		/**
		 * API name: {@code field}
		 */
		public BuilderT field(String value) {
			this.field = value;
			return self();
		}

		/**
		 * API name: {@code analyzer}
		 */
		public BuilderT analyzer(@Nullable String value) {
			this.analyzer = value;
			return self();
		}

		/**
		 * API name: {@code size}
		 */
		public BuilderT size(@Nullable Number value) {
			this.size = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupSuggesterBaseDeserializer(
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(AbstractBuilder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(AbstractBuilder::size, JsonpDeserializer.numberDeserializer(), "size");

	}

}
