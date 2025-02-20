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

package org.opensearch.client.opensearch.ingest;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.util.Objects;

// typedef: ingest._types.DotExpanderProcessor
public final class DotExpanderProcessor extends ProcessorBase {
	private final String field;

	@Nullable
	private final String path;

	// ---------------------------------------------------------------------------------------------

	protected DotExpanderProcessor(Builder builder) {
		super(builder);
		this.field = Objects.requireNonNull(builder.field, "field");
		this.path = builder.path;

	}

	/**
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code path}
	 */
	@Nullable
	public String path() {
		return this.path;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);

		generator.writeKey("field");
		generator.write(this.field);

		if (this.path != null) {

			generator.writeKey("path");
			generator.write(this.path);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DotExpanderProcessor}.
	 */
	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DotExpanderProcessor> {
		private String field;

		@Nullable
		private String path;

		/**
		 * API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code path}
		 */
		public Builder path(@Nullable String value) {
			this.path = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DotExpanderProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DotExpanderProcessor build() {

			return new DotExpanderProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for DotExpanderProcessor
	 */
	public static final JsonpDeserializer<DotExpanderProcessor> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DotExpanderProcessor::setupDotExpanderProcessorDeserializer);

	protected static void setupDotExpanderProcessorDeserializer(
			DelegatingDeserializer<DotExpanderProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::path, JsonpDeserializer.stringDeserializer(), "path");

	}

}
