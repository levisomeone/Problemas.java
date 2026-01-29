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

public class Elemento<TIPO>{
    private <TIPO> valor;
    private Elemento<TIPO> proximo;

    public Elemento(TIPO novoValor){
        this.valor = novoValor;
    }

    public TIPO getValor(){
        return valor;
    }

    public void setValor(TIPO valor){
        this.valor = valor;
    }

    public Elemento<TIPO> getProximo(){
        return proximo;
    }

    public void setProximo(Elemento<TIPO> proximo){
        this.proximo = proximo;
    }

    public void adicionar(TIPO novoValor){
        Elemento<TIPO> novoElemento = new Elemento<TIPO>(novoValor);
        if(this.primeiro == null && this.ultimo == null){
            this.primeiro = novoElemento;
            this.ultimo == novoElemento;
        }else{
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
        }
        this.tamanho++;
    }

    public void remover(TIPO valorProcurado){
        Elemento<TIPO> anterior = null;
        Elemento<TIPO> atual = this.primeiro;
        for(int i=0;i<this.getTamanho(); i++){
            if(atual.getValor().equals(valorProcurado)){
                if(this.Tamanho == 1){
                    this.primeiro = null;
                    this.ultimo = null;
                }
                else if(atual == primeiro){
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                }else if(atual == ultimo){
                    this.ultimo = anterior;
                    anterior.setProximo(atual.getProximo());

                }else{
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }

    public Elemento get(int posicao){
        Elemento atual = this.primeiro;
        for(int i=0;i<posicao;i++){
            if(atual.getProximo() != null){
                atual = atual.getProximo();
            }
        }
        return atual;
    }

    public IteratorListaLigada<TIPO> getIterator(){
        return new IteratorListaLigada<TIPO>(this.primeiro);
    }
}



//IteradorListaLigada

public class IteratorListaLigada<TIPO>{
    private Elemento<TIPO> elemento;

    public IteratorListaLigada(Elemento<TIPO> atual){
        this.elemento = atual;
    }

    public boolean temProximo(){
        if(elemento.getProximo() == null){
            return false;
        }else{
            return true;
        }
    }

    public Elemento<TIPO> getProximo(){
        elemento = elemento.getProximo();
        //return elemento.getProximo();
        //infinitude em código 
    }
}

public class Comparacao{
    public static void main(String args[]){
        ListaLigada<Integer> lista = new ListaLigada<Integer>();

        ArrayList<Integer> vetor = new ArrayList<Integer>();

        int limite = 10000;
        long tempoInicial = System.currentTimeMillis();
        long tempoFinal;
        for(int i=0;i<limite;i++){
            vetor.add(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Adicionou: " + limite + "elementos no vetor");
        System.out.println(tempoFinal - tempoInicial);


        tempoInicial = System.currentTimeMillis();
        tempoFinal;
        for(int i=0;i<limite;i++){
            lista.adicionar(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\nAdicionou: " + limite + "elementos na lista");
        System.out.println(tempoFinal - tempoInicial);

        
        tempoInicial = System.currentTimeMillis();
        IteratorListaLigada<Integer> iterator = lista.getIterator();
        while(iterator.temProximo()){
            iterator.getProximo();
        }

        // 2ms, Mais rápido com Iterador
        //Compreende complexidade de algoritmo

        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\nTempo de leitura do vetor: ");
        System.out.println(tempoFinal - tempoInicial);


        //Ler valores lista:
        tempoInicial = System.currentTimeMillis();
        for(int i=0;i<lista.getTamanho();i++){
            lista.get(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\nTempo de leitura da lista: ");
        System.out.println(tempoFinal - tempoInicial);

    }
}
