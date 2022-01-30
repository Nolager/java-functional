package cl.andres.functional;

import cl.andres.functional.enums.Gender;
import cl.andres.functional.model.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Alice", Gender.FEMALE)
        );

        people.stream()
                .map(person -> person.getGender())
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        boolean allMatchAllFemales = people.stream()
                .allMatch(person -> Gender.FEMALE.equals(person.getGender()));

        boolean anyMatchOneMale = people.stream()
                .anyMatch(person -> Gender.MALE.equals(person.getGender()));

        boolean noneMatchOtherGender = people.stream()
                .noneMatch(person -> Gender.MALE.equals("Made up gender"));

        System.out.println("Are all the people female: " + allMatchAllFemales);
        System.out.println("Is there at least one male: " + anyMatchOneMale);
        System.out.println("None match: " + noneMatchOtherGender);
    }
}
