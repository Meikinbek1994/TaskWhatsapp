package Service;

import Classes.Person;

import java.util.List;


public interface PersonService {

    void createPassport();
    Person getPassportByFirstName(String firstName);
    List<Person> getAllPassport();




}
