<div align= "center" >

 <a href="https://ibb.co/GVgvbtG">
   <img height= "280" src="https://i.ibb.co/LC4z2JB/Logo-Maker-com-ist-logomaker-Wed-Dec-29-23-09-49-GMT-03-00-2021.jpg" alt="Logo-Maker-com-ist-logomaker-Wed-Dec-29-23-09-49-GMT-03-00-2021" border="0" /></a>

## 🔹 Progamação Orientada a Objetos 🔹
</div>

Índice 🔖:

<a href='#orientada'>🔸O que é Programação Orientada a Objetos.</a>

<a href='#modificadores'>🔸O que é Modificador de Visibilidade.</a>

<a href=' '>🔸Getters, Setters e Construtores.</a>

<a href=' '>🔸Pilares da POO: Encapsulamento.</a>

<a href=' '>🔸Pilares da POO: Herança.</a>

<a href=' '>🔸Pilares da POO: Polimorfismo.</a>

<a href=' '>🔸Projeto aplicando POO.</a>

<span id='orientada'></span>
<p>

### 🔶 O que é programação orientada a objetos ❓ 🤔
<p>

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

<span id='modificadores'></span>
<p>

### 🔶 O que é modificador de visibilidade❓ 🤔
</p>

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

<span id='getters'></span>

### 🔶 Getters, Setters e Construtores 🛠️.

Os métodos especias servem para dar um acesso controlado aos atributos de um objeto. São eles: o método acessor ˋGetterˋ (getter significa: pegar) e o método modificador ˋSetterˋ (setter significa: colocar). Sem os métodos especiais qualquer um poderia pegar os atributos de um objeto e manipula-los.

(sobre construtores aqui)

---

#### 🔸Entendendo melhor o método acessor Getter 🔸

O método ˋGetterˋ tem a função de pegar o atributo desejado, e entrega-lo à quem deseja.

Ex:
Você vai até uma loja de calçados e começa a olhar as vitrines. Quando você encontra um sapato que deseja, você pede ao vendedor para pega-lo, assim você poderá experimentar o sapato e etc. Nesse caso o vendedor seria o método Getter, pois ele pega o que você deseja, e lhe entrega. 

Se não existisse o vendedor, o que aconteceria 🤔?

Sim.....a loja ficaria uma bagunça. Não haveria organização nem segurança, pois imagine varias pessoas pegando varios calçados e experimentando, poderiam estraga-los, sem contar com a possibilidade de duas, ou mais pessoas pegar ao mesmo tempo o mesmo calçado.
  
Contudo, o método acessor ˋGetterˋ, organiza essa ação de pegar e retornar o atributo desejado.

---

#### 🔸Entendendo melhor o método modificador Setter 🔸



---
No código ficaria assim:

Classe Loja
   
   sandálias
   public chinelos
   sapatos
   public roupas
   
   public static void main

---

<div align= "center" >

[⬅️ Retornar a página inicial 📃](https://github.com/Ruths2/Java)
</div>
