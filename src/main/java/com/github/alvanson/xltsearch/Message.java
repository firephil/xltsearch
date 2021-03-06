/* Copyright 2016 Evan A. Thompson
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
package com.github.alvanson.xltsearch;

class Message {
    static enum Level {
        TRACE, DEBUG, INFO, WARN, ERROR
    }

    final long timestamp;
    final Level level;
    final String from;
    final String summary;
    final String details;

    Message(long timestamp, Level level, String from, String summary, String details) {
        this.timestamp = timestamp;
        this.level = level;
        this.from = from;
        this.summary = summary;
        this.details = details;
    }
}
