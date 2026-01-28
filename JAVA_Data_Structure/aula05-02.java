public class Cliente{
    private String cpf;
    private String nome;

    public Cliente(String novoCpf, String novoNome){
        this.cpf = novoCpf;
        this.nome = novoNome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String toString(){
        return this.nome;
    }
}

public class ProgramaClientes{
    public static void main(String() args[]){
        ListaLigada<Clientes> clientes = new ListaLigada<Clientes>();
        clientes.adicionar(new Cliente("123", "Paulo"));
        clientes.adicionar(new Cliente("124", "Paula"));
        clientes.adicionar(new Cliente("125", "Paule"));

        System.out.println("Tamanho: " + clientes.getTamanho());
        for(int i=0;i<clientes.getTamanho();i++){
            System.out.println(clientes.get(i).getValor());
        }
    }
}

/*HASH para <Non clientes> em nome, cpf, adicionar toString(){ return this.nome }

/*public class ProgramaInteiros{
    public static void main(String args[]){
        ListaLigada<Integer> numeros = new ListaLigada<Integer>();
        numeros.adicionar(3);
        numeros.adicionar(4);
        numeros.adicionar(5);

        System.out.println("Tamanho: " + numeros.getTamanho());
        for(int i=0;i<numeros.getTamanho();i++){
            System.out.println(numeros.get(i).getValor());
        }
    }
}*/
