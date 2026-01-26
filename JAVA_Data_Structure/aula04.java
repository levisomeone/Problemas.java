public class Elemento{
    private String valor;
    private Elemento proximo;

    public Elemento(String novoValor){
        this.valor = novoValor;
    }

    public String getValor(){
        return valor;
    }

    public void setValor(String valor){
        this.valor = valor;
    }

    public Elemento getProximo(){
        return proximo;
    }

    public void setProximo(Elemento proximo){
        this.proximo = proximo;
    }

    public void adicionar(String novoValor){
        Elemento novoElemento = new Elemento(novoValor);
        if(this.primeiro == null && this.ultimo == null){
            this.primeiro = novoElemento;
            this.ultimo == novoElemento;
        }else{
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
        }
        this.tamanho++;
    }

    public void remover(String valorProcurado){
        Elemento anterior = null;
        Elemento atual = this.primeiro;
        for(int i=0;i<this.getTamanho(); i++){
            if(atual.getValor().equalsIgnoreCase(valorProcurado)){
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


public class ListaLigada{
    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;

    public ListaLigada(){
        this.tamanho = 0;
    }

    public Elemento getPrimeiro(){
        return primeiro;
    }

    public void setElemento(Elemento primeiro){
        this.primeiro = primeiro;
    }

    public Elemento getUltimo(){
        return ultimo;
    }

    public void setUltimo(Elemento ultimo){
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
        ListaLigada lista = new ListaLigada();
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

        //lista encadeada
    }
}
