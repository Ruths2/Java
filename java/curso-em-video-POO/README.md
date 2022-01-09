<div align= "center" >

 <a href="https://ibb.co/GVgvbtG">
   <img height= "280" src="https://i.ibb.co/LC4z2JB/Logo-Maker-com-ist-logomaker-Wed-Dec-29-23-09-49-GMT-03-00-2021.jpg" alt="Logo-Maker-com-ist-logomaker-Wed-Dec-29-23-09-49-GMT-03-00-2021" border="0" /></a>

## 🔹 Progamação Orientada a Objetos 🔹
</div>

<span id='indice'>

Índice 🔖: 
</span>

<a href='#orientada'>🔸O que é Programação Orientada a Objetos.</a>

<a href='#modificadores'>🔸O que é Modificador de Visibilidade.</a>

<a href='#getters'>🔸Getters, Setters e Construtores.</a>

<a href=' '>🔸Pilares da POO: Encapsulamento.</a>

<a href=' '>🔸Pilares da POO: Herança.</a>

<a href=' '>🔸Pilares da POO: Polimorfismo.</a>

<a href=' '>🔸Projeto aplicando POO.</a>

<span id='orientada'>

### 🔶 O que é programação orientada a objetos ❓ 🤔
</span>

---

Orientação a objetos é um modelo de programação baseado em objetos, onde se divide o código em partes, trazendo:
* Confiabilidade no código.
* Diminuição do tempo no ciclo do desenvolvimento.
* Facilidade em:
  * Manutenção.
  * Extensibilidade.
  * Reutilização.
  * Leitura e compreensão.
  
Todo objeto vem a partir de uma classe (molde do objeto), e todo objeto precisa ter:
* Atributos (caracteristicas).
* Métodos (comportamentos).
* Status (estado atual).
 
Exemplo de uma classe e seus conceitos citados acima:

<div align= "center" >

 | Veiculo | 
 |--------------|
 |==========|
 | marca |
 | tipo |
 | cor |
 | modelo |
 | quantidade |
 | chaveNaMao |
 |==========|
 | status () |
 | acelerar () |
 | ligado () |
 | desligado () |
 </div>
  

```

Classe Veículo

   marca: Caractere
   tipo: Caractere
   cor: Caractere
   modelo: Real
   quantidade: Inteiro
   chaveNaMao: Logico
   
   Metodo status ()
   FimMetodo
   
   Metodo acelerar ()
      Se chaveNaMao entao
         Escreva("Acelerando")
      Senao
         Escreva("ERRO...cade as chaves?")
      FimSe
   FimMetodo

   Metodo ligado ()
      chaveNaMao = verdadeiro
   FimMetodo
   
   Metodo desligado()
      chaveNaMao = falso
   FimMetodo
   
FimClasse

```
Programinha reescrevendo o que foi feito acima em Java. ⬇️

