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

