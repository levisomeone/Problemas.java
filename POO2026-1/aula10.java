11.14 (Condições excepcionais) Liste as várias condições excepcionais que ocorreram em programas por todo este livro até agora. Liste o maior

número de condições excepcionais adicionais que você puder. Para cada uma delas, descreva brevemente como um programa normal-
mente trataria a exceção usando as técnicas de tratamento de exceção discutidas neste capítulo. Exceções típicas incluem divisão por zero e índice de array fora dos limites.

  

  As condições excepcionais acontecem quando ocorre algum erro durante a execução do programa. Em Java, esses erros podem ser tratados usando mecanismos de tratamento de exceção, como try, catch e finally,
  evitando que o programa seja encerrado de forma inesperada.

  public class ExemploExcecao {

    public static void main(String[] args) {

        try {
            int result = 10/0;

            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("Erro: divisão por zero");

        } finally {

            System.out.println("Programa finalizado");
        }
    }
}

11.15 (Exceções e falha de construtor) Até este capítulo, descobrimos que lidar com erros detectados por construtores é um pouco complicado.
Explique por que o tratamento de exceção é um meio eficaz de lidar com falha de construtor.

  O tratamento de exceções é um meio eficaz para lidar com falhas em construtores porque permite identificar e tratar erros que acontecem durante a criação de um objeto. Em Java, o construtor é responsável por inicializar os atributos do objeto, e caso algum problema ocorra nesse processo, o objeto pode ficar inconsistente ou incompleto.
Sem o uso de exceções, seria difícil informar ao programa que a criação do objeto falhou. Além disso, o construtor não pode retornar valores indicando erro, já que sua função é apenas inicializar o objeto.
Com o tratamento de exceções, o construtor pode lançar uma exceção (throw) quando encontrar uma situação inválida, como: valores incorretos,arquivos inexistentes, ou parâmetros inválidos.

  public class Produto {

    private String nome;

    public Produto(String nome) {

        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome inválido.");
        }

        this.nome = nome;
    }

    public static void main(String[] args) {

        try {

            Produto p = new Produto("");

        } catch (IllegalArgumentException e) {

            System.out.println("Erro ao criar objeto: " + e.getMessage());
        }
    }
}

11.16 (Capturando exceções com superclasses) Utilize herança para criar uma superclasse de exceção (chamada ExceptionA) e subclasses
de exceção ExceptionB e ExceptionC, em que ExceptionB herda de ExceptionA e ExceptionC herda de ExceptionB. Escreva
um programa para demonstrar que o bloco catch para tipo ExceptionA captura exceções de tipos ExceptionB e ExceptionC.

  class ExceptionA extends Exception {

    public ExceptionA(String mensagem) {
        super(mensagem);
    }
}

class ExceptionB extends ExceptionA {

    public ExceptionB(String mensagem) {
        super(mensagem);
    }
}

class ExceptionC extends ExceptionB {

    public ExceptionC(String mensagem) {
        super(mensagem);
    }
}

public class TesteExcecoes {

    public static void main(String[] args) {

        try {

            throw new ExceptionB("Exceção do tipo B");

        } catch (ExceptionA e) {

            System.out.println("Capturada por ExceptionA: " + e.getMessage());
        }

        try {

            throw new ExceptionC("Exceção do tipo C");

        } catch (ExceptionA e) {

            System.out.println("Capturada por ExceptionA: " + e.getMessage());
        }
    }
}

11.17 (Capturando exceções com a classe Exception) Escreva um programa que demonstra como várias exceções são capturadas com
catch (Exception exception)
Desta vez, defina as classes ExceptionA (que herda da classe Exception) e ExceptionB (que herda da classe ExceptionA). Em
seu programa, crie blocos try que lançam exceções de tipos ExceptionA, ExceptionB, NullPointerException e IOException.
Todas as exceções devem ser capturadas com blocos catch para especificar o tipo Exception.

  import java.io.IOException;

class ExceptionA extends Exception {

    public ExceptionA(String mensagem) {
        super(mensagem);
    }
}

class ExceptionB extends ExceptionA {

    public ExceptionB(String mensagem) {
        super(mensagem);
    }
}

public class TesteExcecoes {

    public static void main(String[] args) {

        try {

            throw new ExceptionA("Erro do tipo ExceptionA");

        } catch (Exception e) {

            System.out.println("Capturada: " + e);
        }
        try {

            throw new ExceptionB("Erro do tipo ExceptionB");

        } catch (Exception e) {

            System.out.println("Capturada: " + e);
        }

        try {

            String texto = null;
            texto.length();

        } catch (Exception e) {

            System.out.println("Capturada: " + e);
        }

        try {

            throw new IOException("Erro de entrada e saída");

        } catch (Exception e) {

            System.out.println("Capturada: " + e);
        }
    }
}

11.18 (Ordenando blocos catch) Escreva um programa que demonstre que a ordem dos blocos catch é importante. Se você tentar capturar
um tipo de exceção de superclasse antes de um tipo de subclasse, o compilador deve gerar erros.

  public class TesteCatch {

    public static void main(String[] args) {

        try {

            String texto = null;
            texto.length();

        } catch (Exception e) {

            System.out.println("Captura genérica.");
            
        } catch (NullPointerException e) {

            System.out.println("Captura específica.");
        }
    }
}

11.19 (Falha de construtor) Escreva um programa que mostra um construtor que passa informações sobre a falha do construtor para uma
rotina de exceção. Defina a classe SomeClass, que lança um Exception no construtor. O seu programa deve tentar criar um objeto do
tipo SomeClass e capturar a exceção que é lançada do construtor.

  class SomeClass {

    public SomeClass() throws Exception {

        throw new Exception("Erro: falha ao criar objeto.");
    }
}

public class TesteConstrutor {

    public static void main(String[] args) {

        try {

            SomeClass obj = new SomeClass();

        } catch (Exception e) {

            System.out.println("Exceção capturada:");
            System.out.println(e.getMessage());
        }
    }
}

11.20 (Relançando exceções) Escreva um programa que ilustra o relançamento de uma exceção. Defina os métodos someMethod e
someMethod2. O método someMethod2 deve lançar inicialmente uma exceção. O método someMethod deve chamar someMethod2,
capturar a exceção e relançá-la. Chame someMethod a partir do método main e capture a exceção relançada. Imprima o rastreamento
de pilha dessa exceção.

  public class RelancandoExcecao {
    public static void someMethod2() throws Exception {

        throw new Exception("Exceção gerada em someMethod2");
    }
    public static void someMethod() throws Exception {

        try {

            someMethod2();

        } catch (Exception e) {
            System.out.println("Exceção capturada em someMethod.");
            System.out.println("Relançando exceção...\n");

            throw e;
        }
    }

    public static void main(String[] args) {

        try {

            someMethod();

        } catch (Exception e) {
            System.out.println("Exceção capturada no método main.\n");
            e.printStackTrace();
        }
    }
}

11.21 (Capturando exceções com escopos externos) Escreva um programa que mostra que um método com seu próprio bloco try não pre-
cisa capturar todo possível erro gerado dentro do try. Algumas exceções podem escorregar para, e serem tratadas em, outros escopos.

  public class EscopoExterno {
    public static void metodoInterno() throws ArithmeticException {

        try {

            int resultado = 10 / 0;
            System.out.println(resultado);
        } finally {
            System.out.println("Bloco finally executado.");
        }
    }

    public static void main(String[] args) {

        try {

            metodoInterno();

        } catch (ArithmeticException e) {
            System.out.println("Exceção tratada no método main.");
            System.out.println("Mensagem: " + e.getMessage());
        }
    }
}
