# Projeto de Gerenciamento de Formações e Matrículas em Kotlin

Este projeto tem como objetivo fornecer uma estrutura básica para o gerenciamento de formações educacionais oferecidas pela DIO (Digital Innovation One) e o processo de matrícula de alunos nessas formações. Ele demonstra como criar instâncias de classes, estabelecer relações entre elas e realizar operações simples.

## Estrutura do Projeto

O projeto é composto por três classes principais:

1. `Formacao`: Representa uma formação educacional da DIO. Ela possui um nome, um nível (como "Básico", "Intermediário" ou "Avançado"), uma lista de conteúdos educacionais e uma lista de alunos matriculados. A classe também possui um método para matricular alunos.

2. `ConteudoEducacional`: Representa um conteúdo educacional específico dentro de uma formação. Ele possui um título e uma descrição.

3. `Aluno`: Representa um aluno interessado em participar de uma formação. Ele possui um nome e um endereço de e-mail.

## Como Usar

Você pode utilizar este projeto como base para a criação de um sistema de gerenciamento de formações e matrículas em Kotlin. Siga os passos abaixo:

1. Clone o repositório para o seu computador:


2. Personalize as classes `Formacao`, `ConteudoEducacional` e `Aluno` de acordo com os requisitos do seu projeto.

3. No arquivo `Main.kt`, crie instâncias das classes e demonstre como as formações são criadas, os conteúdos educacionais são adicionados e os alunos são matriculados.

4. Execute o projeto:

kotlin Main.kt


## Exemplo de Saída

Quando você executar o projeto, verá informações sobre a formação criada e os alunos matriculados nela. Um exemplo de saída pode ser:

Formação: Formação Android com Kotlin
Nível: Avançado
Conteúdos Educacionais:

Introdução ao Kotlin: Aprenda o básico do Kotlin.
Programação Android com Kotlin: Desenvolva apps Android com Kotlin.
Alunos Matriculados:
Nome: João, Email: joao@email.com
Nome: Maria, Email: maria@email.com

## Contribuições

Este projeto é apenas um exemplo simples e pode ser expandido para atender a requisitos mais complexos. Contribuições são bem-vindas. Sinta-se à vontade para abrir problemas, propor melhorias e enviar solicitações de pull.
