/*     / \____  _    _  ____   ______  / \ ____  __    _ _____
 *    /  /    \/ \  / \/    \ /  /\__\/  //    \/  \  / /  _  \   Javaslang
 *  _/  /  /\  \  \/  /  /\  \\__\\  \  //  /\  \ /\\/  \__/  /   Copyright 2014-now Daniel Dietrich
 * /___/\_/  \_/\____/\_/  \_/\__\/__/___\_/  \_//  \__/_____/    Licensed under the Apache License, Version 2.0
 */
package javaslang.collection;

import org.junit.Test;

public abstract class AbstractSortedSetTest extends AbstractSetTest {

    @Override
    @Test
    public void shouldFlattenDifferentElementTypes() {
        // can't find a comparable for different element types in a generic way
    }

    @Override
    @Test
    public void shouldPreserveSingletonInstanceOnDeserialization() {
        // not possible, because the empty instance stores information about the underlying comparator
    }
}