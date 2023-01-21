package test;
import java.util.Scanner;
public class zad9_21 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int tab[] = new int[10];
        for (int i = 0; i < 10; i++){
            System.out.println("podaj liczbe");
            tab[i] = Integer.parseInt(scan.nextLine());
        }
        for (int i=0; i < 10; i++)
            System.out.print(tab[i] + "  ");
    }
}
// Zadanie 10 jako zadanie domowe i ma być funkcja continue uzyta