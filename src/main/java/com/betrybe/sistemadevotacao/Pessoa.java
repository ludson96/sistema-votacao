package com.betrybe.sistemadevotacao;

/**
 * Classe abstrata que serve apenas como herança para as filhas.
 */
public abstract class Pessoa {
  protected String nome;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}