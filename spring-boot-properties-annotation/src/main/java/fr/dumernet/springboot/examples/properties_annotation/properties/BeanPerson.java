package fr.dumernet.springboot.examples.properties_annotation.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BeanPerson {

    private String firstName;

    private String lastName;

}
