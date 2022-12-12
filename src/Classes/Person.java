package Classes;

import java.time.LocalDate;

public class Person {

    private int ID;
    private String lastName;
    private String firstName;
    private LocalDate birthDay;
    private String city;
    private String gender;

    //Constructor

    public Person(int ID, String lastName, String firstName, LocalDate birthDay, String city, String gender) {
        this.ID = ID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDay = birthDay;
        this.city = city;
        this.gender = gender;
    }
    public Person(){

    }


    //Getter&Setter

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //ToString

    @Override
    public String toString() {
        return "Person{" +
                "ID=" + ID +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", birthDay=" + birthDay +
                ", city='" + city + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public void print(){
        System.out.println(toString());
    }


}
