package com.betrybe.sistemadevotacao;

import java.util.Scanner;

/**
 * Classe Principal responsável pela interface do usuário.
 */
public class Principal {

  /**
   * Método de execução padrão.
   *
   * @param args Argumentos
   */
  public static void main(String[] args) {
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");

      int inputCandidata = scanner.nextInt();

      if (inputCandidata == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String newNameCandidata = scanner.next();

        System.out.println("Entre com o número da pessoa candidata:");
        int newNumberCandidata = scanner.nextInt();

        gerenciamentoVotacao.cadastrarPessoaCandidata(newNameCandidata, newNumberCandidata);
      } else if (inputCandidata == 2) {
        break;
      }
    }

    while (true) {
      System.out.println("Cadastrar pessoa eleitora?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");

      int inputEleitora = scanner.nextInt();

      if (inputEleitora == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String newNameEleitora = scanner.next();

        System.out.println("Entre com o cpf da pessoa eleitora:");
        String newCpfEleitora = scanner.next();

        gerenciamentoVotacao.cadastrarPessoaEleitora(newNameEleitora, newCpfEleitora);
      } else if (inputEleitora == 2) {
        break;
      }
    }

    while (true) {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Votar");
      System.out.println("2 - Resultado Parcial");
      System.out.println("3 - Finalizar Votação");

      int inputVotacao = scanner.nextInt();

      if (inputVotacao == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String newCpfEleitora = scanner.next();

        System.out.println("Entre com o número da pessoa candidata:");
        int newNumberCandidata = scanner.nextInt();

        gerenciamentoVotacao.votar(newCpfEleitora, newNumberCandidata);

      } else if (inputVotacao == 2) {
        gerenciamentoVotacao.mostrarResultado();

      } else if (inputVotacao == 3) {
        gerenciamentoVotacao.mostrarResultado();
        break;
      }
    }

  }
}