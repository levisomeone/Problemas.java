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
}


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


public class Programa{
    public static void main(String[] args){
        ListaLigada<String> lista = new ListaLigada<String>();
        //System.out.println(lista.getTamanho());
        lista.adicionar("AC");
        lista.adicionar("BA");
        lista.adicionar("CE");
        lista.adicionar("DF");
        System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("Ultimo: " + lista.getUltimo().getValor());
        for(int i = 0; i < lista.getTamanho; i++){
            System.out.println(lista.get(i).getvalor());
        }
        lista.remover("CE");
        System.out.println("Removeu estado CE");
    }
}
