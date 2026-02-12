Lista 03- Calsse, Objeto e Método

1) IMC da classe Pessoa:

import java.time.LocalDate;
import java.util.Scanner;

class Pessoa {
    private String nome;
    private int anoNascimento;
    private double peso;
    private double altura;

    public Pessoa(String nome, int anoNascimento, double peso, double altura) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIdade() {
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - anoNascimento;
    }

    public double calcIMC() {
        return peso / (altura * altura);
    }

    public String integraIMC() {
        double imc = calcIMC();

        if (imc < 18.5) {
            return "Magreza";
        } else if (imc < 25) {
            return "Normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else if (imc < 35) {
            return "Obesidade Grau I";
        } else if (imc < 40) {
            return "Obesidade Grau II";
        } else {
            return "Obesidade Grau III";
        }
    }

    public void exibeDados() {
        System.out.println("--- Dados da Pessoa ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + calcularIdade() + " anos");
        System.out.printf("IMC: %.2f%n", calcIMC());
        System.out.println("Classificação: " + integraIMC());
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Ano de Nascimento: ");
        int anoNascimento = sc.nextInt();
        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();
        System.out.print("Altura (m): ");
        double altura = sc.nextDouble();


        Pessoa pessoa = new Pessoa(nome, anoNascimento, peso, altura);
        
        pessoa.exibeDados();
        sc.close();
    }
}

02) Conta de banco:

public class Conta {

    private int numero;
    private String nomeTitular;
    private double saldo;

    
    public void cadastrarConta(int numero, String nomeTitular, double saldo) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}


03) Sistema de Alunos: 

import java.util.Scanner;

public class Aluno{
  private String nome;
  private int matricula;
  private char sexo;
  private int anoNascimento;
  private int mesNascimento;
  private boolean status;
  double nota01, nota02, nota03, nota04;
  
  
  double calcularMedia(){
    return (nota01 + nota02+ nota03 + nota04) / 4;
  }
  
  int calcularIdade(int anoAtual){
    return anoAtual - anoNascimento;
  }
  
  boolean seAprovado(){
    return calcularMedia() >= 7;
  }
}

public class SistemaAlunos{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    Aluno[] alunos = new Aluno[5];
    
    int inativos = 0;
    int ativos = 0;
    int aprovados = 0;
    int reporvados = 0;
    int anoAtual = 2026;
    
    for(int i=0;i<alunos.length;i++){
      alunos[i] = new Aluno;
      
      System.out.println("\nCadastro do aluno " + (i + 1));
      System.out.print("Matrícula: ");
      alunos[i].matricula = sc.nextLine();

      System.out.print("Nome: ");
      alunos[i].nome = sc.nextLine();

      System.out.print("Sexo: ");
      alunos[i].sexo = sc.nextLine();

      System.out.print("Ano de nascimento: ");
      alunos[i].anoNascimento = sc.nextInt();

      System.out.print("Mês de nascimento: ");
      alunos[i].mesNascimento = sc.nextInt();
      sc.nextLine();

      System.out.print("Status (ativo/inativo): ");
      alunos[i].status = sc.nextLine();

      System.out.print("Nota 1: ");
      alunos[i].nota1 = sc.nextDouble();

      System.out.print("Nota 2: ");
      alunos[i].nota2 = sc.nextDouble();

      System.out.print("Nota 3: ");
      alunos[i].nota3 = sc.nextDouble();

      System.out.print("Nota 4: ");
      alunos[i].nota4 = sc.nextDouble();
      sc.nextLine();
    }
    
    for(Aluno aluno : alunos){
      if(aluno.status.equalsIgnoreCase("ativo")){
        ativos++;
      }else{
        inativos++;
      }
      if(aluno.estaAprovado()){
        aprovados++;
      }else{
        reprovados++;
      }
    }
    
    System.out.println("\n===== DADOS DOS ALUNOS =====");

