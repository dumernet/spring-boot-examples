package fr.dumernet.springboot.examples.properties_annotation.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "person-list")
public class PersonList {

    private List<InternalPerson> personList;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class InternalPerson {

        private String firstName;

        private String lastName;

    }

}
