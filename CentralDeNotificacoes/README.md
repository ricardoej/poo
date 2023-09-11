# Atividade: Sistema de Notificações para Rede Social

## Contexto

Você está trabalhando em um sistema de notificações para uma rede social. A central de notificações deve ser capaz de lidar com diferentes tipos de notificação, como por e-mail, SMS ou push. Sua tarefa é criar um gerenciador de notificações que permita notificar os usuários de várias maneiras.

## Tarefa

Você deve criar um módulo que seja capaz de gerenciar diferentes tipos de notificações (e-mail, SMS, push) e permitir que os usuários sejam notificados de acordo com suas preferências. Além disso, você deve criar uma classe `Main` que teste o módulo de notificações criado.

## Requisitos

1. Crie uma classe `Usuario` com os seguintes atributos privados:
   - `nome` (String)
   - `email` (String)
   - `numeroTelefone` (String)

2. Crie uma classe `Notificacao` com os seguintes atributos privados:
   - `mensagem` (String)

3. Crie três classes para tipos de notificação: `Email`, `SMS` e `Push`. Cada uma deve herdar da classe `Notificacao` e ter um método para enviar a notificação ao usuário.

4. Crie uma classe `GerenciadorNotificacoes` que seja responsável por gerenciar as notificações para os usuários. Ela deve permitir adicionar usuários, registrar suas preferências de notificação e enviar notificações de acordo com suas preferências.

5. A classe `GerenciadorNotificacoes` deve ter um método chamado `enviarNotificacao` que aceita um usuário e uma notificação como parâmetros e envia a notificação ao usuário de acordo com suas preferências.

## Desenvolvimento do Programa de Exemplo

Crie um programa de exemplo em Java que demonstre o uso do módulo de notificações criado. O programa deve:

1. Criar instâncias de diferentes tipos de notificações (por e-mail, SMS e push).

2. Criar instâncias de alguns usuários e definir suas preferências de notificação.

3. Usar o `GerenciadorNotificacoes` para enviar notificações aos usuários de acordo com suas preferências.

## Critérios de Avaliação

Você será avaliado com base nos seguintes critérios:

- Implementação correta e completa das classes `Usuario`, `Notificacao`, `Email`, `SMS`, `Push` e `GerenciadorNotificacoes`.
- Funcionamento correto do programa de exemplo, que demonstra o uso do módulo de notificações.
- Respeito aos princípios estudados.
- Qualidade do código, incluindo boas práticas de nomenclatura e formatação.
