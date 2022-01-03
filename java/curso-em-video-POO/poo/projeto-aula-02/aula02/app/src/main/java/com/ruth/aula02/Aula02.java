package com.ruth.aula02;

import com.ruth.aula02.Veiculo;


public class Aula02 {

  public static void main(String[] args) {
      Veiculo v1 = new Veiculo();
      
      v1.marca = "Toyoto";
      v1.tipo = "Caminhonete";
      v1.cor = "Vermelha";
      v1.modelo = 2.0f;
      v1.quantidade = 6;
      
      v1.desligado();
      v1.status();
      v1.acelerar();
      
      System.out.println("---------------------------------------");
      
      Veiculo v2 = new Veiculo();
      
      v2.marca = "Honda";
      v2.tipo = "Moto";
      v2.cor = "Preta";
      v2.modelo = 1.0f;
      v2.quantidade = 10;
      
      v2.ligado();
      v2.status();
      v2.acelerar();
  }
}
