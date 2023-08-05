package aula_0408.cursos;

import java.util.List;

public class Curso {
    // Composição de Objetos -> Representação de Objetos dentro de outros Objetos

    private String nome;
    private Float cargaHoraria;
    private Professor professor;
    private List<Aluno> aluno;

    public Curso() {
    }

    public Curso(String nome, Float cargaHoraria, Professor professor, List<Aluno> aluno) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
        this.aluno = aluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAluno() {
        return aluno;
    }

    public void setAluno(List<Aluno> aluno) {
        this.aluno = aluno;
    }

    @Override
    public String toString() {
        return nome + " " + cargaHoraria + " " + professor + " " + aluno;
    }
}
