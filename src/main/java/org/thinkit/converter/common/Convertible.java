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

/**
 * 変換可能なオブジェクトを抽象化したインターフェースです。<br>
 * 変換処理を定義するクラスは当該インターフェースを実装してください。
 * <p>
 * {@link #convert()} メソッドが返却するデータ型は {@link Convertible}
 * インターフェースを実装する際にジェネリクスへデータ型を指定することで定義することができます。
 *
 * @author Kato Shinya
 * @since 1.0
 * @version 1.0
 */
public interface Convertible<T> {

    /**
     * 変換処理を行い {@link Convertible} インターフェースを実装する際にジェネリクスに指定されたデータ型の値を返却します。
     *
     * @return 変換処理が行われた {@link Convertible} インターフェースを実装する際にジェネリクスに指定されたデータ型の値
     */
    public T convert();
}
