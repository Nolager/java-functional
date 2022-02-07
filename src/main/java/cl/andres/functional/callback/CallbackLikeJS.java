package cl.andres.functional.callback;

import java.util.function.Consumer;

/**
 * Example of a Javascript callback like function in Java using Consumer and Runnable.
 */
public class CallbackLikeJS {
    public static void main(String[] args) {
        hello("John", null, firstName -> System.out.println("No lastName provided for " + firstName));

        hello2("John", null, () -> System.out.println("No lastName provided"));
    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println("First name: " + firstName);

        if (lastName != null) {
            System.out.println("Last name: " + lastName);
        } else {
            callback.accept(firstName);
        }
    }

    static void hello2(String firstName, String lastName, Runnable callback) {
        System.out.println(firstName);

        if (lastName != null) {
            System.out.println("Last name: " + lastName);
        } else {
            callback.run();
        }
    }
}
