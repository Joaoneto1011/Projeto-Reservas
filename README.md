🏨 Sistema de Reservas de Quartos em Java

Este projeto é um sistema desenvolvido em Java para o gerenciamento de reservas de quartos, utilizando conceitos de Programação Orientada a Objetos (POO) e tratamento de exceções personalizadas.
O sistema permite cadastrar uma reserva com número do quarto e datas de chegada e saída, além de atualizar as datas de forma segura, validando erros de entrada e regras de negócio.

📋 Funcionalidades

Cadastro de reserva com número do quarto, data de chegada e data de saída.

Cálculo automático da duração da estadia (em noites).

Validação de datas (impede saída antes da chegada).

Atualização das datas de uma reserva existente.

Tratamento de exceções personalizadas e mensagens de erro claras.

🔹 Classes Principais
Classe / Pacote	Descrição
Reservas (model.entities)	Representa uma reserva de quarto, contendo número, data de chegada e saída. Possui métodos para calcular a duração e atualizar as datas com validações.
DomainException (model.exceptions)	Classe de exceção personalizada que lida com erros específicos do domínio (regras de negócio).
ProgramaPrincipal (application)	Classe principal que coleta os dados do usuário via terminal, cria e atualiza reservas, exibindo os resultados formatados.

⚙️ Tecnologias e Conceitos Aplicados

Java SE 24+

Programação Orientada a Objetos (POO)

Tratamento de Exceções Personalizadas (DomainException)

Encapsulamento e Validação de Dados

Uso de SimpleDateFormat e Date

Cálculo de duração usando TimeUnit

Entrada e saída de dados com Scanner

💡 Exemplo de Execução

Entrada no terminal:

Numero do quarto: 201
Data de chegada (dd/MM/yyyy): 15/10/2025
Data de saida (dd/MM/yyyy): 20/10/2025

Reserva: Quarto 201, chegada: 15/10/2025, saida: 20/10/2025, 5 noites

Entre com os dados para atualizar a reserva:
Data de chegada (dd/MM/yyyy): 17/10/2025
Data de saida (dd/MM/yyyy): 22/10/2025

Reserva: Quarto 201, chegada: 17/10/2025, saida: 22/10/2025, 5 noites


Saída com erro de validação (exemplo):

Erro na reserva: a data de saida deve ser posterior à data de chegada

👨‍💻 Autor

João Neto

📧 neto31510@gmail.com

📱 (34) 99683-2626

🔗 LinkedIn
