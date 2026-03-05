q1) Interface SET
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Sistema {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Set<String> ips = new HashSet<>();

        System.out.println("Digite o ip: ");

        for(int i=0;i<10;i++){
            System.out.print("" + i + ": ");
            String ip = sc.nextLine();
            ips.add(ip);
        }
        System.out.println("\n Ips únicos: " + ips.size());
        System.out.println("\nLista de IPs: ");
        for(String ip : ips){
            System.out.println(ip);
        }
        sc.close();
    }
}

q2) Interface MAP

import java.util.HashMap;
import java.util.Scanner;

public class Sistema {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        HashMap<String, String> funcionarios = new HashMap<>();
        funcionarios.put("100.000.000-10", "Gerente");
        funcionarios.put("101.000.000-11", "Suporte Técnico");
        funcionarios.put("102.000.000-11", "Desenvolvedor 1");
        funcionarios.put("103.000.000-12", "Desenvolvedor 2");
        funcionarios.put("104.000.000-13", "Desenvolvedor 3");

        System.out.print("Digite Cpf funcionário: ");
        String cpf = sc.nextLine();

        String cargo = funcionarios.get(cpf);

        if(cargo != null){
            System.out.println("Cargo: " + cargo);
        }else {
            System.out.println("Fucnionário não encontrado");
        }

    }
}

q3) Interface SORTEDSET

  import java.util.TreeSet;

public class Sistema{
    public static void main(String args[]){
        TreeSet<String> tags = new TreeSet<>();

        tags.add("Eletrônicos");
        tags.add("Abajur");
        tags.add("Zigue-zague");
        tags.add("Moda");
        tags.add("Beleza");

        System.out.println("Tags Ordem: ");
        System.out.println(tags);

        System.out.println("\nPrimeira tag: " + tags.first());
        System.out.println("\nÚltima tag: " + tags.last());
    }
}

q4) Interface SORTEDMAP

import java.util.TreeMap;
import java.util.SortedMap;

public class Sistema{
    public static void main(String args[]){
        TreeMap<Integer, String> eventos = new TreeMap<>();
        eventos.put(502, "Login Administrador Account");
        eventos.put(503, "Entrando no sistema de Estoque");
        eventos.put(504, "Caixa de Entrada Selecionada");
        eventos.put(505, "Adição de endereço genérico no Banco");

        System.out.println("Todos os eventos ordenados por IP: ");
        System.out.println(eventos);

        SortedMap<Integer, String> intervalo = eventos.subMap(100, 510);

        for (Integer id : intervalo.keySet()) {
            System.out.println( id + " - " + intervalo.get(id));
        }
    }
}
