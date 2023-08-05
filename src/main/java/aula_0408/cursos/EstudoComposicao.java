package aula_0408.cursos;

import java.util.ArrayList;
import java.util.List;

public class EstudoComposicao {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Carlos", "8663418265");
        Aluno aluno2 = new Aluno("Gustavo", "1956374651");
        Aluno aluno3 = new Aluno("Pedro", "0985640192");
        List<Aluno> alunos = new ArrayList<Aluno>(List.of(aluno1, aluno2, aluno3));

        Professor professor = new Professor("Gabriel", "123456789-0");

        Curso curso = new Curso("Java", 200.0F, professor, alunos);

        System.out.println(curso.getProfessor().getNome());
        System.out.println(curso);
        System.out.println(curso.getAluno().get(2).getNome());
    }
}
