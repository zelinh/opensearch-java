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

package org.opensearch.client.opensearch._global.get_script_context;

import jakarta.json.stream.JsonGenerator;
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

// typedef: _global.get_script_context.Context
public final class Context implements ToJsonp {
	private final List<ContextMethod> methods;

	private final String name;

	// ---------------------------------------------------------------------------------------------

	protected Context(Builder builder) {

		this.methods = Objects.requireNonNull(builder.methods, "methods");
		this.name = Objects.requireNonNull(builder.name, "name");

	}

	/**
	 * API name: {@code methods}
	 */
	public List<ContextMethod> methods() {
		return this.methods;
	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
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

		generator.writeKey("methods");
		generator.writeStartArray();
		for (ContextMethod item0 : this.methods) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("name");
		generator.write(this.name);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Context}.
	 */
	public static class Builder implements ObjectBuilder<Context> {
		private List<ContextMethod> methods;

		private String name;

		/**
		 * API name: {@code methods}
		 */
		public Builder methods(List<ContextMethod> value) {
			this.methods = value;
			return this;
		}

		/**
		 * API name: {@code methods}
		 */
		public Builder methods(ContextMethod... value) {
			this.methods = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #methods(List)}, creating the list if needed.
		 */
		public Builder addMethods(ContextMethod value) {
			if (this.methods == null) {
				this.methods = new ArrayList<>();
			}
			this.methods.add(value);
			return this;
		}

		/**
		 * Set {@link #methods(List)} to a singleton list.
		 */
		public Builder methods(Function<ContextMethod.Builder, ObjectBuilder<ContextMethod>> fn) {
			return this.methods(fn.apply(new ContextMethod.Builder()).build());
		}

		/**
		 * Add a value to {@link #methods(List)}, creating the list if needed.
		 */
		public Builder addMethods(Function<ContextMethod.Builder, ObjectBuilder<ContextMethod>> fn) {
			return this.addMethods(fn.apply(new ContextMethod.Builder()).build());
		}

		/**
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Builds a {@link Context}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Context build() {

			return new Context(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Context
	 */
	public static final JsonpDeserializer<Context> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Context::setupContextDeserializer);

	protected static void setupContextDeserializer(DelegatingDeserializer<Context.Builder> op) {

		op.add(Builder::methods, JsonpDeserializer.arrayDeserializer(ContextMethod.DESERIALIZER), "methods");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");

	}

}
