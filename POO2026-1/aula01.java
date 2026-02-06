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

import java.util.*;

public class ContadorMediaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;
        int qtd = 0;

        while(true) {
            System.out.print("Numero: ");
            num = scanner.nextInt();
            
            if (num < 0) {
                break;
            }
            
            sum += num;
            qtd++;
        }

        System.out.println("=-=-=-=-=-=-=-=");
        
        if (qtd > 0) {
            double media = (double) sum / qtd;
            System.out.println("Quantidade: " + qtd);
            System.out.println("Media: " + media);
        } else {
            System.out.println("Numeros positivos nao digitados");
        }
        
        scanner.close();
    }
}

import java.util.*;

public class MatrizIdentidade{
  public static void main(String args[]){
    int tam = 5;
    int[][] iden = new int[tam][tam];
    
    for(int i=0;i<tam;i++){
      for(int j=0;j<tam;j++){
        if(i==j){
          iden[i][j] = 1;
        }else{
          iden[i][j] = 0;
        }
      }
    }
    System.out.println("Matriz Identidade 5x5\n");
    for(int i=0;i<tam;i++){
      for(int j=0;j<tam;j++){
        System.out.print(iden[i][j] + " ");
      }
    }
    System.out.println();
  }
}

import java.util.Scanner;

public class TabuadaDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.println("=-=-=-=-=");
            num = scanner.nextInt();

            if (num < 1 || num > 10) {
                System.out.println("\u001B[31m Erro: Número fora do intervalo; Tente novamente. \u001B[0m");
            }
        } while (num < 1 || num > 10);

        System.out.println("\nTabuada do " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        scanner.close();
    }
}

import java.util.Scanner;
import java.util.Locale;

public class AnalisadorDeAlturas {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double maiorAltura = Double.MIN_VALUE;
        double menorAltura = Double.MAX_VALUE;
        int totalPessoas = 10;

        System.out.print("-=-=-=-=");
        System.out.println("Digite as alturas: ");

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.print("Altura " + i + ": ");
            double altura = sc.nextDouble();
            sum += altura;

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
            }
        }

        double media = sum / totalPessoas;

        System.out.println("\n--- Resultados ---");
        System.out.printf("Maior altura: %.2f m\n", maiorAltura);
        System.out.printf("Menor altura: %.2f m\n", menorAltura);
        System.out.printf("Média das alturas: %.2f m\n", media);

        sc.close();
    }
}

