<h1 align="center">🏨 Sistema de Reservas de Quartos em Java</h1> <p align="center"> <b>Projeto desenvolvido em Java para gerenciamento de reservas de quartos, aplicando Programação Orientada a Objetos (POO) e tratamento de exceções personalizadas.</b><br> Permite cadastrar reservas, calcular a duração da estadia e atualizar as datas de forma segura, com validações automáticas e mensagens de erro claras. </p>
📋 Funcionalidades Principais

🏠 Cadastro de reserva com número do quarto, data de chegada e saída.

⏱️ Cálculo automático da duração da estadia (em noites).

✅ Validação de regras de negócio (saída deve ser posterior à chegada).

🔁 Atualização das datas da reserva.

⚙️ Tratamento de exceções personalizadas (DomainException) para garantir integridade dos dados.

🧩 Estrutura do Projeto
💻 Classe / Pacote	📝 Descrição
Reservas (model.entities)	Representa uma reserva de quarto com número, chegada e saída. Possui métodos para calcular duração e atualizar datas com validação.
DomainException (model.exceptions)	Classe de exceção personalizada usada para tratar erros específicos das regras de negócio.
ProgramaPrincipal (application)	Classe principal que interage com o usuário via terminal, cria e atualiza reservas e exibe os resultados formatados.
⚙️ Tecnologias e Conceitos Aplicados
<div align="center">
🛠️ Tecnologia	💡 Conceito
☕ Java SE 24+	Linguagem principal
🧠 POO (Programação Orientada a Objetos)	Estruturação do código e modelagem de entidades
📆 SimpleDateFormat / Date	Manipulação e formatação de datas
⏳ TimeUnit	Cálculo da duração entre datas
🚨 Exceções Personalizadas	Tratamento de erros com DomainException
💻 Scanner	Entrada de dados via terminal
