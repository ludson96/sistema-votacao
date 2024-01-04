package com.betrybe.sistemadevotacao;

/**
 * Classe de pessoa Candidata na eleição.
 */
public class PessoaCandidata extends Pessoa {
  private int numero;
  private int votos;

  public PessoaCandidata(String nome, int numero) {
    super.setNome(nome);
    this.numero = numero;
  }

  public void receberVoto() {
    this.votos++;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getVotos() {
    return votos;
  }
}