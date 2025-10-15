# 🏨 Sistema de Reservas de Hotel - Java

> Um projeto simples e elegante desenvolvido em **Java**, com foco em **orientação a objetos**, **tratamento de exceções** e **boas práticas de encapsulamento**.

---

## 📖 Descrição

Este projeto simula um **sistema de reservas de hotel**, permitindo ao usuário:
- Registrar uma nova reserva informando o número do quarto e as datas de **chegada** e **saída**;
- **Atualizar** uma reserva existente;
- **Validar** as regras de negócio, garantindo que as datas sejam consistentes e futuras;
- Calcular automaticamente a **duração da estadia** em noites.

O sistema faz uso de uma **exceção personalizada (`DomainException`)** para tratar erros de domínio, como:
- Datas inválidas;
- Datas no passado;
- Saída anterior à chegada.

---

## ⚙️ Funcionalidades Principais

✅ Cadastro de reserva (com data de chegada e saída)  
✅ Atualização de reserva existente  
✅ Cálculo automático da duração (em noites)  
✅ Tratamento de erros de domínio e formato de data  
✅ Estrutura orientada a objetos com boas práticas

---

## 🧩 Estrutura do Projeto

src/
├── application/
│ └── ProgramaPrincipal.java # Classe principal (interage com o usuário)
│
├── model/
│ ├── entities/
│ │ └── Reservas.java # Classe de domínio que representa a reserva
│ │
│ └── exceptions/
│ └── DomainException.java # Exceção personalizada de domínio
│
└── ...

Numero do quarto: 305
Data de chegada (dd/MM/yyyy): 15/10/2025
Data de saida (dd/MM/yyyy): 20/10/2025
Reserva: Quarto 305, chegada: 15/10/2025, saida: 20/10/2025, 5 noites

Entre com os dados para atualizar a reserva:
Data de chegada (dd/MM/yyyy): 16/10/2025
Data de saida (dd/MM/yyyy): 22/10/2025
Reserva: Quarto 305, chegada: 16/10/2025, saida: 22/10/2025, 6 noites
