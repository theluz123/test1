package test;
import java.util.Scanner;
public class imie {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Imie");
        String imie = scanner.next();
        int i = 0;
        while(i<10){
            System.out.println(imie);
            i++;
        }
    }
}
