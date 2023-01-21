package test;

import java.util.Scanner;
public class zad4_21 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int tab[] = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.println("podaj liczbe");
            tab[i] = Integer.parseInt(scan.nextLine());
        }

    for (int i=tab.length-1; i>=0; i--)
        System.out.print(tab[i] + "  ");
    }
}
// wczytaj do tablicy 10 cyfr, a potem wyswietl je w odwrotnej kolejnosci.