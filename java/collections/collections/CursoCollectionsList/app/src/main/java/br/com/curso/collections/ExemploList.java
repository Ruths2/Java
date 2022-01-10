package br.com.curso.collections;

import java.util.ArrayList; // É uma classe que implementa a interface List.
import java.util.Collections; //Collections é uma coleção de interfaces e classes que facilitam a utilização de uma estrutura de dados.
import java.util.List; //É uma interface.

public class ExemploList {

  public static void main(String[] args) {
  
  List<String> nomes = new ArrayList<>(); //Cria uma lista do tipo String
      
      //O método add() adiciona um item a lista:
      nomes.add("Paulo");
      nomes.add("Olivia");
      nomes.add("Julia");
      nomes.add("Amanda");
      nomes.add("Ester");
      nomes.add("Sara");
      
      //Escreve na tela os nomes em sua posição original:
      System.out.println(nomes);
      
      nomes.set(2,"Denise"); //O método set altera o objeto/valor na posição desejada. No caso a posição: 2 (Julia) foi alterada para: Denise.
      
      //Escreve na tela os nomes com a posição alterada:
      System.out.println(nomes);
      
      //O método sort ordena essa lista em ordem alfabética:
      Collections.sort(nomes);
      
      //Escreve na tela os nomes em ordem alfabética:
      System.out.println(nomes);
   
      nomes.remove(2); //O método remove(int), remove o elemento na posição que for passada como parâmetro.
      
      System.out.println(nomes);
      
      nomes.remove("Amanda");
      
      System.out.println(nomes); //O método remove(object), remove o elemento em si.
      
      String nome = nomes.get(1); //O método get() retorna em uma vari谩vel(no caso o nome da variável foi: nome) o elemento da posição desejada.
      
      System.out.println(nome);
      
      int quantidade = nomes.size(); //O método size() retorna em uma variável(no caso o nome da variável foi: quantidade) a quantidade de elementos na lista.
      
      System.out.println(quantidade);
      
      nomes.remove(1); //Remove o elemento da posição 1.
      
      System.out.println(nomes);
      
      quantidade = nomes.size(); //Atualiza a quantidade de elementos.
      
      System.out.println(quantidade); //Ao escrever novamente a quantidade, não tem mais 4 elementos e sim 3.
      
      boolean temSara = nomes.contains("Sara"); //O método contains() retorna em uma variável(no caso o nome da variável foi: temSara) se cont茅m certo elemento na lista.
      
      System.out.println(temSara); //Retorna true (existe sim o elemento "Sara").
      
      boolean temRafael = nomes.contains("Rafael"); //Agora vamos perguntar se existe o elemento "Rafael" na lista.
      
      System.out.println(temRafael); //Retorna false (não existe o elemento Rafael na lista).
      
      boolean vaziaOuNao = nomes.isEmpty(); //O metódo isEmpty() diz se a lista esta vazia ou não.
      
      System.out.println(vaziaOuNao); //Retorna false porque a lista tem elementos nomes.
      
      for(String verTodosElementos : nomes){
        System.out.println("~~~> " + verTodosElementos);
      } //Utilizando o for each (for( : )) conseguimos percorrer toda lista.
      
      nomes.clear(); //O metódo clear() deixa a lista vazia(apaga todos os elementos da lista)
      
      vaziaOuNao = nomes.isEmpty();
      
      System.out.println(vaziaOuNao); //Retorna true porque a lista está vazia.
      
      
/*
 By: curso de Collections, prof: Wesley, Digital Innovation One.
*/
   
  }
}
