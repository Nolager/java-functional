package cl.andres.functional.combinatorpattern;

import cl.andres.functional.model.CustomerV2;

import java.time.LocalDate;

public class CombinatorPattern {
    public static void main(String[] args) {
        CustomerV2 customer = new CustomerV2(
                "John",
                "+012345679",
                "johngmail.com",
                LocalDate.of(1980, 1, 1));

        // Normal validation
        System.out.println(new CustomerValidatorService().isValid(customer));

        // Validation using combinator pattern with Function class
        ValidationResult result = CustomerValidatorCombinator
                .isEmailValid()
                .and(CustomerValidatorCombinator.isPhoneNumberValid())
                .and(CustomerValidatorCombinator.isAdult())
                .apply(customer);

        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }

        System.out.println(result);
    }
}
