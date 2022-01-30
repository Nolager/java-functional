package cl.andres.functional;

import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {
        String value = "John";
        String noValueMessage = "No value provided";

        System.out.println(Optional.ofNullable(value).orElse(noValueMessage));
        System.out.println(Optional.ofNullable(null).orElse(noValueMessage));
        System.out.println(Optional.ofNullable(null).orElseGet(() -> noValueMessage.concat("...")));

        Optional.ofNullable(value).ifPresent(System.out::println);
        Optional.ofNullable(null).ifPresent(System.out::println);
        Optional.ofNullable(null).orElseThrow(() -> new IllegalArgumentException("This is a made up exception"));
    }
}
