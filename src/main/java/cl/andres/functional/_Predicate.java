package cl.andres.functional;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        String message = "Is phone number valid and contains 8: ";
        String phoneNumber1 = "07000000000";
        String phoneNumber2 = "0700000000";
        String phoneNumber3 = "09000687000";
        String phoneNumber4 = "07000687000";

        System.out.println(isPhoneNumberValid(phoneNumber1));
        System.out.println(isPhoneNumberValid(phoneNumber2));
        System.out.println(isPhoneNumberValid(phoneNumber3));
        System.out.println(isPhoneNumberValid(phoneNumber4));

        System.out.println(isPhoneNumberValidPredicate.test(phoneNumber1));
        System.out.println(isPhoneNumberValidPredicate.test(phoneNumber2));
        System.out.println(isPhoneNumberValidPredicate.test(phoneNumber3));
        System.out.println(isPhoneNumberValidPredicate.test(phoneNumber4));

        System.out.println(
                message
                + isPhoneNumberValidPredicate.and(phoneNumberContains).test(phoneNumber1)
        );

        System.out.println(
                message
                + isPhoneNumberValidPredicate.and(phoneNumberContains).test(phoneNumber2)
        );

        System.out.println(
                message
                + isPhoneNumberValidPredicate.and(phoneNumberContains).test(phoneNumber3)
        );

        System.out.println(
                message
                + isPhoneNumberValidPredicate.and(phoneNumberContains).test(phoneNumber4)
        );

        System.out.println(
                message
                + isPhoneNumberValidPredicate.or(phoneNumberContains).test(phoneNumber3)
        );
    }

    /**
     * Normal method
     *
     * @param phoneNumber
     * @return
     */
    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    /**
     * Functional interface
     */
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber
            -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    /**
     * Predicate
     */
    static Predicate<String> phoneNumberContains = phoneNumber
            -> phoneNumber.contains("8");
}
