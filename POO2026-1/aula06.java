Q1) Explique o conceito de encapsulamento.
  ncapsulamento é um dos pilares da programação orientada a objetos. Ele consiste em esconder os detalhes internos de uma classe e permitir o acesso aos dados apenas por meio de métodos controlados.
  Ou seja, em vez de acessar diretamente os atributos (variáveis), você utiliza métodos públicos para interagir com eles, garantindo mais segurança, organização e controle.

Q2) Para que serve os gets e sets?
  Os getters (get) e setters (set) são métodos usados para acessar e modificar atributos privados de uma classe.

  Getter: retorna o valor de um atributo
  Setter: altera o valor de um atributo (geralmente com validação)


q1) ContaBancaria

//class ContaBancaria
  import java.util.ArrayList;

public class ContaBancaria {

    private int numeroConta;
    private String titular;
    private double saldo;

    private ArrayList<String> historico;

    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0;
        this.historico = new ArrayList<>();
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            historico.add("Depósito de " + valor);
        } else {
            historico.add("Tentativa de depósito inválido: " + valor);
        }
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            historico.add("Saque de " + valor);
        } else {
            historico.add("Tentativa de saque falha: saldo insuficiente");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void imprimirExtrato() {
        System.out.println("Extrato da conta: " + numeroConta);
        System.out.println("Titular: " + titular);

        for (String operacao : historico) {
            System.out.println(operacao);
        }

        System.out.println("Saldo atual: " + saldo);
    }
}

//main
public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria(12345, "Carlos");

        conta.depositar(100);
        conta.depositar(50);
        conta.sacar(30);
        conta.sacar(200);

        conta.imprimirExtrato();
    }
}

Desafio) Desafio porposto pelo Professor Vinícius Nunes, matéria de Programaçao Orientada a Objetos;

##Contexto do Sistema
Você deve desenvolver um Sistema de Gestão de Tickets de Suporte
para uma empresa de software. O sistema deve organizar os chamados
por prioridade e armazená-los em memória.

#a. Estrutura de Pacotes e Enumerações
  
 Crie um pacote chamado software.modelo.
 Dentro deste pacote, crie uma Enumeração chamada Prioridade
com os valores: BAIXA, MEDIA, ALTA e URGENTE.
  
 Adicione um atributo inteiro prazoHoras a cada constante da
Enum (ex: BAIXA = 72h, URGENTE = 4h). Crie um construtor na
Enum e um método getter para esse atributo.
  
#b. Encapsulamento e Construtores
  
 No mesmo pacote, crie a classe Ticket.
  
 Aplique o Encapsulamento: Atributos devem ser private.
  o int id (deve ser gerado automaticamente);
  o String descricao;
  o Prioridade prioridade;
  o static int contador (Modificador static para controlar o ID
  global).

 Implemente um Construtor que receba apenas a descrição e a
prioridade. O ID deve ser atribuído usando o valor atual do
contador e, em seguida, incremente o contador.
  
 Implemente os métodos getters e setters necessários. No
setDescricao, não permita strings vazias.
  
#c. Modificadores e Regras de Negócio
  
 Na classe Ticket, crie uma constante (final) que defina o nome do
sistema (ex: &quot;SISTEMA_SUPORTE_V1&quot;).

 Crie um método chamado exibirDetalhes() que retorne uma String
com todas as informações do ticket, incluindo o prazo em horas
(buscado da Enum).
  
#d. Java Collections Framework
  
 Crie um novo pacote chamado software.gestao.
 Crie a classe GerenciadorTickets.
  
 Utilize um ArrayList&lt;Ticket&gt; para armazenar os chamados.
 Implemente os métodos:

#a. adicionarTicket(Ticket t): Adiciona o objeto à lista.
#b. removerTicket(int id): Remove o ticket da lista que possuir
o ID informado.
#c. listarPorPrioridade(Prioridade p): Retorna uma nova lista
contendo apenas os tickets daquela prioridade.
#d. contarTotal(): Retorna o total de tickets usando o atributo
static da classe Ticket.
  
#e. Classe Principal (Main)

 Crie o pacote software.main e a classe SistemaPrincipal.
 No método main:
  
a. Instancie o GerenciadorTickets.
b. Crie pelo menos 5 tickets com prioridades diferentes.
c. Adicione-os ao gerenciador.
d. Imprimir a lista de tickets na tela.
e. Remova um ticket e mostre o total atualizado.
  
#f. Para Finalizar...
 Implemente uma ordenação na lista de tickets para que, ao listar,
os tickets de prioridade URGENTE apareçam sempre no topo da
lista (Dica: Use Collections.sort() e a interface Comparable).

