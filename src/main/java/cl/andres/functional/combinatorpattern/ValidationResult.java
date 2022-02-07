package cl.andres.functional.combinatorpattern;

public enum ValidationResult {
    SUCCESS("All fields are valid! :D"),
    INVALID_PHONE_NUMBER("Phone number is invalid :("),
    INVALID_EMAIL("Email is invalid :("),
    IS_NOT_ADULT("You are not an adult :(");

    private String message;

    ValidationResult(String message) {
        this.message = message;
    }
}
