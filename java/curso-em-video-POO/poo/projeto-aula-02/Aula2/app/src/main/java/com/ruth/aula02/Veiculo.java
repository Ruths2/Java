package com.ruth.aula02;

public class Veiculo {
    String marca;
    String tipo;
    String cor;
    float modelo;
    int quantidade;
    boolean chaveNaMao;
    
    void status(){
      System.out.println("Veiculo: " + this.marca);
      System.out.println("Tipo: " + this.tipo);
      System.out.println("Cor: " + this.cor);
      System.out.println("Modelo: " + this.modelo);
      System.out.println("Quantidade em estoque: " + this.quantidade);
      System.out.println("As chaves estão nas mãos? " + this.chaveNaMao);
    }
    
    void acelerar (){
      if (chaveNaMao == true){
        System.out.println("Acelerando...");
      }else {
        System.out.println("ERRO...cade as chaves?");
      }
    }
    
    void ligado(){
      this.chaveNaMao = true;
    }
    
    void desligado(){
      this.chaveNaMao = false;
    }
}
