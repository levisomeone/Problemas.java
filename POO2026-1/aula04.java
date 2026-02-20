ArrayList e Frameworks Collection
  #coleções armazenam e manipulam dados objetos;
  #serve para minimizar esforço em programação, traz várias interfaces de problemas;
  Collection: raiz do diretório, no Java não há implementação nessa interface;
  Funções:
    Set: Não tem excedentes a objetos duplicados, como carros com a mesma placa, 
    representa o conceito matemático de conjunto numéricos;

    SordetSet: Funciona baseado no Set que da ordem crescente dos elementos presentes nela,
    como uma forma de utilizar ordenação;

    List: Listas diferente de Sets aceitam elementos duplicados e tambem são ordenados na sequência que são atribuídos,
    cada objeto na lista recebe posição referente ao índice I;

    Map: são como a abstração de objetos que tem identificação exclusiva, ou seja, que são acessáveis pela sua "chave",
    chave sendo única para cada valor de objeto referente;

    SortedMap: Funciona a base do Map, porém mantendo ordenação nas chaves de acesso, pense nisso como um dicionário,
    onde cada vocabulário está prescrito pela claúsula de letra (A, B, X, etc..), e pela página no glossário (pente - pag 311);


ArrayList Interface
  Lista é utilizada para armazenar conjuntos de elementos, diferente do vetor, elas são alocadas dinamicamente, ou seja,
  não há necessidade de atribuir valor máximo de tamanho;

  Utiliza a biblioteca java.util.List que possúem métodos classificados segundo a Oracle: https://docs.oracle.com/javase/8/docs/api/java/util/List.html
  
  Métodos conhecidos são Iteradores e Observadores, Iteradores permitem busca na lista ordenada para um elemento expecífico;
  enquanto Observadores retornam valor boolean dependendo se existem elementos para aderir a sequência;


Atividade: Lista 04 - Collections Framework (ArrayList)

Q1) Gerenciador de Estoque

  import java.util.ArrayList;

  public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

public class Estoque {
    private ArrayList<Produto> lista = new ArrayList<>();

    public void adicionarProduto(Produto p) {
        lista.add(p);
    }

    public void removerProduto(String nome) {
        Produto remover = null;
        for (Produto p : lista) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                remover = p;
            }
        }
        if (remover != null) {
            lista.remove(remover);
        }
    }

    public void exibirTodos() {
        for (Produto p : lista) {
            System.out.println(p.getNome() + " - R$ " + p.getPreco());
        }
    }
}

public class TesteEstoque {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        estoque.adicionarProduto(new Produto("Teclado MEC", 250.0));
        estoque.adicionarProduto(new Produto("Mouse Gamer", 150.0));

        estoque.exibirTodos();

        estoque.removerProduto("Mouse Gamer");

        System.out.println("Após remover:");
        estoque.exibirTodos();
    }
}

Q2) Contador Global

  import java.util.ArrayList;
  
  public class Candidato {
    private String nome;
    private int numero;
    public static int totalCandidatos = 0;

    public Candidato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        totalCandidatos++;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }
}

public class TesteCandidato {
    public static void main(String[] args) {
        ArrayList<Candidato> lista = new ArrayList<>();

        lista.add(new Candidato("Ana", 10));
        lista.add(new Candidato("Bruno", 20));
        lista.add(new Candidato("Carlos", 30));
        lista.add(new Candidato("Daniela", 40));
        lista.add(new Candidato("Eduardo", 50));

        System.out.println(Candidato.totalCandidatos);
    }
}