[Programinha 💫](https://github.com/Ruths2/Java/tree/main/java/curso-em-video-POO/poo/projeto-aula-02)

---
<div align="center">

<a href='#indice'>Índice 🔖</a>
</div>

---

<span id='modificadores'>

### 🔶 O que é modificador de visibilidade❓ 🤔
</span>

---

O modicador de visibilidade ou modificador de acesso, define como será a acessibilidade daquele atributo ou método. Ele está presente nas linguagens de auto nível, como por exemplo: Java, PHP, Python, C#, C++ e etc. 

Na UML (UML ? Para saber mais clique aqui ⬆️), os modificadores de acesso são indicados pelos símbolos: +(mais),  - (menos) e # (cerquinha). 
- O simbolo de + representa a visibilidade **_publica_** (**_public_**).
- O simbolo de - representa a visibilidade **_privada_** (**_private_**).
- O simbolo de # representa a visibilidade **_protegida_** (**_protected_**).

🔓 O atributo ou o método **_public_**, poderá ser utizado por todas as classes.

🔒 O **_private_**, poderá ser utizado somente pela classe atual.

🔐 O **_protected_**, poderá ser utizado somente pela classe atual e pelas suas sub-classes.

Utilizando o  [Programinha 💫](https://github.com/Ruths2/Java/tree/main/java/curso-em-video-POO/poo/projeto-aula-02), vamos colocar aleatoriamente os modificadores de acesso:

<div align= "center" >

 | Veiculo | 
 |--------------|
 |==========|
 | + marca |
 | + tipo |
 | + cor |
 | # modelo |
 | # quantidade |
 | - chaveNaMao |
 |==========|
 | + status () |
 | + acelerar () |
 | - ligado () |
 | - desligado () |
 </div>

```
Classe Veículo

   publico marca: Caractere
   publico tipo: Caractere
   publico cor: Caractere
   protegido modelo: Real
   protegido quantidade: Inteiro
   privado chaveNaMao: Logico

   publico Metodo status ()
   FimMetodo
   
   publico Metodo acelerar ()
      Se chaveNaMao entao
         Escreva("Acelerando")
      Senao
         Escreva("ERRO...cade as chaves?")
      FimSe
   FimMetodo

   privado Metodo ligado ()
      chaveNaMao = verdadeiro
   FimMetodo
   
   privado Metodo desligado ()
      chaveNaMao = falso
   FimMetodo
   
FimClasse


```
Programinha atualizado com os modificadores de acesso. ⬇️

[Programinha 💫 atualizado](https://github.com/Ruths2/Java/blob/main/java/curso-em-video-POO/poo/projeto-aula-03/README.md)

---

<div align="center">

<a href='#indice'>Índice 🔖</a>
</div>

---

<span id='getters'>

### 🔶 Getters, Setters e Construtores 🛠️.
</span>

Os métodos especias servem para dar um acesso controlado aos atributos de um objeto. Os métodos que veremos aqui: 
- O método acessor ˋGetterˋ (getter significa: pegar).
- O método modificador ˋSetterˋ (setter significa: colocar). 

Sem os métodos especiais qualquer um poderia pegar os atributos de um objeto e manipula-los.

Ah........não esquecendo. Os métodos especiais também tem os seus Modificadores de Visibilidade 😁.

(sobre construtores aqui)

---

#### 🔸Entendendo melhor o método acessor Getter 🔸

O método ˋGetterˋ tem a função de pegar o atributo desejado, e entrega-lo à quem deseja.

Ex:

Você vai até o seu banco e pergunta ao caixa quanto tem na sua conta (é claro que na vida real o caixa eletrônico que verifica a nossa conta mas, é somente um exemplo para uma melhor compreensão), e o caixa informa que tem R$500.00 reais. Você não tem acesso direto ao sistema do banco, porém o caixa tem e ele informará o valor que tem em sua conta. Esse intermediário, "o caixa", é o ˋGetterˋ na Programação Orientada a Objetos, e ele acessa os atributos que desejamos.

Se não existisse o caixa e todos tivessem acesso ao sistema do banco, o que aconteceria 🤔?

O banco seria uma bagunça!

Não haveria organização nem segurança, pois imagine varias pessoas acessando qualquer conta, de qualquer pessoa.....não seria muito legal, né?
  
Contudo, o método acessor ˋGetterˋ, organiza essa ação de pegar e retornar o atributo desejado.

---

#### 🔸Entendendo melhor o método modificador Setter 🔸

O método ˋSetterˋ é quase igual ao método ˋGetterˋ porém, com a funcionalidade de modificar o atributo e ter que informar um parâmetro (os parâmetros ficam dentro das chaves () ).

Ex:

Ao invés de consultar sua conta, você deseja colocar mais R$200.00 reais no valor que já existe. Então você entregará o valor (que seria o parâmetro) para o caixa, e ele adicionará na sua conta, que ficará no total de R$700.00 reias. Essa pessoa, "o caixa", é o método ˋSetterˋ, conseguindo modificar o atributo de uma maneira também, organizada e segura.

---

#### 🔸Entendendo melhor o método Construtor 🔸

---

Vamos acrescentar os métodos especias ao nosso programinha? 😁

<div align= "center" >

 | Veiculo | 
 |--------------|
 |==========|
 | + marca |
 | + tipo |
 | + cor |
 | # modelo |
 | # quantidade |
 | - chaveNaMao |
 |==========|
 | + getMarca () |
 | + setMarca (ma) |
 | + getTipo () |
 | + setTipo (t) |
 | + getCor () |
 | + setCor (c) |
 | + getModelo () |
 | + setModelo (mo) |
 | + getQuantidade () |
 | + setQuantidade (q) |
 | + getChaveNaMao () |
 | + setChaveNaMao (cnm) |
 |==========|
 | + status () |
 | + acelerar () |
 | - ligado () |
 | - desligado () |
 </div>

```
Classe Veículo

   publico marca: Caractere
   publico tipo: Caractere
   publico cor: Caractere
   protegido modelo: Real
   protegido quantidade: Inteiro
   privado chaveNaMao: Logico
   
   public Metodo getMarca ()
      returne marca
   FimMetodo
   
   public Metodo setMarca (ma: Caractere)
      marca= ma
   FimMetodo
   
   public Metodo getTipo ()
      retorne tipo
   FimMetodo
   
   public Metodo setTipo (t: Caractere)
      tipo= t
   Fim Metodo
   
   public Metodo getCor ()
      retorne cor
   FimMetodo
   
   public Metodo setCor (c: Caractere)
      cor= c
   FimMetodo
   
   public Metodo getModelo () 
      retorne modelo
   FimMetodo
   
   public Metodo setModelo (mo: Real)
      modelo= mo
   FimMetodo
   
   public Metodo getQuantidade ()
      retorne quantidade
   FimMetodo
   
   public Metodo setQuantidade (q: Inteiro)
      quantidade= q
   FimMetodo
   
   public Metodo getChaveNaMao ()
      retorne chaveNaMao
   FimMetodo
   
   public Metodo setChaveNaMao (cnm: Logico)
      chaveNaMao= cnm 
   FimMetodo

   publico Metodo status ()
   FimMetodo
   
   publico Metodo acelerar ()
      Se chaveNaMao entao
         Escreva("Acelerando")
      Senao
         Escreva("ERRO...cade as chaves?")
      FimSe
   FimMetodo

   privado Metodo ligado ()
      chaveNaMao = verdadeiro
   FimMetodo
   
   privado Metodo desligado ()
      chaveNaMao = falso
   FimMetodo
   
FimClasse


```
---

<div align="center">

<a href='#indice'>Índice 🔖</a>
</div>

---

<div align= "center" >

[⬅️ Retornar a página inicial 📃](https://github.com/Ruths2/Java)
</div>


