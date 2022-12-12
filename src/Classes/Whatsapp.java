package Classes;

import java.util.List;

public class Whatsapp {

    private int ID;
    private int phoneNumber;
    private int password;
    private String userName;
    private List<Contact>contacts;
    private String whatsappStatus="Hi_I_AM_USING_WHATSAPP";
    private String image="DEFAULT_IMAGE";

    public Whatsapp(int ID, int phoneNumber, int password, String userName, String whatsappStatus, String image) {
        this.ID = ID;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.userName = userName;
        this.whatsappStatus=whatsappStatus;
        this.image=image;
    }
    public Whatsapp(){

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getWhatsappStatus(){
        return whatsappStatus;
    }
    public String setWhatsappStatus(String whatsappStatus){
        this.whatsappStatus=whatsappStatus;
        return whatsappStatus;
    }

    public String getImage(){
        return image;
    }
    public void setImage(String image){
        this.image=image;
    }

    @Override
    public String toString() {
        return "Whatsapp{" +
                "ID=" + ID +
                ", phoneNumber=" + phoneNumber +
                ", password=" + password +
                ", userName='" + userName + '\'' +
                ", contacts=" + contacts +
                ", whatsappStatus='" + whatsappStatus + '\'' +
                ", image='" + image + '\'' +
                '}';
    }

    public void print() {
        System.out.println(toString());
    }
}
