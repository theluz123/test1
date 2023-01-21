package test;
import java.util.Scanner;
public class zad3_21 {
    public static void main(String args[]){
        int cyfra;
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj cyfre");
        cyfra = scanner.nextInt();
        String[] tablica = new String [cyfra];
        System.out.println("podaj imie");
        tablica[0] = scanner.next();
        System.out.println("podaj imie 2");
        tablica[1] = scanner.next();
        System.out.println("podaj imie 3");
        tablica[2] = scanner.next();
        System.out.println("podaj imie 4");
        tablica[3] = scanner.next();
        for (int i = 0; i < tablica.length; i++){
            System.out.println(tablica[i]);
        }

    }
}
