package cl.andres.functional;

import cl.andres.functional.model.Customer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "0123456789");
        greetCostumer(maria);
        greetCostumerConsumer.accept(maria);
        greetCostumerBiConsumer.accept(maria, false);
    }

    /**
     * Normal method
     *
     * @param customer
     */
    static void greetCostumer(Customer customer) {
        System.out.println("Hello " + customer.getName()
                + ", thanks for register phone number " + customer.getPhoneNumber());
    }

    /**
     * Functional interface
     */
    static Consumer<Customer> greetCostumerConsumer = customer
            -> System.out.println("Hello " + customer.getName()
            + ", thanks for register phone number " + customer.getPhoneNumber());

    /**
     * BiConsumer
     */
    static BiConsumer<Customer, Boolean> greetCostumerBiConsumer = (customer, aBoolean) -> {

        String message = "Hello " + customer.getName()+ ", thanks for register phone number ";
        message = message.concat((aBoolean) ? customer.getPhoneNumber() : "**********");

        System.out.println(message);
    };
}
