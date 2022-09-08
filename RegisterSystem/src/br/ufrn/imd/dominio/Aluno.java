package br.ufrn.imd.dominio;

import java.util.List;

public class Aluno extends Pessoa {
	private String matricula;
	private Curso curso;
	private double ira;
	private List<Disciplina> disciplinas;
	// cria��o dos getters e setters
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public double getIra() {
		return ira;
	}
	public void setIra(double ira) {
		this.ira = ira;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	@Override
	public String toString() {
		return getNome() + " matr�cula: " + matricula  ;
	}
}
