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

package org.opensearch.client.opensearch.snapshot;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.util.function.Function;

// typedef: snapshot.create.Response
public final class CreateResponse implements ToJsonp {
	@Nullable
	private final Boolean accepted;

	@Nullable
	private final SnapshotInfo snapshot;

	// ---------------------------------------------------------------------------------------------

	protected CreateResponse(Builder builder) {

		this.accepted = builder.accepted;
		this.snapshot = builder.snapshot;

	}

	/**
	 * API name: {@code accepted}
	 */
	@Nullable
	public Boolean accepted() {
		return this.accepted;
	}

	/**
	 * API name: {@code snapshot}
	 */
	@Nullable
	public SnapshotInfo snapshot() {
		return this.snapshot;
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

		if (this.accepted != null) {

			generator.writeKey("accepted");
			generator.write(this.accepted);

		}
		if (this.snapshot != null) {

			generator.writeKey("snapshot");
			this.snapshot.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CreateResponse}.
	 */
	public static class Builder implements ObjectBuilder<CreateResponse> {
		@Nullable
		private Boolean accepted;

		@Nullable
		private SnapshotInfo snapshot;

		/**
		 * API name: {@code accepted}
		 */
		public Builder accepted(@Nullable Boolean value) {
			this.accepted = value;
			return this;
		}

		/**
		 * API name: {@code snapshot}
		 */
		public Builder snapshot(@Nullable SnapshotInfo value) {
			this.snapshot = value;
			return this;
		}

		/**
		 * API name: {@code snapshot}
		 */
		public Builder snapshot(Function<SnapshotInfo.Builder, ObjectBuilder<SnapshotInfo>> fn) {
			return this.snapshot(fn.apply(new SnapshotInfo.Builder()).build());
		}

		/**
		 * Builds a {@link CreateResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CreateResponse build() {

			return new CreateResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for CreateResponse
	 */
	public static final JsonpDeserializer<CreateResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, CreateResponse::setupCreateResponseDeserializer);

	protected static void setupCreateResponseDeserializer(DelegatingDeserializer<CreateResponse.Builder> op) {

		op.add(Builder::accepted, JsonpDeserializer.booleanDeserializer(), "accepted");
		op.add(Builder::snapshot, SnapshotInfo.DESERIALIZER, "snapshot");

	}

}
