#bytecode, jdk 25v, initial-const:true;

/*
  Slide aula01.POO2026-1
  Algaworks: 6 a 11 capitulos;
*/


import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int tabuada = scanner.nextInt();
      for(int x=0;x<=10;x++){
        System.out.println("Tabuada do: " + tabuada);
        System.out.println(x + "x" + tabuada);
        System.out.println( x * tabuada);
      }
      System.out.println(".");
    }
}

import java.util.Scanner;

public class Main {
    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limite = scanner.nextInt();
        int contadorPrimos = 0;
        
        System.out.println("Limite para " + limite + ":");
        for (int i = 2; i <= limite; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
                contadorPrimos++;
            }
        }
        
        System.out.println("\nTotal de primos: " + contadorPrimos);
        scanner.close();
    }
}

import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    double[] v = new double[10];
    int contador = 0;
    for(int i=0;i<v.length;i++){
      if(scanner.hasNextDouble()){
        v[i] = scanner.nextDouble();
        if(v[i] < 7){
          contador++;
        }
      }
    }
    System.out.println("10 notas arquivadas");
    System.out.println(contador + " Reprovaram");
  }
}