    for (Aluno aluno : alunos) {
      System.out.println("\n---------------------------");
      System.out.println("Matrícula: " + aluno.matricula);
      System.out.println("Nome: " + aluno.nome);
      System.out.println("Sexo: " + aluno.sexo);
      System.out.println("Idade: " + aluno.calcularIdade(anoAtual));
      System.out.println("Mês de nascimento: " + aluno.mesNascimento);
      System.out.println("Status: " + aluno.status);
      System.out.printf("Média: %.2f\n", aluno.calcularMedia());

      if (aluno.estaAprovado()) {
        System.out.println("Situação: APROVADO");
        } else {
            System.out.println("Situação: REPROVADO");
          }
        }
        System.out.println("\n===== RESUMO FINAL =====");
        System.out.println("Alunos ativos: " + ativos);
        System.out.println("Alunos inativos: " + inativos);
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);

        sc.close();
  }
}

04) Arredondamento Math:

public class Arredondamento{
  public static void main(String args[]){
    double valor1 = 5.2;
    double valor2 = 5.6;
    double valor3 = -5.8;
    
    long arred1 = Math.round(valor1);
    long arred2 = Math.round(valor2);
    long arred3 = Math.round(valor3);
    
    System.out.println("Valor: " + valor1 + " -> Arredondado: " + arred1);
    System.out.println("Valor: " + valor2 + " -> Arredondado: " + arred2);
    System.out.println("Valor: " + valor3 + " -> Arredondado: " + arred3);
  }
}

05) Arredondamento inteiro anterior; 

public class ArredondamentoAnterior {
  public static void main(String[] args) {
    double valor1 = 5.2;
    double valor2 = 5.6;
    double valor3 = -5.8;
  
    double arred1 = Math.floor(valor1);
    double arred2 = Math.floor(valor2);
    double arred3 = Math.floor(valor3);
  
    System.out.println("Valor: " + valor1 + " -> Inteiro anterior: " + arred1);
    System.out.println("Valor: " + valor2 + " -> Inteiro anterior: " + arred2);
    System.out.println("Valor: " + valor3 + " -> Inteiro anterior: " + arred3);
  }
}

06) Simuador de Dados: 

public class SimularDados{
  public static void main(String args[]){
    System.out.println("Simulacao Iniciada>>");
    for(int i=0;i<10;i++){
      int dado = (int)(Math.random() * 6) + 1;

      System.out.println("Jogada " + i + ": " + dado);
    }
  }
}

07) 
import java.util.Scanner;

class MaiorNumero {

    public static int calcularMaior(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int maior = MaiorNumero.calcularMaior(num1, num2);

        System.out.println("Maior número: " + maior);

        sc.close();
    }
}


08)
    
import java.util.Scanner;

class MenorNumero {

