package cl.andres.functional.model;

import cl.andres.functional.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class Person {
    private String name;
    private Gender gender;
}
