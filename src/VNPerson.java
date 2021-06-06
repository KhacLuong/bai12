import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class VNPerson extends person implements IElectricity{

    public VNPerson() {
        super();
    }

    public VNPerson(int id, String name, String date, String type, int KW, String phone, int wallet) {
        super(id, name, date, type, KW, phone, wallet);
    }

    @Override
    public void input() {
        super.input();
    }

    @Override
    public float invoice(int num) {
        float invoice = 0;
        if(num <= quato){
            invoice = num*price;
        }
        else{
            invoice = (float) (quato*price + (num -quato)*price*1.5);
        }
        return invoice;
    }



    @Override
    public void  retrivePhoneNumber() {
        System.out.println("Phone: +84" + getPhone());
            }

}
