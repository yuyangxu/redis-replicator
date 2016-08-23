/*
 * Copyright 2016 leon chen
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

package com.moilioncircle.redis.replicator.rdb;

import com.moilioncircle.redis.replicator.Replicator;
import com.moilioncircle.redis.replicator.rdb.datatype.KeyValuePair;

/**
 * Created by leon on 8/13/16.
 */
public interface RdbListener {
    void preFullSync(Replicator replicator);

    void handle(Replicator replicator, KeyValuePair<?> kv);

    void postFullSync(Replicator replicator);

    abstract class Adaptor implements RdbListener {

        public void preFullSync(Replicator replicator) {
            //do nothing
        }

        public void postFullSync(Replicator replicator) {
            //do nothing
        }
    }
}
