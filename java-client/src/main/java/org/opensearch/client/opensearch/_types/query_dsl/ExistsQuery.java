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

package org.opensearch.client.opensearch._types.query_dsl;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ObjectBuilder;

import javax.annotation.Nullable;

// typedef: _types.query_dsl.ExistsQuery
public final class ExistsQuery extends QueryBase {
	@Nullable
	private final String field;

	// ---------------------------------------------------------------------------------------------

	protected ExistsQuery(Builder builder) {
		super(builder);
		this.field = builder.field;

	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public String field() {
		return this.field;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.field != null) {

			generator.writeKey("field");
			generator.write(this.field);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExistsQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<ExistsQuery> {
		@Nullable
		private String field;

		/**
		 * API name: {@code field}
		 */
		public Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ExistsQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExistsQuery build() {

			return new ExistsQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ExistsQuery
	 */
	public static final JsonpDeserializer<ExistsQuery> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ExistsQuery::setupExistsQueryDeserializer);

	protected static void setupExistsQueryDeserializer(DelegatingDeserializer<ExistsQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");

	}

}