//estrutura usada:
software
 ├─ modelo
 │   ├─ Prioridade.java
 │   └─ Ticket.java
 │
 ├─ gestao
 │   └─ GerenciadorTickets.java
 │
 └─ main
     └─ SistemaPrincipal.java

//software/modelo/Prioridade.java
package software.modelo;

public enum Prioridade {

    BAIXA(72),
    MEDIA(48),
    ALTA(24),
    URGENTE(4);

    private int prazoHoras;

    Prioridade(int prazoHoras) {
        this.prazoHoras = prazoHoras;
    }

    public int getPrazoHoras() {
        return prazoHoras;
    }
}

//software/modelo/Ticket.java
package software.modelo;

public class Ticket implements Comparable<Ticket> {

    private int id;
    private String descricao;
    private Prioridade prioridade;

    private static int contador = 1;

    public static final String SISTEMA = "SISTEMA_SUPORTE_V1";

    public Ticket(String descricao, Prioridade prioridade) {
        this.id = contador++;
        setDescricao(descricao);
        this.prioridade = prioridade;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public static int getContador() {
        return contador - 1;
    }

    public void setDescricao(String descricao) {
        if (descricao != null && !descricao.isEmpty()) {
            this.descricao = descricao;
        }
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public String exibirDetalhes() {
        return "ID: " + id +
               " | Descrição: " + descricao +
               " | Prioridade: " + prioridade +
               " | Prazo: " + prioridade.getPrazoHoras() + "h";
    }

    @Override
    public int compareTo(Ticket outro) {
        return outro.prioridade.ordinal() - this.prioridade.ordinal();
    }
}

//software/gestao/GerenciadorTickets.java
package software.gestao;

import java.util.ArrayList;
import java.util.Collections;
import software.modelo.Ticket;
import software.modelo.Prioridade;

public class GerenciadorTickets {

    private ArrayList<Ticket> tickets = new ArrayList<>();

    public void adicionarTicket(Ticket t) {
        tickets.add(t);
    }

    public void removerTicket(int id) {

        Ticket remover = null;

        for (Ticket t : tickets) {
            if (t.getId() == id) {
                remover = t;
                break;
            }
        }

        if (remover != null) {
            tickets.remove(remover);
        }
    }

    public ArrayList<Ticket> listarPorPrioridade(Prioridade p) {

        ArrayList<Ticket> lista = new ArrayList<>();

        for (Ticket t : tickets) {
            if (t.getPrioridade() == p) {
                lista.add(t);
            }
        }

        return lista;
    }

    public int contarTotal() {
        return Ticket.getContador();
    }

    public void listarTodos() {

        Collections.sort(tickets);

        for (Ticket t : tickets) {
            System.out.println(t.exibirDetalhes());
        }
    }
}

//software/main/SistemaPrincipal.java
package software.main;

import software.modelo.*;
import software.gestao.*;

public class SistemaPrincipal {

    public static void main(String[] args) {

        GerenciadorTickets gerenciador = new GerenciadorTickets();

        Ticket t1 = new Ticket("Erro no login", Prioridade.ALTA);
        Ticket t2 = new Ticket("Página lenta", Prioridade.MEDIA);
        Ticket t3 = new Ticket("Sistema caiu", Prioridade.URGENTE);
        Ticket t4 = new Ticket("Atualização solicitada", Prioridade.BAIXA);
        Ticket t5 = new Ticket("Erro no banco de dados", Prioridade.URGENTE);

        gerenciador.adicionarTicket(t1);
        gerenciador.adicionarTicket(t2);
        gerenciador.adicionarTicket(t3);
        gerenciador.adicionarTicket(t4);
        gerenciador.adicionarTicket(t5);

        System.out.println("LISTA DE TICKETS:");
        gerenciador.listarTodos();

        System.out.println("\nRemovendo ticket ID 2...");
        gerenciador.removerTicket(2);

        System.out.println("\nTOTAL DE TICKETS: " + gerenciador.contarTotal());
    }
}

## Conceitos Usados no Exercício:


| Conceito | Onde foi usado |
|--------|----------------|
| Enum | Classe `Prioridade` para definir níveis de prioridade dos tickets |
| Encapsulamento | Atributos `private` na classe `Ticket` |
| static | Contador global de IDs (`contador`) na classe `Ticket` |
| final | Constante do sistema `SISTEMA_SUPORTE_V1` |
| Pacotes | Organização em `software.modelo`, `software.gestao`, `software.main` |
| Collections | Uso de `ArrayList` para armazenar os tickets |
| Comparable | Implementado em `Ticket` para permitir ordenação por prioridade |
| Collections.sort() | Utilizado para ordenar os tickets antes de listá-los |
