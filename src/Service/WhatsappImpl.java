package Service;

import Classes.Whatsapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhatsappImpl implements WhatsappService{
    List<Whatsapp>whatsappList=new ArrayList<>();
    @Override
    public List<Whatsapp> getAllWhatsapp() {
        return whatsappList;
    }

    @Override
    public void goToProfile() {

    }

    @Override
    public void getWhatsappStatus() {

    }

    @Override
    public void installWhatsapp() {
        Scanner scanner=new Scanner(System.in);
        Whatsapp whatsapp=new Whatsapp();
        System.out.println("Write your passport ID: ");
        whatsapp.setID(Integer.parseInt(scanner.nextLine()));
        System.out.println("Write phone number: ");
        whatsapp.setPhoneNumber(Integer.parseInt(scanner.nextLine()));
        System.out.println("Create a password: ");
        whatsapp.setPassword(Integer.parseInt(scanner.nextLine()));
        System.out.println("Write user name: ");
        whatsapp.setUserName(scanner.nextLine());
        whatsapp.getWhatsappStatus();
        whatsapp.getImage();
        System.out.println("Whatsapp has successfully installed: ");
        whatsapp.print();
        whatsappList.add(whatsapp);
    }

    @Override
    public void changeStatus() {
        Scanner scanner=new Scanner(System.in);
        Whatsapp whatsapp=new Whatsapp();
        System.out.println("Write your whatsapp password: ");
        whatsapp.setPassword(Integer.parseInt(scanner.nextLine()));
        System.out.println("Your current status: ");
        whatsapp.getWhatsappStatus();
        System.out.println("Write new status: ");
        whatsapp.setWhatsappStatus(scanner.nextLine());
        System.out.println("Whatsapp status has successfully changed: ");
    }

    @Override
    public void addContact() {

    }

    @Override
    public void sendMessage() {

    }

    @Override
    public void seeStatus() {

    }
}