Q3) Sistema de Votação

  import java.util.ArrayList;

  public class Candidato {
    private int numero;
    private String nome;
    private int votos;

    public Candidato(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public int getVotos() {
        return votos;
    }

    public void adicionarVoto() {
        votos++;
    }
}

public class Urna {
    private static int totalVotosGeral;
    private ArrayList<Candidato> listaCandidatos = new ArrayList<>();

    public void adicionarCandidato(Candidato c) {
        listaCandidatos.add(c);
    }

    public void votar(int numeroCandidato) {
        for (Candidato c : listaCandidatos) {
            if (c.getNumero() == numeroCandidato) {
                c.adicionarVoto();
                totalVotosGeral++;
            }
        }
    }

    public static void emitirBoletim(Urna u) {
        for (Candidato c : u.listaCandidatos) {
            System.out.println(c.getNumero() + " - " + c.getNome() + " - " + c.getVotos());
        }
        System.out.println("Total geral: " + totalVotosGeral);
    }

    public Candidato encontrarVencedor() {
        Candidato vencedor = null;
        int maior = -1;

        for (Candidato c : listaCandidatos) {
            if (c.getVotos() > maior) {
                maior = c.getVotos();
                vencedor = c;
            }
        }
        return vencedor;
    }
}

public class TesteUrna {
    public static void main(String[] args) {
        Urna urna = new Urna();

        urna.adicionarCandidato(new Candidato(10, "Ana"));
        urna.adicionarCandidato(new Candidato(20, "Bruno"));
        urna.adicionarCandidato(new Candidato(30, "Carlos"));

        urna.votar(10);
        urna.votar(10);
        urna.votar(20);

        Urna.emitirBoletim(urna);

        Candidato vencedor = urna.encontrarVencedor();
        System.out.println("Vencedor: " + vencedor.getNome());
    }
}

Q4) Gestão de Notas de Alunos

  import java.util.ArrayList;

  public class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }
}

public class TesteAluno {

    public static ArrayList<Aluno> filtrarAprovados(ArrayList<Aluno> lista) {
        ArrayList<Aluno> aprovados = new ArrayList<>();
        for (Aluno a : lista) {
            if (a.getNota() >= 7.0) {
                aprovados.add(a);
            }
        }
        return aprovados;
    }

    public static void main(String[] args) {
        ArrayList<Aluno> lista = new ArrayList<>();

        lista.add(new Aluno("Ana", 8.0));
        lista.add(new Aluno("Bruno", 6.5));
        lista.add(new Aluno("Carlos", 7.5));
        lista.add(new Aluno("Daniela", 5.0));
        lista.add(new Aluno("Eduardo", 9.0));
        lista.add(new Aluno("Fernanda", 4.5));
        lista.add(new Aluno("Gabriel", 7.0));
        lista.add(new Aluno("Helena", 6.0));
        lista.add(new Aluno("Igor", 8.5));
        lista.add(new Aluno("Julia", 3.0));

        ArrayList<Aluno> aprovados = filtrarAprovados(lista);

        for (Aluno a : aprovados) {
            System.out.println(a.getNome() + " - " + a.getNota());
        }
    }
}

Q5) Conversor de Moedas

  import java.util.ArrayList;

  public class Conversor {

    private Conversor() {
    }

    public static double dolarParaReal(double montante, double cotacao) {
        return montante * cotacao;
    }

    public static double realParaDolar(double montante, double cotacao) {
        return montante / cotacao;
    }
}

public class TesteConversor {
    public static void main(String[] args) {
        ArrayList<Double> precosDolar = new ArrayList<>();

        precosDolar.add(10.0);
        precosDolar.add(25.5);
        precosDolar.add(100.0);
        precosDolar.add(7.75);

        double cotacao = 5.00;

        for (double preco : precosDolar) {
            double convertido = Conversor.dolarParaReal(preco, cotacao);
            System.out.println("US$ " + preco + " = R$ " + convertido);
        }
    }
}

Q6) Menu com ArrayList (Cadastro de Livros)

  import java.util.ArrayList;

  public class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}

public class Biblioteca {
    private ArrayList<Livro> lista = new ArrayList<>();

    public void cadastrar(Livro l) {
        lista.add(l);
    }

    public ArrayList<Livro> listar() {
        return lista;
    }

