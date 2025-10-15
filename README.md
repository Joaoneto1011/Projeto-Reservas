🏨 Sistema de Reservas de Quartos em Java

Este projeto é um sistema desenvolvido em Java para o gerenciamento de reservas de quartos de hotel, aplicando Programação Orientada a Objetos (POO) e tratamento de exceções personalizadas.
O sistema permite cadastrar reservas, calcular a duração da estadia e atualizar as datas com validações automáticas — tudo de forma prática e segura via terminal.

🚀 Principais Funcionalidades

✅ Cadastro de reserva com número do quarto, data de chegada e saída.

✅ Cálculo automático da duração da estadia (em noites).

✅ Validação de regras de negócio (ex.: saída antes da chegada).

✅ Atualização das datas da reserva.

✅ Tratamento de exceções personalizadas e mensagens de erro claras.

🧩 Estrutura do Projeto
🧱 Classe / Pacote	📄 Descrição
Reservas (model.entities)	Representa uma reserva de quarto, com número, chegada e saída. Possui métodos para cálculo de duração e atualização das datas com validação.
DomainException (model.exceptions)	Exceção personalizada usada para tratar erros de regras de negócio (domínio).
ProgramaPrincipal (application)	Classe principal que coleta dados do usuário, cria e atualiza reservas, exibindo os resultados no terminal.

⚙️ Tecnologias e Conceitos Utilizados

☕ Java SE 24+

💡 Programação Orientada a Objetos (POO)

🧮 Encapsulamento, Herança e Sobrescrita de Métodos

⏱️ Cálculo de duração com TimeUnit

🧠 Tratamento de exceções com try-catch e RuntimeException personalizada

📆 Manipulação de datas com SimpleDateFormat e Date

💻 Entrada de dados via terminal (Scanner)

💡 Exemplo de Execução

🧾 Entrada no terminal:

Numero do quarto: 201

Data de chegada (dd/MM/yyyy): 15/10/2025

Data de saida (dd/MM/yyyy): 20/10/2025

Reserva: Quarto 201, chegada: 15/10/2025, saida: 20/10/2025, 5 noites

Entre com os dados para atualizar a reserva:

Data de chegada (dd/MM/yyyy): 17/10/2025

Data de saida (dd/MM/yyyy): 22/10/2025

Reserva: Quarto 201, chegada: 17/10/2025, saida: 22/10/2025, 5 noites

⚠️ Saída com erro de validação:

Erro na reserva: a data de saida deve ser posterior à data de chegada

👨‍💻 Autor

João Neto

📧 neto31510@gmail.com

📱 (34) 99683-2626

🔗 LinkedIn
