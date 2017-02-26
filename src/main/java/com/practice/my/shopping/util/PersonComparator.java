package com.practice.my.shopping.util;

import com.practice.my.shopping.model.PersonSearchParameters;

import java.util.function.Function;

/**
 * Created by Quang on 02/26/2017.
 */@FunctionalInterface
public interface PersonComparator <T, R extends Comparable> {
    Function<T, R> getValue(PersonSearchParameters parameters);
}
