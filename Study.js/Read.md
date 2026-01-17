<h1 align="center" style="color:#30e66a;">
📘 Algaworks – Java Introdução
</h1>

---

## 📌 Contextualização

Este repositório reúne **pequenas atividades práticas** desenvolvidas a partir das propostas apresentadas no livro  
**_Java Introdução – Algaworks_**.

---

## 📚 Estrutura do Conteúdo por Capítulo

### 🔹 Capítulo 1 — Introdução à Linguagem Java

**Principais tópicos abordados:**
- Visão geral da linguagem Java
- Conceito de plataforma e portabilidade
- Estrutura básica de um programa Java
- Processo de criação, compilação e execução
- Papel da JVM (Java Virtual Machine)
- Diferença entre código-fonte e bytecode

### Visualização do Processo de Execução em Java

<p align="center">
  <img src="./Chrome.jpg" alt="Processo de desenvolvimento Java" width="600"/>
</p>

---

### 🔹 Capítulo 2 — Fundamentos da Linguagem

**Conteúdos trabalhados:**
- Tipos primitivos
- Declaração de variáveis
- Operadores aritméticos e relacionais
- Expressões
- Conversão de tipos (casting)

---

### 🔹 Capítulo 3 — Controle de Fluxo

**Abordagens principais:**
- Estruturas condicionais (`if`, `else`, `switch`)
- Estruturas de repetição (`while`, `do-while`, `for`)
- Controle de execução
- Boas práticas de legibilidade

---

### 🔹 Capítulo 4 — Arrays e Estruturas Básicas

**Tópicos:**
- Declaração e inicialização de arrays
- Acesso por índice
- Percorrendo arrays
- Aplicações práticas em pequenos problemas

---

### 🔹 Capítulo 5 — Métodos

**Conteúdo estudado:**
- Declaração de métodos
- Parâmetros e retorno
- Reutilização de código
- Organização lógica do programa

---


---

## 🎯 Objetivo Acadêmico

Este repositório não tem como foco aplicações comerciais ou projetos finais, mas sim:

- Reforçar conceitos fundamentais
- Criar base sólida para estudos avançados
- Servir como **registro acadêmico de aprendizado**
- Apoiar a evolução técnica em Java

---

## 📖 Referência

ALGaworks.  
**Java Introdução**.  
Material de apoio ao ensino dos fundamentos da linguagem Java.

---

Os códigos presentes neste repositório representam "exercícios de estudo", podendo conter soluçõess ou simplificações, de acordo com o momento de aprendizado em que foram desenvolvidos.


# Entrar na pasta do projeto
cd /sdcard/SmartIDE/projeto-java

mkdir src
mkdir out

nano src/Main.java
nano .si.json

javac -d out src/Main.java
java -cp out Main

<p>
  <h1>xml</h1>
  <smartide>
    <plugin>org.smartide.plugin.java</plugin>

    <run>
        javac -d out src/Main.java && java -cp out Main
    </run>

    <gui>false</gui>

    <intelligence>
        <json enabled="true">
            vscode-json-language-server --stdio
        </json>

        <java enabled="true">
            jdtls
        </java>
    </intelligence>
</smartide>

</p>
