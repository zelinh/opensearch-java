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

package org.opensearch.client.opensearch.cat;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.opensearch.cat.fielddata.FielddataRecord;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

// typedef: cat.fielddata.Response
public final class FielddataResponse implements ToJsonp {
	private final List<FielddataRecord> value;

	// ---------------------------------------------------------------------------------------------

	protected FielddataResponse(Builder builder) {

		this.value = Objects.requireNonNull(builder.value, "value");

	}

	/**
	 * Response value.
	 *
	 * API name: {@code value}
	 */
	public List<FielddataRecord> value() {
		return this.value;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (FielddataRecord item0 : this.value) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FielddataResponse}.
	 */
	public static class Builder implements ObjectBuilder<FielddataResponse> {
		private List<FielddataRecord> value;

		/**
		 * Response value.
		 *
		 * API name: {@code value}
		 */
		public Builder value(List<FielddataRecord> value) {
			this.value = value;
			return this;
		}

		/**
		 * Response value.
		 *
		 * API name: {@code value}
		 */
		public Builder value(FielddataRecord... value) {
			this.value = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #value(List)}, creating the list if needed.
		 */
		public Builder addValue(FielddataRecord value) {
			if (this.value == null) {
				this.value = new ArrayList<>();
			}
			this.value.add(value);
			return this;
		}

		/**
		 * Set {@link #value(List)} to a singleton list.
		 */
		public Builder value(Function<FielddataRecord.Builder, ObjectBuilder<FielddataRecord>> fn) {
			return this.value(fn.apply(new FielddataRecord.Builder()).build());
		}

		/**
		 * Add a value to {@link #value(List)}, creating the list if needed.
		 */
		public Builder addValue(Function<FielddataRecord.Builder, ObjectBuilder<FielddataRecord>> fn) {
			return this.addValue(fn.apply(new FielddataRecord.Builder()).build());
		}

		/**
		 * Builds a {@link FielddataResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FielddataResponse build() {

			return new FielddataResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for FielddataResponse
	 */
	public static final JsonpDeserializer<FielddataResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, FielddataResponse::setupFielddataResponseDeserializer);

	protected static void setupFielddataResponseDeserializer(DelegatingDeserializer<FielddataResponse.Builder> op) {

		op.add(Builder::value, JsonpDeserializer.arrayDeserializer(FielddataRecord.DESERIALIZER), "value");

	}

}
