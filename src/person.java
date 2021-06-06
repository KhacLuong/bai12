import javax.swing.*;
import java.time.DateTimeException;
import java.util.Date;
import java.util.Scanner;

public abstract class person{

    private int id;
    private String name;
    private String date;
    private String type;
    private int KW;
    private String phone;
    private int Wallet;

    public   final int price = 1500;
    public final int quato = 300;

    Scanner scanner = new Scanner(System.in);

    public person() {
    }

    public person(int id, String name, String date, String type, int KW, String phone, int wallet) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.type = type;
        this.KW = KW;
        this.phone = phone;
        this.Wallet = wallet;
    }

    public void input(){
        System.out.println("enter ID: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("enter name: ");
        name = scanner.nextLine();
        System.out.println("enter date: ");
        date = scanner.nextLine();
        System.out.println("enter type: ");
        type = scanner.nextLine();
        System.out.println("enter Kw: ");
        KW = scanner.nextInt();
        scanner.nextLine();
        System.out.println("enter phone(reject number '0' in start EXp: 123456789 ): ");
        phone = scanner.nextLine();
        System.out.println("enter wallet: ");
        Wallet= scanner.nextInt();
        scanner.nextLine();
    }
    public void Display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Date: " + date);
        System.out.println("Type: " + type);
        System.out.println("KW: " + KW);
        System.out.println("Phone: " + phone);
        System.out.println("Wallet: "+ Wallet);
    }
    public float pay(int wallet, float invoice){
    return  wallet -= invoice;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getKW() {
        return KW;
    }

    public void setKW(int KW) {
        this.KW = KW;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getWallet() {
        return Wallet;
    }

    public void setWallet(int wallet) {
        Wallet = wallet;
    }
}
