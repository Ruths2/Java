package br.com.ruth.aula03;

public class Veiculo {
    public String marca;
    public String tipo;
    public String cor;
    protected float modelo;
    protected int quantidade;
    private boolean chaveNaMao;

    public void status(){
      System.out.println("Veiculo: " + this.marca);
      System.out.println("Tipo: " + this.tipo);
      System.out.println("Cor: " + this.cor);
      System.out.println("Modelo: " + this.modelo);
      System.out.println("Quantidade em estoque: " + this.quantidade);
      System.out.println("As chaves estão nas mãos? " + this.chaveNaMao);
    }

    public void acelerar (){
      if (chaveNaMao == true){
        System.out.println("Acelerando...");
      }else {
        System.out.println("ERRO...cade as chaves?");
      }
    }

    public void ligado(){
      this.chaveNaMao = true;
    }

    public void desligado(){
      this.chaveNaMao = false;
    }
}
