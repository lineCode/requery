/*
 * Copyright 2017 requery.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.requery.meta;

import io.requery.query.Aliasable;
import io.requery.query.Conditional;
import io.requery.query.Expression;
import io.requery.query.Functional;
import io.requery.query.LogicalCondition;

public interface QueryExpression<V> extends
    Expression<V>,
    Functional<V>,
    Aliasable<QueryExpression<V>>,
    Conditional<LogicalCondition<? extends Expression<V>, ?>, V> {
}
