#bytecode, jdk 25v, initial-const:true;

/*
  Slide aula01.POO2026-1
  Algaworks: 6 a 11 capitulos;
*/

Qtt07- Programa de verificação de idade eleitoral

import java.util.Scanner;

public class ClasseEleitoral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();

        if (idade < 16) {
            System.out.println("Nao pode votar");
        } else if ((idade >= 16 && idade <= 17) || idade > 65) {
            System.out.println("Voto facultativo");
        } else {
            System.out.println("Voto obrigatorio");
        }
    }
}


Qtt08- Sequencia de Fibonacci com limite
  
public class Fibonacci {
    public static void main(String[] args) {
        long a = 1, b = 1;

        System.out.print(a + " " + b);

        for (int i = 3; i <= 30; i++) {
            long c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}

Qtt09- Tabuada do x10

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

Qtt10- Contagem de Números primos

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

  Qtt11- Media de Notas

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

Qtt12- Solicitando números positivos

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

Qtt13- Matriz identidade 5x5

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

Qtt14- Tabuleiro de tabuada

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

Qtt15- Analisador de Alturas

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

Qtt16- Pirâmide de Astericos

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

Qtt17- Busca Binária

import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

Qtt18- Separador de Pares e Impares

import java.util.Scanner;

public class Busca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v = {3, 7, 12, 18, 25, 31, 40, 56, 72, 90};

        int x = sc.nextInt();
        int pos = -1;

        for (int i = 0; i < v.length; i++) {
            if (v[i] == x) {
                pos = i;
                break;
            }
        }

        if (pos != -1) {
            System.out.println("O numero " + x + " posicao" + pos);
        } else {
            System.out.println("O numero " + x + " nao foi encontrado");
        }
    }
}

Qtt19- Inversor de Sequência

import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v = new int[10];
        int[] pares = new int[10];
        int[] impares = new int[10];

        int p = 0, i = 0;

        for (int j = 0; j < 10; j++) {
            v[j] = sc.nextInt();
        }

        for (int j = 0; j < 10; j++) {
            if (v[j] % 2 == 0) {
                pares[p++] = v[j];
            } else {
                impares[i++] = v[j];
            }
        }

        System.out.println("Pares:");
        for (int j = 0; j < p; j++) {
            System.out.print(pares[j] + " ");
        }

        System.out.println("\nImpares:");
        for (int j = 0; j < i; j++) {
            System.out.print(impares[j] + " ");
        }
    }
}

Qtt20- Gabarito de Prova

import java.util.Scanner;

public class Inversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[10];

        for (int i = 0; i < 10; i++) {
            nomes[i] = sc.nextLine();
        }

        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.println(nomes[i]);
        }
    }
}

Qtt21- Mapa do Tesouro

import java.util.Scanner;

public class Gabarito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] gabarito = {'A', 'B', 'C', 'D', 'E'};
        char[] resposta = new char[5];

        int nota = 0;

        for (int i = 0; i < 5; i++) {
            resposta[i] = sc.next().charAt(0);
        }

        for (int i = 0; i < 5; i++) {
            if (resposta[i] == gabarito[i]) {
                nota += 2;
            }
        }

        System.out.println("Nota: " + nota);
    }
}

Qtt??- ?

import java.util.Scanner;
import java.util.Random;

public class MapaTesouro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int[][] mapa = new int[3][3];

        int linhaTesouro = rd.nextInt(3);
        int colunaTesouro = rd.nextInt(3);

        mapa[linhaTesouro][colunaTesouro] = 1;

        int linha = sc.nextInt();
        int coluna = sc.nextInt();

        if (mapa[linha][coluna] == 1) {
            System.out.println("Tesouro encontrado!");
        } else {
            System.out.println("Agua...");
        }
    }
}

Qtt22- Diagonal Principal e Secundária

import java.util.Scanner;

public class Diagonais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] m = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        int somaPrincipal = 0;
        int somaSecundaria = 0;

        for (int i = 0; i < n; i++) {
            somaPrincipal += m[i][i];
            somaSecundaria += m[i][n - 1 - i];
        }

        System.out.println("Diagonal principal: " + somaPrincipal);
        System.out.println("Diagonal secundaria: " + somaSecundaria);
    }
}

