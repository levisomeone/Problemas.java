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
