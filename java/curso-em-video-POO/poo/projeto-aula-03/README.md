<div align= "center" >

## Programinha 💫 atualizado

##### ( Código do programinha atualizado [Código 💫](https://github.com/Ruths2/Java/tree/main/java/curso-em-video-POO/poo/projeto-aula-03/Aula03) )

Veja como o código ficou com os modificadores de acesso: 

<a href="https://ibb.co/j45pwtQ">
   <img height= "220" src="https://i.ibb.co/C0tr9LY/Logo-Maker-com-ist-logomaker-Mon-Jan-03-21-17-41-GMT-03-00-2022.png" alt="Logo-Maker-com-ist-logomaker-Mon-Jan-03-21-17-41-GMT-03-00-2022" border="0" /></a>
  
---
  
Vamos rodar o código:
  
<a href="https://ibb.co/Xjvn279">
   <img height= "220" src="https://i.ibb.co/tQW0mqS/Logo-Maker-com-ist-logomaker-Mon-Jan-03-21-40-56-GMT-03-00-2022.png" alt="Logo-Maker-com-ist-logomaker-Mon-Jan-03-21-40-56-GMT-03-00-2022" border="0" /></a>
   
---

Ué....o que aconteceu?

Vamos verificar no diagnostico (Diagnostic) do app....

<a href="https://ibb.co/89Wtw6x">
   <img height= "220" src="https://i.ibb.co/jDcsYgw/Logo-Maker-com-ist-logomaker-Mon-Jan-03-21-54-46-GMT-03-00-2022.png" alt="Logo-Maker-com-ist-logomaker-Mon-Jan-03-21-54-46-GMT-03-00-2022" border="0" /></a>
   
---

O erro na linha 14 e 28 nos diz que o método desligado () e ligado () não é visível. Isso acontece por que o modificador de acesso é private nos dois métodos. 

Colocando os dois metódos como public o que aconteceria?....pois a variável chaveNaMao também é private...... 

<a href="https://ibb.co/3Bthc3v">
   <img height= "220" src="https://i.ibb.co/PwBCgLM/Logo-Maker-com-ist-logomaker-Tue-Jan-04-00-36-27-GMT-03-00-2022.png" alt="Logo-Maker-com-ist-logomaker-Tue-Jan-04-00-36-27-GMT-03-00-2022" border="0" /></a>
   
---

Vamos ver:

<a href="https://ibb.co/TRf7YYx">
   <img height= "220" src="https://i.ibb.co/6bMTrr7/Logo-Maker-com-ist-logomaker-Tue-Jan-04-00-45-20-GMT-03-00-2022.png" alt="Logo-Maker-com-ist-logomaker-Tue-Jan-04-00-45-20-GMT-03-00-2022" border="0" /></a>
   
---

O código rodou normalmente ✅. 

Isso acontece por que o metódo ligado () e desligado () está dentro da mesma classe que a váriavel chaveNaMao. 

Lembra que o método e atributo private pode ser utilizado somente pela classe atual? Então, se eu quisesse utilizar ele na classe Aula não conseguiria, assim como ocorreu na imagem de erro.

### Vamos continuar? 🤗

---

[⬅️ Retornar a  Programação Orientada a Objetos📃](https://github.com/Ruths2/Java/tree/main/java/curso-em-video-POO)

[⬅️ Retornar a página inicial 📃](https://github.com/Ruths2/Java)
</div>


