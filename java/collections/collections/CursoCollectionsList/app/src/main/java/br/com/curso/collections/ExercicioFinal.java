package br.com.curso.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 

1- Crie uma lista e execute as seguintes operações:

# Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João.
# Navegue na lista exibindo cada nome no console.
# Substitua o nome Carlos por Roberto.
# Retorne o nome da posição 1.
# Remova o nome da posição 4.
# Remova o nome João.
# Retorne a quantidade de itensna lista.
# Verique se o nome Juliana existe na lista.
# Crie uma nova lista com os nomes: Ismael e Rodrigo. Adicione todos os itens da nova lista na primeira lista criada.
# Ordene os itens da lista em ordem alfabética.
# Verifique se a lista esta vazia.

*/

public class ExercicioFinal {

  public static void main(String[] args) {
     
     List<String> nomes = new ArrayList<>();
     
     nomes.add("Juliana");
     nomes.add("Pedro");
     nomes.add("Carlos");
     nomes.add("Larissa");
     nomes.add("João");
     System.out.println("=========================================");
     
     for(String verTodosElementos : nomes){
       System.out.println("---> " + verTodosElementos);
     }
     System.out.println("=========================================");
     
     nomes.set(2,"Roberto");
     System.out.println(nomes);
     System.out.println("=========================================");
     
     String nome = nomes.get(1);
     System.out.println(nome);
     System.out.println("=========================================");
     
     nome = nomes.get(4);
     System.out.println(nome);
    System.out.println("=========================================");
    
    nomes.remove("João");
    System.out.println(nomes);
    System.out.println("=========================================");
    
    int quantidade = nomes.size();
    System.out.println(quantidade);
     System.out.println("=========================================");
    
    boolean temJuliana = nomes.contains("Juliana");
    System.out.println(temJuliana);
    System.out.println("=========================================");
    
    List<String> nomes1 = new ArrayList<>();
    
    nomes1.add("Ismael");
    nomes1.add("Rodrigo");
    
    System.out.println(nomes1);
    System.out.println("====================================================");
    
    nomes.addAll(nomes1);
    
    System.out.println(nomes);
    System.out.println("====================================================");
    
    Collections.sort(nomes);
    System.out.println(nomes);
    System.out.println("====================================================");
    
    boolean vaziaOuNao = nomes.isEmpty();
    System.out.println(vaziaOuNao);
    System.out.println("=========================================");
  }

}
