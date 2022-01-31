package cl.andres.functional.combinatorpattern;

import cl.andres.functional.model.CustomerV2;

import java.time.LocalDate;

public class CombinatorPattern {
    public static void main(String[] args) {
        CustomerV2 customer = new CustomerV2(
                "John",
                "+012345679",
                "john@gmail.com",
                LocalDate.of(1980, 1, 1));

        System.out.println(new CustomerValidatorService().isValid(customer));
    }
}
