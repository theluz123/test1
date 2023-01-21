package test;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;
public class zad6_21 {
    public static void main(String args[]){
        LinkedList m = new LinkedList();
        Random generator = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int liczba = Integer.parseInt(scan.next());

        for (int i=0; i<1; i++){
            m.add(generator.nextInt(liczba));
        }
        System.out.println(m);

    }
}

// Zadanie: Wygeneruj liczbe z przedziału który podasz.
// liczby pseudolosowe beda na kolosie OMG!!