package cl.andres.functional.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Setter
@Getter
public class CustomerV2 {
    private String name;
    private String phoneNumber;
    private String email;
    private LocalDate dateOfBirth;
}
