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
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

// typedef: ingest._types.PipelineConfig
public final class PipelineConfig implements ToJsonp {
	@Nullable
	private final String description;

	@Nullable
	private final Number version;

	private final List<ProcessorContainer> processors;

	// ---------------------------------------------------------------------------------------------

	protected PipelineConfig(Builder builder) {

		this.description = builder.description;
		this.version = builder.version;
		this.processors = Objects.requireNonNull(builder.processors, "processors");

	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public Number version() {
		return this.version;
	}

	/**
	 * API name: {@code processors}
	 */
	public List<ProcessorContainer> processors() {
		return this.processors;
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

		if (this.description != null) {

			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version.doubleValue());

		}

		generator.writeKey("processors");
		generator.writeStartArray();
		for (ProcessorContainer item0 : this.processors) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PipelineConfig}.
	 */
	public static class Builder implements ObjectBuilder<PipelineConfig> {
		@Nullable
		private String description;

		@Nullable
		private Number version;

		private List<ProcessorContainer> processors;

		/**
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(@Nullable Number value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code processors}
		 */
		public Builder processors(List<ProcessorContainer> value) {
			this.processors = value;
			return this;
		}

		/**
		 * API name: {@code processors}
		 */
		public Builder processors(ProcessorContainer... value) {
			this.processors = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #processors(List)}, creating the list if needed.
		 */
		public Builder addProcessors(ProcessorContainer value) {
			if (this.processors == null) {
				this.processors = new ArrayList<>();
			}
			this.processors.add(value);
			return this;
		}

		/**
		 * Set {@link #processors(List)} to a singleton list.
		 */
		public Builder processors(Function<ProcessorContainer.Builder, ObjectBuilder<ProcessorContainer>> fn) {
			return this.processors(fn.apply(new ProcessorContainer.Builder()).build());
		}

		/**
		 * Add a value to {@link #processors(List)}, creating the list if needed.
		 */
		public Builder addProcessors(Function<ProcessorContainer.Builder, ObjectBuilder<ProcessorContainer>> fn) {
			return this.addProcessors(fn.apply(new ProcessorContainer.Builder()).build());
		}

		/**
		 * Builds a {@link PipelineConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PipelineConfig build() {

			return new PipelineConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PipelineConfig
	 */
	public static final JsonpDeserializer<PipelineConfig> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PipelineConfig::setupPipelineConfigDeserializer);

	protected static void setupPipelineConfigDeserializer(DelegatingDeserializer<PipelineConfig.Builder> op) {

		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::version, JsonpDeserializer.numberDeserializer(), "version");
		op.add(Builder::processors, JsonpDeserializer.arrayDeserializer(ProcessorContainer.DESERIALIZER), "processors");

	}

}
