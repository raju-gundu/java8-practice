package Lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        /**
         * Prior java 8
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            /**
             * if o1==o2 -> 0
             * if o1<o2 -> -1
             * if o1>o2 -> 1
             */
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Result of comparator is -: "+comparator.compare(1, 2));

        Comparator<Integer> comparatorLambda = (Integer a, Integer b) ->  a.compareTo(b);
        System.out.println("Result of comparator lambda is -: "+comparatorLambda.compare(1, 2));

        Comparator<Integer> comparatorLambda1 = ( a,  b) ->  a.compareTo(b);
        System.out.println("Result of comparator lambda is -: "+comparatorLambda.compare(1, 2));
    }
}
