package com.betrybe.sistemadevotacao;

public class Principal {

  public static void main(String[] args) {
    GerenciamentoVotacao teste1 = new GerenciamentoVotacao();

    teste1.cadastrarPessoaCandidata("Maria", 12345);
    teste1.cadastrarPessoaCandidata("José", 54321);

    teste1.cadastrarPessoaEleitora("João", "111.222.333.444-55");

    teste1.votar("111.222.333.444-55", 12345);
    teste1.mostrarResultado();
  }
}