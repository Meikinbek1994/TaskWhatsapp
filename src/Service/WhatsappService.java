package Service;

import Classes.Whatsapp;

import java.util.List;

public interface WhatsappService {


    List<Whatsapp> getAllWhatsapp();
    void goToProfile();
    void getWhatsappStatus();
    void installWhatsapp();
    void changeStatus();
    void addContact();
    void sendMessage();
    void seeStatus();




}
