Classes abstratas: ocupa característica comum porém não implícita, podendo ou não ser herdado por outra classe
  
java  
    abstract class Animal {
    protected String nome;
    protected int idade;
    public void respirar() {
    System.out.println(nome + " está respirando...");
    }
    
    public void dormir() {
    System.out.println(nome + " está dormindo zzz...");
    
    }
    
    public boolean ehAdulto() {
    return idade >= 2;
    
    }
    // ===== MÉTODO ABSTRATO (sem implementação) =====
    public abstract void fazerSom();
    public abstract void mover();

Métodos abstratos: classes abstratas podem prover métodos abstratos que devem ser implementados
a todas as subclasses, sem apresentar implementação do mesmo.

! Para que uma subclasse de uma classe abstrata seja concreta, ela deve obrigatoriamente apresentar implementações concretas para
todos os métodos abstratos de sua superclasse.

Associações: ligações entre classes, se utilizam associações quando desejamos representar relacionamentos que existam entre objetos de duas classes
distintas.
 * Um Curso tem Disciplinas;

 * Um Produto é de uma Marca;

A associação é um tipo de estruturação de classes que facilita o reuso de código.

! Não confunda o conceito de herança com o de associação:

A herança é um tipo de estruturação entre classes que indica que um objeto “é” de um certo tipo, contendo algumas especializações.
Uma ContaEspecial, por exemplo, é um tipo de Conta. Assim, para representar essa estruturação utilizamos herança. Já Cliente
não é um tipo de Conta e nem Conta é um tipo de Cliente.


Interface: Uma interface é um contrato que define um conjunto de métodos que uma classe deve implementar. É uma forma de garantir que
classes diferentes tenham comportamentos compatíveis.

  java
      // Interface == contrato
      Public interface Conectavel {
      void ligar();
      void desligar();
      }
      // Classes que "assinam" o contrato
      class Geladeira implements Conectavel {
      public void ligar() { System.out.println("Geladeira refrigerando"); }
      public void desligar() { System.out.println("Geladeira parada"); }
      
      }
      class Televisao implements Conectavel {
      public void ligar() { System.out.println("TV ligando..."); }
      public void desligar() { System.out.println("TV desligando..."); }
      }



