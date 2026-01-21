public class Elemento{
    private String valor;
    private Elemento proximo;

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

    }

    public void remover(String novoValor){

    }

    public get(int posicao){
        return null;
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
        System.out.println(lista.getTamanho());

        //lista encadeada
    }
}
