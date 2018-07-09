/*
 * Copyright 2015-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.kakeibochan.mylasta.direction;

import com.kakeibochan.mylasta.direction.BatchEnv;
import org.lastaflute.core.direction.exception.ConfigPropertyNotFoundException;

/**
 * @author FreeGen
 */
public interface BatchConfig extends BatchEnv {

    /** The key of the configuration. e.g. batch */
    String DOMAIN_NAME = "domain.name";

    /** The key of the configuration. e.g. Batch */
    String DOMAIN_TITLE = "domain.title";

    /** The key of the configuration. e.g. ORL */
    String COOKIE_REMEMBER_ME_ORLEANS_KEY = "cookie.remember.me.batch.key";

    /**
     * Get the value of property as {@link String}.
     * @param propertyKey The key of the property. (NotNull)
     * @return The value of found property. (NotNull: if not found, exception)
     * @throws ConfigPropertyNotFoundException When the property is not found.
     */
    String get(String propertyKey);

    /**
     * Is the property true?
     * @param propertyKey The key of the property which is boolean type. (NotNull)
     * @return The determination, true or false. (if not found, exception)
     * @throws ConfigPropertyNotFoundException When the property is not found.
     */
    boolean is(String propertyKey);

    /**
     * Get the value for the key 'domain.name'. <br>
     * The value is, e.g. batch <br>
     * comment: @Override The name of domain (means this application) as identity
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getDomainName();

    /**
     * Get the value for the key 'domain.title'. <br>
     * The value is, e.g. Batch <br>
     * comment: @Override The title of domain (means this application) for logging
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getDomainTitle();

    /**
     * Get the value for the key 'cookie.remember.me.batch.key'. <br>
     * The value is, e.g. ORL <br>
     * comment: The cookie key of remember-me for Batch #change_it_first
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getCookieRememberMeBatchKey();

    /**
     * The simple implementation for configuration.
     * @author FreeGen
     */
    public static class SimpleImpl extends BatchEnv.SimpleImpl implements BatchConfig {

        /** The serial version UID for object serialization. (Default) */
        private static final long serialVersionUID = 1L;

        @Override
        public String getDomainName() {
            return get(BatchConfig.DOMAIN_NAME);
        }

        @Override
        public String getDomainTitle() {
            return get(BatchConfig.DOMAIN_TITLE);
        }

        public String getCookieRememberMeBatchKey() {
            return get(BatchConfig.COOKIE_REMEMBER_ME_ORLEANS_KEY);
        }
    }
}
