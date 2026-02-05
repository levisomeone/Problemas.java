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
