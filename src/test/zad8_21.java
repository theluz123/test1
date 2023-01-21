package test;
import java.util.Scanner;
public class zad8_21 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imie");
        String imie = scan.next();
        System.out.println("podaj liczbe kotów");
        int koty = scan.nextInt();

        System.out.println(imie+ " ma " + koty + " kotow " );
    }
}