    public static int calcularMenor(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int menor = MenorNumero.calcularMenor(num1, num2);

        System.out.println("Menor número: " + menor);

        sc.close();
    }
}
`
09)

import java.util.Scanner;

class CaixaDAgua {

    public static int calcularVolume(double lado) {
        double volume = Math.pow(lado, 3);
        return (int) Math.floor(volume);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double lado = sc.nextDouble();

        int volume = CaixaDAgua.calcularVolume(lado);

        System.out.println(volume);

        sc.close();
    }
}

10)

class RaizQuadrada {

    public static double calcular(double numero) {
        return Math.sqrt(numero);
    }
}

public class Main {
    public static void main(String[] args) {

        double raiz1 = RaizQuadrada.calcular(900);
        double raiz2 = RaizQuadrada.calcular(30.25);

        System.out.println(raiz1);
        System.out.println(raiz2);
    }
}

11)

import java.util.Random;

class CartaoLoteria {

    public static int[] gerarCartao() {
        Random random = new Random();
        int[] numeros = new int[6];

        for (int i = 0; i < 6; i++) {
            numeros[i] = random.nextInt(60) + 1;
        }

        return numeros;
    }
}

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            int[] cartao = CartaoLoteria.gerarCartao();
            System.out.print("Cartão " + i + ": ");

            for (int numero : cartao) {
                System.out.print(numero + " ");
            }

            System.out.println();
        }
    }
}

12)

    import java.util.Scanner;

class Texto {

    public static String paraMaiusculo(String texto) {
        return texto.toUpperCase();
    }

    public static String paraMinusculo(String texto) {
        return texto.toLowerCase();
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String entrada = sc.nextLine();

        System.out.println(Texto.paraMaiusculo(entrada));
        System.out.println(Texto.paraMinusculo(entrada));

        sc.close();
    }
}

13)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome1 = sc.nextLine();
        String nome2 = sc.nextLine();

        if (nome1.equals(nome2)) {
            System.out.println("Os nomes são idênticos.");
        } else {
            System.out.println("Os nomes são diferentes.");
        }

        sc.close();
    }
}
  
14)

    
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String loginCorreto = "admin";
        String senhaCorreta = "admin";

        String login = sc.nextLine();
        String senha = sc.nextLine();

        if (login.equals(loginCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Bem-vindo");
        } else {
            System.out.println("Login/senha incorreto");
        }

        sc.close();
    }
}


15)

 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String texto = "Para quem deseja se tornar um desenvolvedor é importantíssimo planejar a carreira e mirar nos objetivos certos. "
                + "Então que caminho seguir? qual linguagem de programação devo aprender? O índice da TIOBE deve auxiliar vocês sobre o que deve estudar. "
                + "As duas primeiras posições são das linguagens JAVA e C, seguidas por C++ e C# - Fonte: http://sejalivre.org/ranking-das-linguagens-de-programacao/";

        while (true) {

            System.out.println("\na. Buscar palavra (busca comum)");
            System.out.println("b. Buscar palavra (Ignorando maiúsculas e minúsculas)");
            System.out.println("c. Sair");

            String opcao = sc.nextLine();

            if (opcao.equals("a")) {

                System.out.print("Digite a palavra ou frase: ");
                String busca = sc.nextLine();

                if (texto.contains(busca)) {
                    System.out.println("Encontrado no texto.");
                } else {
                    System.out.println("Não encontrado no texto.");
                }

            } else if (opcao.equals("b")) {

                System.out.print("Digite a palavra ou frase: ");
                String busca = sc.nextLine();

                if (texto.toLowerCase().contains(busca.toLowerCase())) {
                    System.out.println("Encontrado no texto.");
                } else {
                    System.out.println("Não encontrado no texto.");
                }

            } else if (opcao.equals("c")) {
                break;
            }
        }

        sc.close();
    }
}

##Desafio:

import java.util.Scanner;

class Cinema {

    private char[][] sala;

    public Cinema(int linhas, int colunas) {
        sala = new char[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                sala[i][j] = '-';
            }
        }
    }

    public boolean reservar(int fileira, int cadeira) {
        if (fileira < 0 || fileira >= sala.length ||
            cadeira < 0 || cadeira >= sala[0].length) {
            return false;
        }

        if (sala[fileira][cadeira] == 'X') {
            return false;
        }

        sala[fileira][cadeira] = 'X';
        return true;
    }

    public void mostrarMapa() {
        System.out.println("\nMapa da Sala:");
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                System.out.print(sala[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cinema cinema = new Cinema(10, 10);

        while (true) {

            cinema.mostrarMapa();

            System.out.print("\nDigite a fileira (0 a 9) ou -1 para sair: ");
            int fileira = sc.nextInt();

            if (fileira == -1) {
                break;
            }

            System.out.print("Digite a cadeira (0 a 9): ");
            int cadeira = sc.nextInt();

            boolean sucesso = cinema.reservar(fileira, cadeira);

            if (sucesso) {
                System.out.println("Reserva realizada com sucesso!");
            } else {
                System.out.println("Assento ocupado ou inválido. Tente novamente.");
            }
        }

        sc.close();
    }
}


