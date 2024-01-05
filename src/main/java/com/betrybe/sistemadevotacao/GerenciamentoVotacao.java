package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

/**
 * Classe para gerenciar a votação.
 */
public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {

  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<>();
  private ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<>();
  private ArrayList<String> cpfsComputados = new ArrayList<>();

  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (PessoaCandidata numeroPessoa : this.pessoasCandidatas) {
      if (numeroPessoa.getNumero() == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
        return;
      }
    }

    this.pessoasCandidatas.add(new PessoaCandidata(nome, numero));
  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora cpfPessoa : this.pessoasEleitoras) {
      if (cpfPessoa.getCpf().equals(cpf)) {
        System.out.println("Pessoa eleitora já cadastrada!");
        return;
      }
    }

    this.pessoasEleitoras.add(new PessoaEleitora(nome, cpf));
  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    if (this.cpfsComputados.contains(cpfPessoaEleitora)) {
      System.out.println("Pessoa eleitora já votou!");
      return;
    }

    for (PessoaCandidata candidata : pessoasCandidatas) {
      if (candidata.getNumero() == numeroPessoaCandidata) {
        candidata.receberVoto();
      }
    }

    this.cpfsComputados.add(cpfPessoaEleitora);
  }

  @Override
  public void mostrarResultado() {
    if (cpfsComputados.isEmpty()) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
      return;
    }

    for (PessoaCandidata candidata : pessoasCandidatas) {
      int percent = (int) (((double) candidata.getVotos() / cpfsComputados.size()) * 100);

      System.out.printf("Nome: %s - %d votos ( %d%n", candidata.getNome(), candidata.getVotos(),
          percent);
    }

    System.out.printf("Total de votos: %d%n", this.cpfsComputados.size());
  }
}