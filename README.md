# Sistema de Reservas de Hotel em Java

Este projeto é um sistema desenvolvido em Java para gerenciamento de **reservas de quartos em hotel**, utilizando **Programação Orientada a Objetos (POO)**.  
Ele permite criar reservas, atualizar datas de chegada e saída, calcular a duração da estadia e exibir os detalhes das reservas no terminal.

---

## 📋 Funcionalidades

- Cadastro de reservas com número do quarto, data de chegada e data de saída.  
- Atualização de datas da reserva com validação de datas futuras.  
- Cálculo automático da duração da estadia em noites.  
- Tratamento de erros de domínio com mensagens claras para o usuário.  
- Exibição formatada das reservas no terminal.

---

## 🔹 Classes Principais

| Classe / Pacote | Descrição |
|-----------------|-----------|
| `Reservas` | Representa uma reserva de quarto com atributos `numeroQuarto`, `chegada` e `saida`. Contém métodos para calcular a duração da estadia (`duracao()`) e atualizar as datas (`atualizarDatas()`). |
| `DomainException` | Exceção personalizada para tratar erros de negócio, como datas inválidas ou saída anterior à chegada. |
| `ProgramaPrincipal` | Classe principal que interage com o usuário, realiza o cadastro e atualização das reservas e exibe os resultados no terminal. |

---

## ⚙️ Tecnologias e Conceitos Aplicados

- Java SE 24+  
- Programação Orientada a Objetos (POO)  
- Encapsulamento e validação em construtores  
- Sobrescrita do método `toString()`  
- Tratamento de exceções com `try/catch`  
- Exceções personalizadas (`DomainException`)  
- Manipulação e formatação de datas com `SimpleDateFormat`  
- Conversão de tempo em milissegundos para dias com `TimeUnit`  

---

## 👨‍💻 Autor

João Neto  

neto31510@gmail.com  

(34) 99683-2626  

[LinkedIn](https://www.linkedin.com/in/joao-rodrigues-neto-855757293)

