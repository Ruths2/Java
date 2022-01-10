package br.com.curso.collections;

import java.util.ArrayList; // �0�7 uma classe que implementa a interface List.
import java.util.Collections; //Collections �� uma cole�0�4�0�0o de interfaces e classes que facilitam a utiliza�0�4�0�0o de uma estrutura de dados.
import java.util.List; //�0�7 uma interface.

public class ExemploList {

  public static void main(String[] args) {
  
  List<String> nomes = new ArrayList<>(); //Cria uma lista do tipo String
      
      //O m��todo add() adiciona um item a lista:
      nomes.add("Paulo");
      nomes.add("Olivia");
      nomes.add("Julia");
      nomes.add("Amanda");
      nomes.add("Ester");
      nomes.add("Sara");
      
      //Escreve na tela os nomes em sua posi�0�4�0�0o original:
      System.out.println(nomes);
      
      nomes.set(2,"Denise"); //O m��todo set altera o objeto/valor na posi�0�4�0�0o desejada. No caso a posi�0�4�0�0o: 2 (Julia) foi alterada para: Denise.
      
      //Escreve na tela os nomes com a posi�0�4�0�0o alterada:
      System.out.println(nomes);
      
      //O m��todo sort ordena essa lista em ordem alfab��tica:
      Collections.sort(nomes);
      
      //Escreve na tela os nomes em ordem alfab��tica:
      System.out.println(nomes);
   
      nomes.remove(2); //O m��todo remove(int), remove o elemento na posi�0�4�0�0o que for passada como par�0�9metro.
      
      System.out.println(nomes);
      
      nomes.remove("Amanda");
      
      System.out.println(nomes); //O m��todo remove(object), remove o elemento em si.
      
      String nome = nomes.get(1); //O m��todo get() retorna em uma variável(no caso o nome da vari��vel foi: nome) o elemento da posi�0�4�0�0o desejada.
      
      System.out.println(nome);
      
      int quantidade = nomes.size(); //O m��todo size() retorna em uma vari��vel(no caso o nome da vari��vel foi: quantidade) a quantidade de elementos na lista.
      
      System.out.println(quantidade);
      
      nomes.remove(1); //Remove o elemento da posi�0�4�0�0o 1.
      
      System.out.println(nomes);
      
      quantidade = nomes.size(); //Atualiza a quantidade de elementos.
      
      System.out.println(quantidade); //Ao escrever novamente a quantidade, n�0�0o tem mais 4 elementos e sim 3.
      
      boolean temSara = nomes.contains("Sara"); //O m��todo contains() retorna em uma vari��vel(no caso o nome da vari��vel foi: temSara) se contém certo elemento na lista.
      
      System.out.println(temSara); //Retorna true (existe sim o elemento "Sara").
      
      boolean temRafael = nomes.contains("Rafael"); //Agora vamos perguntar se existe o elemento "Rafael" na lista.
      
      System.out.println(temRafael); //Retorna false (n�0�0o existe o elemento Rafael na lista).
      
      boolean vaziaOuNao = nomes.isEmpty(); //O met��do isEmpty() diz se a lista esta vazia ou n�0�0o.
      
      System.out.println(vaziaOuNao); //Retorna false porque a lista tem elementos nomes.
      
      for(String verTodosElementos : nomes){
        System.out.println("~~~> " + verTodosElementos);
      } //Utilizando o for each (for( : )) conseguimos percorrer toda lista.
      
      nomes.clear(); //O met��do clear() deixa a lista vazia(apaga todos os elementos da lista)
      
      vaziaOuNao = nomes.isEmpty();
      
      System.out.println(vaziaOuNao); //Retorna true porque a lista est�� vazia.
      
      
/*
 By: curso de Collections, prof: Wesley, Digital Innovation One.
*/
   
  }
}