    public Livro buscar(String titulo) {
        for (Livro l : lista) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                return l;
            }
        }
        return null;
    }

    public boolean remover(String titulo) {
        Livro l = buscar(titulo);
        if (l != null) {
            lista.remove(l);
            return true;
        }
        return false;
    }
}

import java.util.Scanner;

public class Sistema {

    static Scanner sc = new Scanner(System.in);
    static Biblioteca biblioteca = new Biblioteca();

    public static void menu() {
        int op;

        do {
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Buscar");
            System.out.println("4 - Remover");
            System.out.println("5 - Sair");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    buscar();
                    break;
                case 4:
                    remover();
                    break;
            }
        } while (op != 5);
    }

    public static void cadastrar() {
        System.out.print("Titulo: ");
        String titulo = sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.nextLine();
        biblioteca.cadastrar(new Livro(titulo, autor));
    }

    public static void listar() {
        for (Livro l : biblioteca.listar()) {
            System.out.println(l.getTitulo() + " - " + l.getAutor());
        }
    }

    public static void buscar() {
        System.out.print("Titulo: ");
        String titulo = sc.nextLine();
        Livro l = biblioteca.buscar(titulo);
        if (l != null) {
            System.out.println(l.getTitulo() + " - " + l.getAutor());
        } else {
            System.out.println("Nao encontrado");
        }
    }

    public static void remover() {
        System.out.print("Titulo: ");
        String titulo = sc.nextLine();
        if (biblioteca.remover(titulo)) {
            System.out.println("Removido");
        } else {
            System.out.println("Nao encontrado");
        }
    }

    public static void main(String[] args) {
        menu();
    }
}

Q7) Sistema Acadêmico

  import java.util.ArrayList;

  public class Aluno {
    private String matricula;
    private String nome;

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }
}

public class Professor {
    private String matricula;
    private String nome;

    public Professor(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }
}

public class Disciplina {
    private String codigo;
    private String nome;
    private Professor professor;
    private ArrayList<Aluno> alunosMatriculados = new ArrayList<>();
    private int maxVagas;

    public Disciplina(String codigo, String nome, Professor professor, int maxVagas) {
        this.codigo = codigo;
        this.nome = nome;
        this.professor = professor;
        this.maxVagas = maxVagas;
    }

    public boolean matricularAluno(Aluno a) {
        if (alunosMatriculados.size() >= maxVagas) {
            return false;
        }
        for (Aluno aluno : alunosMatriculados) {
            if (aluno.getMatricula().equals(a.getMatricula())) {
                return false;
            }
        }
        alunosMatriculados.add(a);
        return true;
    }

    public void gerarDiario() {
        System.out.println("Disciplina: " + nome);
        System.out.println("Professor: " + professor.getNome());
        for (Aluno a : alunosMatriculados) {
            System.out.println(a.getMatricula() + " - " + a.getNome());
        }
        System.out.println("Vagas disponiveis: " + vagasDisponiveis());
    }

    public int vagasDisponiveis() {
        return maxVagas - alunosMatriculados.size();
    }
}

public class TesteSistema {
    public static void main(String[] args) {
        Professor prof = new Professor("P01", "Carlos Silva");

        Disciplina d = new Disciplina("POO1", "Programacao OO", prof, 3);

        Aluno a1 = new Aluno("A01", "Ana");
        Aluno a2 = new Aluno("A02", "Bruno");
        Aluno a3 = new Aluno("A03", "Carla");
        Aluno a4 = new Aluno("A04", "Daniel");

        d.matricularAluno(a1);
        d.matricularAluno(a2);
        d.matricularAluno(a3);
        d.matricularAluno(a4);

        d.gerarDiario();
    }
}

Desafio Lista 4 : 
Questão Desafio: O Sistema de Biblioteca

O cenário: Você deve gerenciar uma Biblioteca.

