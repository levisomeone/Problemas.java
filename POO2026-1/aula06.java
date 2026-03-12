
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


q1) Construtores e Encapsulamento

  //class Funcionario
  public class Funcionario {

    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        if (salarioBase >= 0) {
            this.salarioBase = salarioBase;
        } else {
            this.salarioBase = 0;
        }
    }

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
        } else {
            System.out.println("Salário não pode ser negativo.");
        }
    }

    public double calcularSalario() {
        return salarioBase;
    }
}

//main
public class Main {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Carlos", 2500);

        System.out.println("Nome: " + f1.getNome());
        System.out.println("Salário: " + f1.calcularSalario());

        f1.setSalarioBase(3000);
        System.out.println("Novo salário: " + f1.calcularSalario());

        f1.setSalarioBase(-500);
    }
}


q2) Herança e Sobrescrita

  //@override //class Funcionario
  public class Funcionario {

    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        if (salarioBase >= 0) {
            this.salarioBase = salarioBase;
        } else {
            this.salarioBase = 0;
        }
    }

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

    public double calcularSalario() {
        return salarioBase;
    }
}

//class Gerente

public class Gerente extends Funcionario {

    private double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
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

public class Vendedor extends Funcionario {

    private double comissao;

    public Vendedor(String nome, double salarioBase, double comissao) {
        super(nome, salarioBase);
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

public class Main {
    public static void main(String[] args) {

        Gerente g = new Gerente("Ana", 5000, 1500);
        Vendedor v = new Vendedor("Carlos", 2000, 800);

        System.out.println("Salário do gerente: " + g.calcularSalario());
        System.out.println("Salário do vendedor: " + v.calcularSalario());
    }
}

q3) Enums e Composição

//Enum
  public enum Departamento {
    VENDAS,
    FINANCEIRO,
    RH
}

//class Funcionario
public class Funcionario {

    private String nome;
    private double salarioBase;
    private Departamento departamento;

    public Funcionario(String nome, double salarioBase, Departamento departamento) {
        this.nome = nome;

        if (salarioBase >= 0) {
            this.salarioBase = salarioBase;
        } else {
            this.salarioBase = 0;
        }

        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase >= 0) {
            this.salarioBase = salarioBase;
        }
    }

    public double calcularSalario() {
        return salarioBase;
    }
}

//main
public class Main {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario(
            "Carlos",
            3000,
            Departamento.VENDAS
        );

        System.out.println("Nome: " + f1.getNome());
        System.out.println("Departamento: " + f1.getDepartamento());
    }
}

q4) Java Collections e Polimorfismo

//main
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        Funcionario g1 = new Gerente("Ana", 5000, 1500, Departamento.FINANCEIRO);
        Funcionario g2 = new Gerente("Marcos", 4800, 1200, Departamento.RH);

        Funcionario v1 = new Vendedor("Carlos", 2000, 800, Departamento.VENDAS);
        Funcionario v2 = new Vendedor("Julia", 2200, 900, Departamento.VENDAS);

        funcionarios.add(g1);
        funcionarios.add(g2);
        funcionarios.add(v1);
        funcionarios.add(v2);

        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.getNome());
            System.out.println("Salário: " + f.calcularSalario());
            System.out.println("---------------------");
        }
    }
}

q5) Casting e Instanceof

//main
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

        listaFuncionarios.add(new Gerente("Ana", 5000, 1500, Departamento.FINANCEIRO));
        listaFuncionarios.add(new Gerente("Marcos", 4800, 1200, Departamento.RH));
        listaFuncionarios.add(new Vendedor("Carlos", 2000, 800, Departamento.VENDAS));
        listaFuncionarios.add(new Vendedor("Julia", 2200, 900, Departamento.VENDAS));       //Uma surpresa para está noite de quarta, Instanceof me parece realmente muito efetivo em código limpo

        for (Funcionario f : listaFuncionarios) {

            System.out.println(f.getNome() + " recebe: " + f.calcularSalario());

            if (f instanceof Gerente) {

                Gerente g = (Gerente) f;

                System.out.println("Bônus do gerente: " + g.getBonus());
            }

            System.out.println("---------------------");
        }
    }
}
