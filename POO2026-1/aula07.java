
Escrita:
1) Explique os conceitos abaixo:
a. Herança;
b. Polimorfismo;
c. Sobrecarga de métodos;
d. Sobrescrita de métodos;

a.A herança é um princípio que busca a criação de classes provenientes de classes já criadas anteriormente, podendo herdar métodos e atributos do pai que seria a superclasse, o filho
  se denominando subclasse

b.Polimorfisto é um conceito de abstração que te permite agir de formas diferentes para um mesmo atríbuto, em suma, um objeto ele pode se comportar de maneira diferente dependendo da mensagem que recebe

c.A Sobrecarga de métodos determina um modelo de utilização de variaçôes de um memso método, permite por exemplo que usemos o nome em mais de um método contanto que as listas adjascentes e argumentos estejam diferentes para sua separação

d.Sobrescrita de métodos consiste na permissão de reescrever um método, eles devem possuir o mesmo nome e semântica, porém acontecerá o mesmo incremento na classe com especificações próprias.


//class Funcionario
  enum Departamento {
    VENDAS,
    FINANCEIRO,
    RH
}

class Funcionario {
    private String nome;
    private double salarioBase;
    private Departamento departamento;

    // Construtor obrigatório com departamento
    public Funcionario(String nome, double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.departamento = departamento;

        if (salarioBase >= 0) {
            this.salarioBase = salarioBase;
        } else {
            this.salarioBase = 0;
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase >= 0) {
            this.salarioBase = salarioBase;
        }
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public double calcularSalario() {
        return salarioBase;
    }
}

//class Gerente
class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salarioBase, Departamento departamento, double bonus) {
        super(nome, salarioBase, departamento);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }
}

//class Vendedor
class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, double salarioBase, Departamento departamento, double comissao) {
        super(nome, salarioBase, departamento);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + comissao;
    }
}

//main
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Funcionario> lista = new ArrayList<>();

        Funcionario g1 = new Gerente("Carlos", 5000, Departamento.FINANCEIRO, 2000);
        Funcionario g2 = new Gerente("Ana", 6000, Departamento.RH, 1500);

        Funcionario v1 = new Vendedor("João", 3000, Departamento.VENDAS, 800);
        Funcionario v2 = new Vendedor("Maria", 3500, Departamento.VENDAS, 1000);

        lista.add(g1);
        lista.add(g2);
        lista.add(v1);
        lista.add(v2);

        for (Funcionario f : lista) {
            System.out.println("Nome: " + f.getNome());
            System.out.println("Salário: " + f.calcularSalario());
            System.out.println("-------------------");
        }
    }
}
