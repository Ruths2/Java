<div align= "center" >

 <a href="https://ibb.co/GVgvbtG">
   <img height= "280" src="https://i.ibb.co/LC4z2JB/Logo-Maker-com-ist-logomaker-Wed-Dec-29-23-09-49-GMT-03-00-2021.jpg" alt="Logo-Maker-com-ist-logomaker-Wed-Dec-29-23-09-49-GMT-03-00-2021" border="0" /></a>

## 🔹 Progamação Orientada a Objetos 🔹
</div>

### 🔸 O que é programação orientada a objetos ❓ 🤔

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

### 🔸 O que é modificador de visibilidade❓ 🤔

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
 | - modelo |
 | # quantidade |
 | # chaveNaMao |
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
   privado modelo: Real
   protegido quantidade: Inteiro
   protegido chaveNaMao: Logico

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
<div align= "center" >

[⬅️ Retornar a página inicial 📃](https://github.com/Ruths2/Java)
</div>
