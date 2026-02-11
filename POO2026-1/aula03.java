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
