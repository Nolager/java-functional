package cl.andres.functional.combinatorpattern;

import cl.andres.functional.model.CustomerV2;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

/**
 * Efficient way to make validations using Function class.
 */
public interface CustomerValidatorCombinator extends Function<CustomerV2, ValidationResult> {

    static CustomerValidatorCombinator isEmailValid() {
        return customer -> customer.getEmail().contains("@")
                ? ValidationResult.SUCCESS : ValidationResult.INVALID_EMAIL;
    }

    static CustomerValidatorCombinator isPhoneNumberValid() {
        return customer -> customer.getPhoneNumber().contains("+0")
                ? ValidationResult.SUCCESS : ValidationResult.INVALID_PHONE_NUMBER;
    }

    static CustomerValidatorCombinator isAdult() {
        return customer -> Period.between(customer.getDateOfBirth(), LocalDate.now()).getYears() > 18
                ? ValidationResult.SUCCESS : ValidationResult.IS_NOT_ADULT;
    }

    default CustomerValidatorCombinator and(CustomerValidatorCombinator other) {
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(ValidationResult.SUCCESS) ? other.apply(customer) : result;
        };
    }
}