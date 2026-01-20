# Exercício prático – Uso de Class e Record em Java

Este projeto foi desenvolvido como um exercício prático para treinar o uso de
**classes** e **records** em Java, com foco em entender onde cada um faz mais
sentido no contexto de backend.

## 🎯 Objetivo

O objetivo do exercício foi praticar:
- o uso de `record` como DTO (Data Transfer Object)
- a separação entre objeto de domínio e objeto de transporte de dados
- a conversão de uma classe mutável para um DTO imutável

O professor apresentou o conceito de `record` em aula, e a partir disso
busquei pesquisar onde ele é utilizado na prática, especialmente em aplicações backend.

## 🧠 Conceito aplicado

- **Pessoa** → classe de domínio  
  - objeto mutável  
  - representa dados internos da aplicação  
  - pode sofrer alterações ao longo do fluxo  

- **InfoPessoa** → record (DTO)  
  - objeto imutável  
  - usado para expor dados  
  - ajuda a proteger os atributos da instância  
  - reduz a chance de efeitos colaterais e bugs  

O método `toInfoPessoa()` é responsável por realizar essa conversão.

## 🔁 Fluxo do programa

1. O usuário informa os dados via entrada padrão (Scanner)
2. Os dados são armazenados em uma instância da classe `Pessoa`
3. É feita a conversão para `InfoPessoa` (record)
4. Os dados são exibidos simulando uma visualização de resposta (requisição)

## ▶️ Execução

Compile os arquivos:
```bash
javac src/*.java
```
Execute o programa:

Copiar código
```bash
java -cp src Main
```

📌 Observações
- A entrada de dados é propositalmente simples
- O foco do projeto é o conceito, não regras de negócio complexas
- O exemplo simula a ideia de uma requisição expondo apenas os dados necessários
