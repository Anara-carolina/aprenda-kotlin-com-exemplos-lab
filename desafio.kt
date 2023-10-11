class Formacao(
    val nome: String,
    val nivel: String,
    val conteudosEducacionais: List<ConteudoEducacional>
) {
    val alunosMatriculados = mutableListOf<Aluno>()

    fun matricularAluno(aluno: Aluno) {
        alunosMatriculados.add(aluno)
    }
}

class ConteudoEducacional(
    val titulo: String,
    val descricao: String
)

class Aluno(
    val nome: String,
    val email: String
)

fun main() {
    // Criando conteúdos educacionais
    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", "Aprenda o básico do Kotlin.")
    val conteudo2 = ConteudoEducacional("Programação Android com Kotlin", "Desenvolva apps Android com Kotlin.")

    // Criando uma formação e adicionando conteúdos educacionais
    val formacao = Formacao("Formação Android com Kotlin", "Avançado", listOf(conteudo1, conteudo2))

    // Criando alunos
    val aluno1 = Aluno("João", "joao@email.com")
    val aluno2 = Aluno("Maria", "maria@email.com")

    // Matriculando alunos na formação
    formacao.matricularAluno(aluno1)
    formacao.matricularAluno(aluno2)

    // Imprimindo informações da formação e dos alunos matriculados
    println("Formação: ${formacao.nome}")
    println("Nível: ${formacao.nivel}")
    println("Conteúdos Educacionais:")
    for (conteudo in formacao.conteudosEducacionais) {
        println("- ${conteudo.titulo}: ${conteudo.descricao}")
    }

    println("Alunos Matriculados:")
    for (aluno in formacao.alunosMatriculados) {
        println("- Nome: ${aluno.nome}, Email: ${aluno.email}")
    }
}

