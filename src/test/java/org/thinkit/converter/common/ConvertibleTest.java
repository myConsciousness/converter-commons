/*
 * Copyright 2020 Kato Shinya.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.thinkit.converter.common;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

/**
 * {@link Convertible} インターフェースのテストクラスです。
 *
 * @author Kato Shinya
 * @since 1.0
 * @version 1.0
 */
class ConvertibleTest {

    @Test
    void testToString() {
        final String actual = new ConvertibleToString().convert();
        assertNotNull(actual);
        assertEquals("success", actual);
    }

    @Test
    void testToInteger() {
        assertEquals(1, new ConvertibleToInteger().convert());
    }

    @Test
    void testToBoolean() {
        assertEquals(true, new ConvertibleToBoolean().convert());
    }

    /**
     * String型の返却値を返却する {@link Convertible#convert()} メソッドを実装するクラスです。
     *
     * @author Kato Shinya
     * @since 1.0
     * @version 1.0
     */
    class ConvertibleToString implements Convertible<String> {

        @Override
        public String convert() {
            return "success";
        }
    }

    /**
     * int型の返却値を返却する {@link Convertible#convert()} メソッドを実装するクラスです。
     *
     * @author Kato Shinya
     * @since 1.0
     * @version 1.0
     */
    class ConvertibleToInteger implements Convertible<Integer> {

        @Override
        public Integer convert() {
            return 1;
        }
    }

    /**
     * boolean型の返却値を返却する {@link Convertible#convert()} メソッドを実装するクラスです。
     *
     * @author Kato Shinya
     * @since 1.0
     * @version 1.0
     */
    class ConvertibleToBoolean implements Convertible<Boolean> {

        @Override
        public Boolean convert() {
            return true;
        }
    }
}
