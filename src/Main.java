import Classes.Person;
import Service.PersonImpl;
import Enum.Country;
import Service.WhatsappImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        PersonImpl service=new PersonImpl();
        WhatsappImpl service1=new WhatsappImpl();
        while(true){
        command();
            System.out.println("Write command: ");
           switch (scanner.nextInt()){
                case 1:
                    System.out.println(service.getAllPassport());
                case 2:
                    System.out.println("Write first name: ");
                    System.out.println(service.getPassportByFirstName(scanner.next()));
                case 3:
                    System.out.println(service1.getAllWhatsapp());
                case 4:
                    //Go to your profile
                case 5:
                    //Get all city
                case 6:
                    service1.getWhatsappStatus();
                case 7:
                    service.createPassport();
                case 8:
                    service1.installWhatsapp();
                case 9:
                    service1.changeStatus();
                case 10:
                    //Add contact
                case 11:
                    //Send a message
                case 12:
                    //See status
            }
        }
    }

    public static void command(){
        System.out.println(">>>>>>>>>>>>>Commands<<<<<<<<<<<<");
        System.out.println("1 - Get all passports");
        System.out.println("2 - Get passport by first name");
        System.out.println("3 - Get all whatsapp");
        System.out.println("4 - Go to your profile");
        System.out.println("5 - Get all city");
        System.out.println("6 - Get whatsapp status");
        System.out.println("7 - Create a passport");
        System.out.println("8 - Install whatsapp");
        System.out.println("9 - Change status");
        System.out.println("10 -Add contact");
        System.out.println("11 - Send a message");
        System.out.println("12 - See status");
    }




}