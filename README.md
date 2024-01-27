# Repositório do projeto `Sistema de votação` 🗳️

Repositório possuí projeto desenvolvido abordando conceitos
de `Abstração e encapsulamento`, `Herança e polimorfismo`
e `Classes abstratas e interfaces`.

## Informações de aprendizados

- Segundo projeto desenvolvido em `Java`;
- Segundo projeto usando `Apache Maven`.

## Linguagens e ferramentas usadas

[![Git][Git-logo]][Git-url]
[![Java][Java-logo]][Java-url]
[![Apache-Maven][Apache-Maven-logo]][Apache-Maven-url]

## O que foi desenvolvido

Neste projeto, desenvolvi um sistema com a possibilidade de cadastrar todos os candidatos e
eleitores, além de coordenar o processo de votação. E ao final verifica os resultados a qualquer
momento, sejam eles parciais ou o grande resultado final.

O objetivo deste projeto é praticar a lógica de programação em um contexto de programação orientada
a objetos e entender como esses conceitos permitem que escrevamos código mais claro, mais flexível e
mais fácil de manter.

## Habilidades trabalhadas

- `Compreender` os conceitos fundamentais da Programação Orientada a Objetos (POO) e como a
  linguagem Java aplica esses conceitos.

- `Entender` a importância de conceitos como classes, objetos, métodos, encapsulamento, herança,
  polimorfismo, interfaces e classes abstratas na POO.

- `Aplicar` os conceitos de POO na prática, através da codificação em Java.

- `Analisar` códigos Java escritos por outros, identificando o uso de conceitos de POO e entendendo
  como eles contribuem para a organização e clareza do código.

- `Criar` novos programas Java utilizando os conceitos de POO, organizando o código de maneira
  lógica e eficiente.

- `Avaliar` a eficácia de diferentes abordagens de programação em Java, considerando fatores como
  legibilidade, eficiência e facilidade de manutenção.

## Instruções para instalar e rodar

<details>

1. Clone o repositório (recomendado usar em SSH) e entre na pasta:

    ```bash
    git clone git@github.com:ludson96/sistema-votacao.git
    cd sistema-votacao
    ```

1. Instale as dependências:

    ```bash
    mvn install
    ```
1. Para executar a classe `Principal`:

    ```bash
    mvn exec:java -Dexec.mainClass=com.betrybe.sistemadevotacao.Principal
    ```

</details>

## Detalhamento de execução

<details>

Ao iniciar a classe `Principal`, irá iniciar como abaixo, perguntando se o usuário é uma pessoa
candidata. Se a pessoa usuária entrar com o valor 1 (que indica que ela quer cadastrar uma pessoa
candidata), a mensagem `Entre com o nome da pessoa candidata:` deverá ser impressa no console.

Em seguida, após inserir o nome da pessoa candidata e pressionar enter, aparecerá a
mensagem `Entre com o número da pessoa candidata:` no console. Depois que a pessoa usuária inserir o
número da pessoa candidata, o sistema deverá retornar ao estado inicial do menu.

Supondo que o nome da primeira pessoa candidata seja "Maria" e o seu número para votar seja "1",
então um exemplo do conteúdo do console após cadastrar a primeira pessoa candidata será:

```text
Cadastrar pessoa candidata?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
1
Entre com o nome da pessoa candidata:
Maria
Entre com o número da pessoa candidata:
1
Cadastrar pessoa candidata?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
```

Esse ciclo se repete até não haver mais pessoas candidatas para serem cadastradas. Quando isso
acontecer, a pessoa usuária entrará com a opção 2 do menu, o que vai parar o primeiro laço. O
segundo laço, que representa a etapa de cadastro de pessoas eleitoras, deve ser iniciado logo na
sequência.

Após finalizar o cadastro de pessoas candidatas, passamos para o cadastro de pessoas eleitoras. O
menu deverá ter o seguinte formato:

```text
Cadastrar pessoa eleitora?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
```

Se a pessoa usuária entrar com o valor 1 (que indica que ela quer cadastrar uma pessoa eleitora),
então a mensagem `Entre com o nome da pessoa eleitora:` será impressa no console. Em seguida, após
inserir o nome da pessoa eleitora e pressionar enter, aparecerá no console a
mensagem `Entre com o CPF da pessoa eleitora:`.

Depois que a pessoa usuária inserir o CPF da pessoa eleitora, o sistema deve retornar ao estado
inicial do menu. Supondo que o nome da primeira pessoa eleitora seja "João", portador do CPF "
123.456.789-00", um exemplo do conteúdo do console após cadastrá-la será:

```text
Cadastrar pessoa eleitora?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
1
Entre com o nome da pessoa eleitora:
João
Entre com o cpf da pessoa eleitora:
123.456.789-00
Cadastrar pessoa eleitora?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
 ```

Esse ciclo se repete até o esgotamento das pessoas eleitoras a serem cadastradas. Ao final desse
cadastro, a pessoa usuária entrará com a opção 2 do menu, o que vai parar o segundo laço e iniciar o
terceiro, marcando o início da votação.

### Votação

Após finalizar o cadastro de pessoas eleitoras, entramos na etapa de votação. O menu tem o
seguinte formato:

```text
 Entre com o número correspondente à opção desejada:
 1 - Votar
 2 - Resultado Parcial
 3 - Finalizar Votação
```

Se a pessoa usuária entrar com o valor 1 (que indica que ela quer computar um voto), a
mensagem `Entre com o cpf da pessoa eleitora:` deverá ser impressa no console. Em seguida, após
inserir o CPF da pessoa eleitora e pressionar enter, deverá aparecer a
mensagem `Entre com o número da pessoa candidata:` no console. Feito isso, o voto deve ser
computado, e o sistema retorna ao estado inicial do menu. Supondo que o CPF da primeira pessoa
eleitora seja "123.456.789-00", e o número da pessoa candidata seja 1, então um exemplo do conteúdo
do console após realizar um voto será:

```text
 Entre com o número correspondente à opção desejada:
 1 - Votar
 2 - Resultado Parcial
 3 - Finalizar Votação
 1
 Entre com o cpf da pessoa eleitora:
123.456.789-00
 Entre com o número da pessoa candidata:
 1
 Entre com o número correspondente à opção desejada:
 1 - Votar
 2 - Resultado Parcial
 3 - Finalizar Votação
```

Se a pessoa escolher a opção 2 ("Resultado parcial"), o resultado parcial deverá ser mostrado, mas a
votação continua. Já se a pessoa escolher a opção 3, deverá ser mostrado o resultado final, e a
execução termina.

</details>

[Git-logo]: https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white

[Git-url]: https://git-scm.com

[Java-logo]: https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white

[Java-url]: https://www.java.com/pt-BR/

[Apache-Maven-logo]: https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white

[Apache-Maven-url]: https://maven.apache.org/