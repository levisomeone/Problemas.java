/*public class Variaveis{
    public static void main(String[] args){
        System.out.println("==============");
        
        double precoProduto = 115.0;
        System.out.println("O preco do produto e de" + precoProduto + "reais");
        
        double percentualDesconto = 5.0;
        
        System.out.println("O desconto sera de" + percentualDesconto + "%.");
        
        double desconto = precoProduto * percentualDesconto / 100;
        double precoComDesconto = precoProduto - desconto;
        
        System.out.println("Com desconto, o produto sai"+"por R$"+precoComDesconto+".");
        System.out.println("Fim!");
        System.out.println("=============="); 
    }
}*/

/*import java.util.Scanner;
public class lendoInformacoes{
    public static void main(String[] args){
        System.out.println("==========");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma distancia: ");
        double distanciaPercorrida = scanner.nextDouble();
        
        System.out.println("A distancia digitada foi" + distanciaPercorrida + "Km.");
        scanner.close();
        
        System.out.println("Fim!");
        System.out.println("============");
    }
}*/

/*import java.util.Scanner;
public class LendoVariaveis{
    public class void main(String[] args){
        System.out.println("==========");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print(" >>> Digite um texto: ");
        String texto = scanner.nextLine();
        System.out.println("O texto digitado" + "foi" + texto);
        
        System.out.print(" >>> Digite um inteiro: ");
        int numeroInteiro = scanner.nextInt();
        System.out.println("O numero inteiro digitado" + "foi" + numeroInteiro);
        
        System.out.print(" >>> digite um boolean: ");
        boolean booleano = scanner.nextBoolean();
        System.out.println("O booleanbooleano digitado" + "foi" + booleano);
        
        scanner.close();
        
        System.out.println("Fim!");
        System.out.println("==========");
    }
}*/

/*public class operadoresAritmeticos{
    public static void main(String[] args){
        System.out.println("================");
        
        int adicao = 5 + 2;
        System.out.println("Resultado da adicao de 5 com 2: " + adicao);
        
        int subtracao = 5 - 2;
        System.out.println("Resultado da subsubtracao de 5 e 2: " + subtracao);
        
        int multiplicacao = 5 * 2;
        System.out.println("Resultado da multiplicacao de 5 e 2: " + multiplicacao);
        
        double divisao = 5.0 / 2.0;
        System.out.println("Resultado da divisao entre 5 e 2; " + divisao);
        
        double moduloOuResto = 5.0 % 2.0;
        System.out.println("Resto da divisao entre 5 e 2: " + moduloOuResto);
        
        System.out.println("Fim!");
        System.out.println("==================");
        
    }
}*/

/*public class operadoresDeAtribuicao{
    public static void main(String[] args){
        System.out.println("Iniciando Sistema..");
        
        int umNumero = 5;
        umNumero += 2;
        
        System.out.println("Resultado da soma de 5 e 2: " + umNumero);
        
        
    }
}*/

/*public class OperadoresLogicos{
    public static void main(String[] args){
        System.out.println("===============");
        
        boolean usuarioVIP = true;
        boolean compraComValorAlto = true;
        boolean menorDeIdade = true;
        boolean temProdutoAlcoolicoNoCarrinho = true;
        
        System.out.println("Usuario e vip ?" + usuarioVIP);
        System.out.println("A compra tem um valor alto? " + compraComValorAlto);
        System.out.println("É menor de idade? " + menorDeIdade);
        System.out.println("tem produto alcoolico no carrinho? " + temProdutoAlcoolicoNoCarrinho); 
        
        System.out.println("================");
        
        boolean aplicarDesconto = usuarioVIP && compraComValorAlto;
        System.out.println("O desconto deve ser aplicado? " + "(usuarioVIP && compraComValorAlto: )" + aplicarDesconto);
        
        aplicarDesconto = usuarioVIP || compraComValorAlto;
        System.out.println("O desconto deve ser aplicado? " + "(usuarioVIP || compraComValorAlto: )" + aplicarDesconto);
        
        boolean permiteConcluirCompra = !menorDeIdade || !temProdutoAlcoolicoNoCarrinho;
        System.out.println("Pode concluir a compra? " + "(!menorDeIdade || !temProdutoAlcoolicoNoCarrinho: )" + permiteConcluirCompra);
        
        System.out.println("Fim!");
        System.out.println("==============");
    }
}*/

/*import java.util.Scanner;

public class EstruturaDeDecisaoIf{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=================");
        
        System.out.println("Informe o preço do produto: ");
        double precoProduto = scanner.nextDouble();
         
        boolean produtoAltoValor = precoProduto >= 100;
        double percentualDesconto = 0.0;
        
        if(produtoAltoValor){
            percentualDesconto = 5.0;
        } else{
            System.out.println("Não será aplicado desconto algum.");
        }
        
        double desconto = (precoProduto * percentualDesconto) / 100;
        double precoComDesconto = precoProduto - desconto;
        
        System.out.println("O produto sairá por R$" + precoComDesconto + ".");
        
        System.out.println("Fim!");
        System.out.println("=============");
        
        scanner.close();
    }
}*/

/*import java.util.Scanner;

public class estruturadeDecisaoSwitch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===============");
        
        System.out.println("Informe o dia(numero): ");
        int diaSemana = scanner.nextInt();
        
        String nomeDoDiaDaSemana = "";
        
        switch(diaSemana){
            case 1: nomeDoDiaDaSemana = "Domingo";
                break;
            case 2: nomeDoDiaDaSemana = "Segunda";
                break;
            case 3: nomeDoDiaDaSemana = "Terça";
                break;
            case 4: nomeDoDiaDaSemana = "Quarta";
                break;
            case 5: nomeDoDiaDaSemana = "Quinta";
                break;
            case 6: nomeDoDiaDaSemana = "Sexta";
                break;
            case 7: nomeDoDiaDaSemana = "Sabado";
                break;
            default: nomeDoDiaDaSemana = "Não encotrado";               
        }
        
        System.out.println("O dia da semana é " + nomeDoDiaDaSemana + ".");
        
        System.out.println("Fim!");
        System.out.println("================");
        
        scanner.close(); 
    }
}*/

import java.util.Scanner;
public class Vetores{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=============");
        double[] precoProdutos = new double[]{150.0, 20.0, 10.0, 100.0};
        
        System.out.println("Informe o índice:  ");
        int indiceProduto = scanner.nextInt();
        
        if(indiceProduto >= 0 && indiceProduto < precoProdutos.length){
            double apresentacaoProduto = precoProdutos[indiceProduto];
             System.out.println("O preço do produto é " + apresentacaoProduto);
        } else{
            System.out.println("Índice invalido");
        }
        
        
        
        System.out.println("Fim!");
        System.out.println("================");   
    }
}
