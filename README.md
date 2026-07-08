# ☕ Java Practice Hub

Projeto desenvolvido com o objetivo de praticar os principais conceitos da linguagem **Java** e da **Programação Orientada a Objetos (POO)** por meio da implementação 
de pequenos exercícios independentes.

Diferentemente de uma coleção de arquivos isolados, este projeto foi estruturado como uma única aplicação Java, organizada em **packages**, permitindo uma melhor 
separação de responsabilidades, reutilização de código e uma arquitetura mais próxima de aplicações reais.

---

## 🎯 Objetivos

- Praticar a sintaxe da linguagem Java.
- Desenvolver o raciocínio lógico.
- Aplicar conceitos fundamentais de Programação Orientada a Objetos.
- Organizar projetos seguindo boas práticas de desenvolvimento.
- Exercitar a criação de métodos reutilizáveis.
- Trabalhar com entrada e saída de dados.
- Utilizar coleções, estruturas de decisão e repetição.
- Desenvolver um projeto organizado para composição de portfólio.

---

## 📁 Estrutura do Projeto

```text
JavaExercises
│
├── app
│   ├── Entrada.java
│   └── Main.java
│
├── area
│
├── contador
│
├── escreva
│
├── fatorial
│
├── jogador
│
├── maiornumero
│
├── sorteio
│
└── voto
```

Cada package representa um exercício independente, contendo:

- Uma classe responsável pela lógica do exercício.
- Uma classe `Main...` responsável pela interação com o usuário.
- A classe `app.Main`, que centraliza a navegação entre todos os exercícios através de um menu interativo.

---

# ⚙️ Funcionalidades

## 📐 Área do Terreno

Calcula a área de um terreno a partir da largura e do comprimento informados pelo usuário.

**Conceitos aplicados**

- Métodos
- Parâmetros
- Retorno de valores
- Organização entre lógica e interface

---

## 🔢 Contador

Realiza contagens crescentes ou decrescentes utilizando início, fim e passo definidos pelo usuário.

**Conceitos aplicados**

- Estruturas de repetição
- Estruturas condicionais
- Validação de parâmetros
- Métodos reutilizáveis

---

## 📝 Formatador de Mensagens

Exibe mensagens formatadas dentro de um quadro utilizando caracteres especiais.

**Conceitos aplicados**

- Manipulação de Strings
- Métodos
- Formatação de saída

---

## ➗ Fatorial

Calcula o fatorial de um número inteiro, permitindo exibir ou não todas as etapas da multiplicação.

**Conceitos aplicados**

- Estruturas de repetição
- Sobrecarga de métodos
- Retorno de valores
- Parâmetros booleanos

---

## ⚽ Ficha do Jogador

Exibe uma ficha contendo o nome do jogador e a quantidade de gols marcados.

**Conceitos aplicados**

- Sobrecarga de métodos
- Validação de entrada
- Tratamento de exceções
- Manipulação de Strings

---

## 🔝 Maior Número

Analisa uma quantidade variável de números inteiros e identifica o maior valor informado.

**Conceitos aplicados**

- VarArgs (`int...`)
- Estruturas de repetição
- Comparação de valores
- Métodos reutilizáveis

---

## 🎲 Sorteio e Soma dos Pares

Realiza o sorteio de números aleatórios, armazena-os em uma lista e calcula a soma dos números pares.

**Conceitos aplicados**

- ArrayList
- Classe Random
- Laços de repetição
- Coleções
- Manipulação de listas

---

## 🗳️ Verificador de Voto

Calcula a idade do usuário a partir do ano de nascimento e informa sua situação eleitoral.

**Conceitos aplicados**

- Classe LocalDate
- Métodos
- Estruturas condicionais
- Retorno de Strings

---

# 🧠 Conceitos Aplicados

Durante o desenvolvimento deste projeto foram utilizados diversos conceitos fundamentais da linguagem Java, entre eles:

- Programação Orientada a Objetos (POO)
- Organização em packages
- Separação de responsabilidades
- Métodos estáticos
- Sobrecarga de métodos
- Encapsulamento da lógica
- Entrada e saída de dados
- Estruturas condicionais
- Estruturas de repetição
- Tratamento de exceções
- Manipulação de Strings
- Coleções (`ArrayList`)
- Geração de números aleatórios (`Random`)
- Manipulação de datas (`LocalDate`)
- Reutilização de código
- Organização modular do projeto

---

# 🏗️ Arquitetura

O projeto foi organizado seguindo uma estrutura modular.

Cada exercício possui duas responsabilidades distintas:

- **Classe de negócio:** responsável pela implementação da lógica do exercício.
- **Classe Main do package:** responsável apenas pela interação com o usuário e execução da lógica.

Além disso, existe uma única classe principal (`app.Main`) responsável por apresentar um menu e permitir a navegação entre todos os exercícios.

Também foi criada uma classe `Entrada`, responsável por disponibilizar uma única instância compartilhada de `Scanner` para toda a aplicação, evitando múltiplas instâncias de leitura do `System.in`.

Essa organização torna o código mais limpo, reutilizável e facilita futuras expansões do projeto.

---

# 🛠️ Tecnologias Utilizadas

- Java
- JDK 17+
- IntelliJ IDEA

---

# ▶️ Como Executar

1. Clone este repositório.

```bash
git clone https://github.com/seu-usuario/JavaExercises.git
```

2. Abra o projeto no IntelliJ IDEA.

3. Execute a classe:

```
app.Main
```

4. Escolha um dos exercícios disponíveis no menu principal.

---

# 📚 Objetivo Educacional

Este projeto faz parte dos meus estudos em Java e Programação Orientada a Objetos, tendo como principal finalidade consolidar os fundamentos da linguagem por meio 
da implementação de exercícios práticos.

Ao longo do desenvolvimento, foram priorizadas boas práticas de organização do código, separação de responsabilidades e reutilização de componentes, aproximando 
a estrutura do projeto de aplicações reais desenvolvidas em Java.

---

## 👨‍💻 Autor

Desenvolvido por **Pedro Augusto** como parte dos estudos em **Java**, **Programação Orientada a Objetos** e desenvolvimento de software.
