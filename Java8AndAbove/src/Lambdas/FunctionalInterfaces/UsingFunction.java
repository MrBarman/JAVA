/**
 * Function<T, R> interface defines an abstract method named apply that
 * takes an object of generic type T as input and returns an object of generic type R
 * It also contains two methods andThen() and compose()
 *
 */
package Lambdas.FunctionalInterfaces;

import java.util.function.Function;

public class UsingFunction {
    public static void main(String[] args) {

        Function<Integer, Integer> multiply = (x) -> x * 2;
        Function<Integer, Integer> add = (x) -> x + 2;

        System.out.println(evaluateExpression(3,multiply));
        System.out.println(evaluateExpression(6,add));

        /**
         * The method andThen returns a function that first applies a given function to an input
         * and then applies another function to the result of that application
         */
        System.out.println(multiply.andThen(add).apply(3));
        System.out.println(multiply.andThen(add).andThen(multiply).apply(3));
        System.out.println(add.andThen(multiply).apply(3));

        /**
         * The method compose works in reverse order. It first applies the function given in argument to compose
         * and then apply the function to the result
         */
        System.out.println(multiply.compose(add).apply(3));
        System.out.println(add.compose(multiply).compose(add).apply(3));
        System.out.println(multiply.compose(add).compose(multiply).apply(3));
        System.out.println(add.compose(multiply).apply(3));

    }

    private static Integer evaluateExpression(Integer x, Function<Integer, Integer> f) {
       return f.apply(x);
    }
}
