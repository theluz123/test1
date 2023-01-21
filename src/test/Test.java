package test;

import java.util.Scanner;
public class Test {

  public static void main(String args[]){

        int odp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        odp = scanner.nextInt();
        switch(odp){
            case 1:
                System.out.println("Dzisiaj jest poniedziałek");
                break;
            case 2:
                System.out.println("Dzisiaj jest wtorek");
                break;
            case 3:
                System.out.println("Dzisiaj jest sroda");
                break;
            default:
                System.out.println("nie ma takiego tygodnia");
      }
  }

}