Classe Livro: Possui titulo, autor e um atributo booleano disponivel.
Classe Biblioteca: Possui um ArrayList<Livro> acervo.
Atributo Estático totalLivrosEmprestados.
Regras de Negócio (Métodos):
  emprestarLivro(String titulo): Busca o livro no ArrayList. Se estiver disponível, muda o status para false e incrementa o contador estático global de empréstimos.
  devolverLivro(String titulo): Localiza o livro, muda o status para true e decrementa o contador estático.
  buscarLivrosPorAutor(String autor): Retorna uma lista com todos os livros daquele autor.
Requisito de Engenharia: No main, utilize um menu para que o usuário possa interagir com o sistema. Demonstre o uso do totalLivrosEmprestados acessando-o diretamente pela classe.

  import java.util.ArrayList;
  import java.util.Scanner;
  
  public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel = true;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> acervo = new ArrayList<>();
    public static int totalLivrosEmprestados = 0;

    public void adicionarLivro(Livro l) {
        acervo.add(l);
    }

    public boolean emprestarLivro(String titulo) {
        for (Livro l : acervo) {
            if (l.getTitulo().equalsIgnoreCase(titulo) && l.isDisponivel()) {
                l.setDisponivel(false);
                totalLivrosEmprestados++;
                return true;
            }
        }
        return false;
    }

    public boolean devolverLivro(String titulo) {
        for (Livro l : acervo) {
            if (l.getTitulo().equalsIgnoreCase(titulo) && !l.isDisponivel()) {
                l.setDisponivel(true);
                totalLivrosEmprestados--;
                return true;
            }
        }
        return false;
    }

    public ArrayList<Livro> buscarLivrosPorAutor(String autor) {
        ArrayList<Livro> lista = new ArrayList<>();
        for (Livro l : acervo) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
                lista.add(l);
            }
        }
        return lista;
    }

    public ArrayList<Livro> listar() {
        return acervo;
    }
}

public class SistemaBiblioteca {

    static Scanner sc = new Scanner(System.in);
    static Biblioteca biblioteca = new Biblioteca();

    public static void menu() {
        int op;

        do {
            System.out.println("1 - Listar livros");
            System.out.println("2 - Emprestar livro");
            System.out.println("3 - Devolver livro");
            System.out.println("4 - Buscar por autor");
            System.out.println("5 - Total emprestados");
            System.out.println("6 - Sair");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    listar();
                    break;
                case 2:
                    emprestar();
                    break;
                case 3:
                    devolver();
                    break;
                case 4:
                    buscarAutor();
                    break;
                case 5:
                    System.out.println(Biblioteca.totalLivrosEmprestados);
                    break;
            }
        } while (op != 6);
    }

    public static void listar() {
        for (Livro l : biblioteca.listar()) {
            System.out.println(l.getTitulo() + " - " + l.getAutor() + " - " + (l.isDisponivel() ? "Disponivel" : "Emprestado"));
        }
    }

    public static void emprestar() {
        System.out.print("Titulo: ");
        String titulo = sc.nextLine();
        if (biblioteca.emprestarLivro(titulo)) {
            System.out.println("Emprestado");
        } else {
            System.out.println("Nao disponivel");
        }
    }

    public static void devolver() {
        System.out.print("Titulo: ");
        String titulo = sc.nextLine();
        if (biblioteca.devolverLivro(titulo)) {
            System.out.println("Devolvido");
        } else {
            System.out.println("Nao encontrado");
        }
    }

    public static void buscarAutor() {
        System.out.print("Autor: ");
        String autor = sc.nextLine();
        ArrayList<Livro> lista = biblioteca.buscarLivrosPorAutor(autor);
        for (Livro l : lista) {
            System.out.println(l.getTitulo() + " - " + (l.isDisponivel() ? "Disponivel" : "Emprestado"));
        }
    }

    public static void main(String[] args) {
        biblioteca.adicionarLivro(new Livro("Java Basico", "Ana Silva"));
        biblioteca.adicionarLivro(new Livro("POO Avancado", "Carlos Souza"));
        biblioteca.adicionarLivro(new Livro("Estruturas de Dados", "Ana Silva"));
        menu();
    }
}
