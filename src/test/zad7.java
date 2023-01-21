package test;
import java.util.Scanner;
import java.util.Random;
public class zad7 {
    public static void main(String args[]){
    Random losowaLiczba = new Random();
    int wynik = losowaLiczba.nextInt(3);
    System.out.println("Wylosowana liczba: "+wynik);
    if (wynik==0){
        System.out.println("wygrales!");
    }
    else {
        System.out.println("przegrales!");
    }
    }
}




// Zadanie: Wygeneruj liczbe i jezeli wygenerowana liczba ma 0 to powinna sie pojawic info ze wygrales a jak nei to ze przegrales