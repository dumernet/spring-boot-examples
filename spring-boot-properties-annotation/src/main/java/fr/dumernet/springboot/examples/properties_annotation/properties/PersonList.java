package fr.dumernet.springboot.examples.properties_annotation.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties(prefix = "person-list")
public class PersonList {

    private List<InternalPerson> personList;

    public PersonList() {
    }

    public PersonList(List<InternalPerson> personList) {
        this.personList = personList;
    }

    public List<InternalPerson> getPersonList() {
        return personList;
    }

    public void setPersonList(List<InternalPerson> personList) {
        this.personList = personList;
    }

    @Override
    public String toString() {
        return "PersonList{" +
                "personList=" + personList +
                '}';
    }

    public static class InternalPerson {

        private String firstName;

        private String lastName;

        public InternalPerson() {
        }

        public InternalPerson(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        @Override
        public String toString() {
            return "InternalPerson{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }

    }

}
