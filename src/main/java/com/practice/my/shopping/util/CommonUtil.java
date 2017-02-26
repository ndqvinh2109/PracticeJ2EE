package com.practice.my.shopping.util;

import com.practice.my.shopping.model.Person;
import com.practice.my.shopping.model.PersonSearchParameters;

import java.util.Comparator;
import java.util.function.Function;

/**
 * Created by Quang on 02/26/2017.
 */
public class CommonUtil {
    public static enum Nulls {FIRST, LAST};
    public static enum Order {ASCENDING, DESCENDING};

    /** Return a Comparator of T on a function f(T) -> R */
    public static <T, R extends Comparable> Comparator<T> comparatorOf(
            Function<T, R> function,
            Order order,
            Nulls nulls) {

        Comparator<R> rComparator = Comparator.naturalOrder();

        if (order == Order.DESCENDING) {
            rComparator = rComparator.reversed();
        }
        rComparator = (nulls == Nulls.FIRST)?
                Comparator.nullsFirst(rComparator) :
                Comparator.nullsLast(rComparator);

        Comparator<T> tComparator =
                Comparator.comparing(
                        function, rComparator);

        return tComparator;
    }

    public static <T, R extends Comparable> Function<T, R> getPersonSearchValue
            (PersonSearchParameters parameters, PersonComparator<T, R> personComparator) {
        return personComparator.getValue(parameters);
    }

}
