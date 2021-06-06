import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class FGPerson extends person implements IElectricity{
    private String national;
    private String nationalId;

    public FGPerson() {
    }

    public FGPerson(int id, String name, String date, String type, int KW, String phone, int wallet, String national, String nationalId) {
        super(id, name, date, type, KW, phone, wallet);
        this.national = national;
        this.nationalId = nationalId;

    }

    @Override
    public void input() {
        super.input();
        System.out.println("enter National: ");
        national = scanner.nextLine();
        System.out.println("enter NationalId: ");
        nationalId = scanner.nextLine();

    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("National: " + national);
        System.out.println("NationalId" + nationalId);
    }

    @Override
    public float invoice(int num) {
        float invoice = 0;
        if(num <= quato){
            invoice = (float)(num*price*2.5);
        }
        else{
            invoice = (float) (quato*price*2.5 + (num -quato)*price*2.5*1.5);
        }
        return invoice;
    }

    @Override
    public  void retrivePhoneNumber() {
        System.out.println("Phone: +00" + getPhone());
    }
    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }


}
