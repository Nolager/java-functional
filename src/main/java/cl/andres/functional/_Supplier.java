package cl.andres.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier.get());
        System.out.println(getDBConnectionsUrlSupplier.get());
    }

    /**
     * Normal method
     *
     * @return
     */
    static String getDBConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }

    /**
     * Functional interface
     */
    static Supplier<String> getDBConnectionUrlSupplier = () -> "jdbc://localhost:5432/users";

    /**
     * Functional interface
     */
    static Supplier<List<String>> getDBConnectionsUrlSupplier = ()
            -> Arrays.asList(
            "jdbc://localhost:5432/users",
            "jdbc://localhost:5432/animals"
    );
}
