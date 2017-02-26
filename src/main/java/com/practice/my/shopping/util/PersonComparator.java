package com.practice.my.shopping.util;

import java.util.function.Function;

/**
 * Created by Quang on 02/26/2017.
 */@FunctionalInterface
public interface PersonComparator {
    <T, R extends  Comparable<? super R>> Function<T, R> getValue();
}
