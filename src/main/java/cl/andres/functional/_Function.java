package cl.andres.functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        System.out.println("incrementByOne: " + incrementByOne(7));
        System.out.println("incrementByOneFunction: " + incrementByOneFunction.apply(7));
        System.out.println("addAndMultiplyFunction: " + addAndMultiplyFunction.apply(7));
        System.out.println("addAndMultiplyBiFunction: " + addAndMultiplyBiFunction.apply(7, 10));
    }

    /**
     * Normal method
     *
     * @param number
     * @return
     */
    static int incrementByOne(int number) {
        return ++number;
    }

    /**
     * Functional interface
     */
    static Function<Integer, Integer> incrementByOneFunction = number -> ++number;

    /**
     * Functional interface
     */
    static Function<Integer, Integer> multiplyByFunction = number -> number * number;

    /**
     * Chained function
     */
    static Function<Integer, Integer> addAndMultiplyFunction = incrementByOneFunction.andThen(multiplyByFunction);

    /**
     * BiFunction
     */
    static BiFunction<Integer, Integer, Integer> addAndMultiplyBiFunction =
            (numberToAdd, numberToMultiply) -> ++numberToAdd * numberToMultiply;
}
