import java.util.ArrayList;


//Uso da ListaLigada: 

public class ListaLigada<TIPO>{
    private Elemento<TIPO> primeiro;
    private Elemento<TIPO> ultimo;
    private int tamanho;

    public ListaLigada(){
        this.tamanho = 0;
    }

    public Elemento<TIPO> getPrimeiro(){
        return primeiro;
    }

    public void setElemento(Elemento<TIPO> primeiro){
        this.primeiro = primeiro;
    }

    public Elemento<TIPO> getUltimo(){
        return ultimo;
    }

    public void setUltimo(Elemento<TIPO> ultimo){
        this.ultimo = ultimo;
    }

    public int getTamanho(){
        return tamanho;
    }

    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }
}


public class Comparacao{
    public static void main(String args[]){
        ListaLigada<Integer> lista = new ListaLigada<Integer>();

        ArrayList<Integer> vetor = new ArrayList<Integer>();

        //Add elements
        //uso provável para big O(N) para comparação

        int limite = 10000;
        long tempoInicial = System.currentTimeMillis();
        long tempoFinal;
        for(int i=0;i<limite;i++){
            vetor.add(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Adicionou: " + limite + "elementos no vetor");
        System.out.println(tempoFinal - tempoInicial);

        //25ms

        tempoInicial = System.currentTimeMillis();
        tempoFinal;
        for(int i=0;i<limite;i++){
            lista.adicionar(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\nAdicionou: " + limite + "elementos na lista");
        System.out.println(tempoFinal - tempoInicial);

        //126ms

        //verificação de null!=, verifica setProximo();
        //LinkedLisk refere-se ao objeto, uso de memória

        //Ler valores vetor:
        tempoInicial = System.currentTimeMillis();
        for(int i=0;i<vetor.size();i++){
            vetor.get(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\nTempo de leitura do vetor: ");
        System.out.println(tempoFinal - tempoInicial);

        //6ms

        //Ler valores lista:
        tempoInicial = System.currentTimeMillis();
        for(int i=0;i<lista.getTamanho();i++){
            lista.get(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\nTempo de leitura da lista: ");
        System.out.println(tempoFinal - tempoInicial);

        //Break, i<lista.getTamanho(), Iterador alto, ?ms
    }
}
