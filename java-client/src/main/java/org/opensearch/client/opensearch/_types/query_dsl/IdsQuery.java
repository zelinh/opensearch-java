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

import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ObjectBuilder;

import javax.annotation.Nullable;

// typedef: _types.query_dsl.IdsQuery
public final class IdsQuery extends QueryBase {
	@Nullable
	private final JsonValue values;

	// ---------------------------------------------------------------------------------------------

	protected IdsQuery(Builder builder) {
		super(builder);
		this.values = builder.values;

	}

	/**
	 * API name: {@code values}
	 */
	@Nullable
	public JsonValue values() {
		return this.values;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.values != null) {

			generator.writeKey("values");
			generator.write(this.values);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IdsQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<IdsQuery> {
		@Nullable
		private JsonValue values;

		/**
		 * API name: {@code values}
		 */
		public Builder values(@Nullable JsonValue value) {
			this.values = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IdsQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IdsQuery build() {

			return new IdsQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for IdsQuery
	 */
	public static final JsonpDeserializer<IdsQuery> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, IdsQuery::setupIdsQueryDeserializer);

	protected static void setupIdsQueryDeserializer(DelegatingDeserializer<IdsQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::values, JsonpDeserializer.jsonValueDeserializer(), "values");

	}

}
