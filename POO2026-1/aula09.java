Contexto: Sistema de Frota Logística (LogiTrack)
A empresa precisa de um sistema para gerenciar diferentes tipos de
veículos. Nem todo veículo se comporta da mesma forma, mas todos
pertencem à frota.
Exercício 1: Abstração e Herança
1. Crie um pacote br.edu.logistica.modelo.
2. Crie uma Classe Abstrata chamada Veiculo.
o Atributos: String placa, double capacidadeCarga e uma
Enumeração StatusVeiculo (DISPONIVEL, EM_MANUTENCAO,
EM_VIAGEM).
o Método Abstrato: double calcularAutonomia(). Este método deve
ser implementado pelas subclasses, pois cada tipo de veículo
gasta combustível de forma diferente.
3. Crie duas subclasses: Caminhao e Van.
o O Caminhao deve ter um atributo extra: int eixos.
o A Van deve ter um atributo extra: boolean possuiRefrigeracao.
Exercício 2: Interfaces (Contratos de Comportamento)
1. Crie uma Interface chamada Monitoravel.
o Ela deve ter os métodos: void enviarCoordenadas() e String
obterLocalizacaoAtual().

Professor: Me. Vinícius Nunes Barbosa
2. Faça com que apenas a classe Caminhao implemente essa interface
(supondo que as vans não tenham rastreador via satélite).
3. Implemente os métodos na classe Caminhao retornando mensagens
simuladas (ex: &quot;Coordenadas enviadas via Satélite&quot;).
Exercício 3: Enumerações com Dados
1. Crie uma Enumeração chamada TipoCombustivel.
o Constantes: DIESEL (fator 5.5), GASOLINA (fator 10.2),
ELETRICO (fator 15.0).
o O &quot;fator&quot; representa quantos km o veículo faz por unidade de
energia.

2. Adicione um atributo TipoCombustivel na classe abstrata Veiculo.
3. Use esse fator no cálculo do método calcularAutonomia() dentro das
subclasses.
Exercício 4: Java Collections Framework
1. Crie um pacote br.edu.logistica.servico.
2. Crie a classe GerenciadorFrota.
3. Atributo: Uma Lista (List&lt;Veiculo&gt;) para armazenar a frota.
4. Métodos a implementar:
o adicionarVeiculo(Veiculo v): Adiciona à lista.
o listarVeiculosDisponiveis(): Percorre a lista e exibe apenas os
veículos com StatusVeiculo.DISPONIVEL.
o gerarRelatorioAutonomia(): Percorre a lista e imprime a placa e a
autonomia calculada de cada veículo (demonstrando
Polimorfismo).
Exercício 5: Filtros e Lógica
1. No GerenciadorFrota, crie um método que utilize um Map&lt;String,
Veiculo&gt;.
2. A chave do Map deve ser a Placa e o valor o objeto Veiculo.
3. Crie um método buscarPorPlaca(String placa) que retorne o veículo
instantaneamente usando o Map.
Questão Teórica (Para refletir)
&quot;Por que usamos uma Interface para o monitoramento e uma Classe
Abstrata para o veículo, em vez de colocar tudo dentro de Veiculo?&quot;
Dica: Pense na regra de que nem todo veículo é monitorável.

Main:
1 – Monte um sistema completo;
2 – Cadastre os veículos;
3 – Faça todas as implementações necessárias;

Professor: Me. Vinícius Nunes Barbosa
Instruções de Entrega:
 Organize o código em pacotes.
 Utilize o modificador final em métodos que não devem ser sobrescritos.
 Utilize Override em todas as implementações de métodos abstratos ou
de interface.
 Um aluno será sorteado para explicar o sistema;
