package Service;

import Classes.Person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonImpl implements PersonService {
    ArrayList<Person>people=new ArrayList<>();

    @Override
    public void createPassport() {
        Scanner scanner=new Scanner(System.in);
        Person person=new Person();

        System.out.println("Fill in the form");
        System.out.println("Write your ID: ");
        person.setID(Integer.parseInt(scanner.nextLine()));
        System.out.println("Write your last name: ");
        person.setLastName(scanner.nextLine());
        System.out.println("Write your first name: ");
        person.setFirstName(scanner.nextLine());
        System.out.println("Write your birthday(YYYY-MM-DD): ");
        String dateOfBirthStr=scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateOfBirth=LocalDate.parse(dateOfBirthStr,formatter);
        person.setBirthDay(dateOfBirth);
        System.out.println("Write your birth city: ");
        person.setCity(scanner.nextLine());
        System.out.println("Write your gender: ");
        person.setGender(scanner.nextLine());
        System.out.println("Your passport is ready: ");
        person.print();
        people.add(person);


    }

    @Override
    public Person getPassportByFirstName(String firstName) {
        for (Person p:people
             ) {
            if(p.getFirstName().equals(firstName)){
                p.print();
                //return p;
            }
        }return null;
    }

    @Override
    public List<Person> getAllPassport() {
        return people;
    }
}
