1. Objetivo
   Projetar e implementar um sistema de porte muito pequeno e não completo para gerenciar e manter livros em uma biblioteca acadêmica.
   Permitir que três tipos de usuários (alunos de graduação, alunos de pós-graduação e professores) realizem o empréstimo, devolução e reserva de livros.
2. Visão Geral do Sistema
   Livros:

Identificados por código e título.
Informações adicionais: editora, autores, edição e ano da publicação.
Um livro pode ter mais de um exemplar.
Usuários:

Identificados por código e nome.
Três tipos: Aluno de Graduação, Aluno de Pós-Graduação e Professor.
Regras específicas para empréstimos:
Aluno de Graduação: Pode pegar até 3 livros por até 3 dias.
Aluno de Pós-Graduação: Pode pegar até 4 livros por até 5 dias.
Professor: Pode pegar livros por até 7 dias sem limite de quantidade.
Usuários podem fazer reservas de livros. 3. Funcionalidades
Empréstimo de Livros:

Comando: emp <código do usuário> <código do livro>.
Condições para o empréstimo:
Disponibilidade do exemplar.
Usuário não estar com livro em atraso.
Regras específicas de limite de empréstimos por tipo de usuário.
Consideração de reservas já feitas.
Mensagem de sucesso ou insucesso ao final do procedimento.
Devolução de Livros:

Comando: dev <código do usuário> <código do livro>.
Verifica se há um empréstimo em aberto do livro pelo usuário.
Mensagem de sucesso ou insucesso com motivo.
Reserva de Livros:

Comando: res <código do usuário> <código do livro>.
Limite de 3 reservas por usuário.
Mensagem de sucesso ou insucesso com motivo.
Registro de Observação de Reservas (Professores):

Comando: obs <código do usuário> <código do livro>.
Notifica o professor sempre que o livro tiver mais de duas reservas simultâneas.
Professor registra quantas vezes foi notificado.
Implementação deve permitir fácil evolução para incluir novos tipos de observadores no futuro.
Consultas:

Consulta de Livro: liv <código do livro>.
Exibe informações do livro, reservas e exemplares.
Consulta de Usuário: usu <código do usuário>.
Exibe empréstimos e reservas correntes e passadas do usuário.
Consulta de Notificações de Professor: ntf <código do professor>.
Exibe o número de vezes que o professor foi notificado sobre reservas simultâneas.
Sair do Sistema:

Comando: sai. 4. Exigências de Projeto
Persistência de Dados:

O sistema não deve usar banco de dados; dados instanciados na memória ao inicializar o sistema.
Interface do Usuário:

O sistema deve usar linha de comando, sem interface gráfica.
Classe Singleton para Comandos:

Responsável por ler comandos e mostrar respostas no console.
Esquema de Comandos:

Comunicação entre a classe de comandos e as classes de negócio deve seguir o padrão de projeto "Command".
Padrões de Projeto:

Evitar o uso de "if" ou "switch" para identificar o tipo de usuário, utilizando um padrão de projeto para gerenciar as regras de empréstimo. 5. Entrega do Trabalho
Em Duplas: Trabalho realizado por dois alunos.
Linguagem: Desenvolvido em uma linguagem orientada a objetos.
Código Fonte e Diagrama de Classes:
Submissão no AVA.
Diagrama de classes apresentado na arguição.
Arguição:
Discussão do diagrama e código fonte com o professor. 6. Critérios de Avaliação
Uso coerente dos conceitos de orientação a objetos.
Uso de padrões de projeto.
Conformidade com a descrição do trabalho. 7. Dados de Teste
O sistema deve instanciar dados de teste na memória ao inicializar.
Dados de teste incluem usuários e livros com exemplares e status.
