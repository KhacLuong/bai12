

import java.util.ArrayList;
import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class Application {
    public static void main(String[] args) {
        ArrayList vnperson = new ArrayList();
        ArrayList fgperson = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        int choice =0;
        do {
            System.out.println("Enter your choice to the direction under here ");
            System.out.println("choice 1: Enter Vietnamese Customer's information ");
            System.out.println("choice 2: Enter Foreign Customer's information");
            System.out.println("choice 0: finish enter Customer's information");
            System.out.println("---------------");
            System.out.println("enter yours choice: ");
            choice = scanner.nextInt();
            System.out.println();
            switch (choice){

                case 1:{
                    System.out.println("Enter Vietnamese Customer's information ");
                    VNPerson _VNCus = new VNPerson();
                    _VNCus.input();
                    vnperson.add(_VNCus);
                    break;
                }
                case 2:{
                    System.out.println("Enter Foreign Customer's information ");
                    FGPerson _FGCus = new FGPerson();
                    _FGCus.input();
                    fgperson.add(_FGCus);
                    break;
                }
                case 0:{
                    System.out.println(" Finish enter Customer's information");
                    System.out.println("-----------------------");
                    break;
                }
                default:{
                    System.out.println(" choice 0-3, choice again, please..!");
                    break;
                }
            }

        }while (choice != 0);

        for(Object _o: vnperson){
            VNPerson _VNCus = (VNPerson)_o;
            _VNCus.Display();
            System.out.println("invoice: " +_VNCus.invoice(_VNCus.getKW()));
            System.out.println();
        }
        System.out.println();
        for(Object _o: fgperson){
            FGPerson _FGCus = (FGPerson)_o;
            _FGCus.Display();
            System.out.println("invoice: " +_FGCus.invoice(_FGCus.getKW()));
            System.out.println();
        }
        System.out.println("-------------------------");
        for(Object _o: vnperson){
            VNPerson _VNCus = (VNPerson)_o;
            _VNCus.retrivePhoneNumber();
            System.out.println("invoice: " +_VNCus.invoice(_VNCus.getKW()));
            if(_VNCus.getWallet()>=_VNCus.invoice(_VNCus.getKW())){
                System.out.println("Payment success");
                System.out.println("balance in wallet:"+_VNCus.pay(_VNCus.getWallet(),_VNCus.invoice(_VNCus.getKW())));
            }
            else{
                System.out.println("payment failed ");
                System.out.println("insufficient balance");
            }
            System.out.println();
        }
        System.out.println();
        for(Object _o: fgperson){
            FGPerson _FGCus = (FGPerson)_o;
            _FGCus.retrivePhoneNumber();
            System.out.println("invoice: " +_FGCus.invoice(_FGCus.getKW()));
            if(_FGCus.getWallet()>=_FGCus.invoice(_FGCus.getKW())){
                System.out.println("Payment success");
                System.out.println("balance in wallet:"+_FGCus.pay(_FGCus.getWallet(),_FGCus.invoice(_FGCus.getKW())));
            }
            else{
                System.out.println("payment failed ");
                System.out.println("insufficient balance");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
        float Average =0;
        for(Object _o: fgperson ){
            FGPerson _FGCus = (FGPerson)_o;
            Average += _FGCus.invoice(_FGCus.getKW());
        }
        System.out.println("average revenue from foreigners: " + Average/fgperson.size());

    }
}
