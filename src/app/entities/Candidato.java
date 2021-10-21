package app.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Candidato {

	private String nome;
	private String idiomaNativo;
	private LocalDate dataNascimento;
	private String[] habilidadesTecnicas = new String[4];
	
	public Candidato(String nome, String idiomaNativo, String dataNascimento, String[] habilidadesTecnicas) {
		this.nome = nome;
		this.idiomaNativo = idiomaNativo;
		this.dataNascimento = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		for(int i = 0; i < habilidadesTecnicas.length; i++) {
			this.habilidadesTecnicas[i] = habilidadesTecnicas[i];
		}
		//this.dataNascimento.get
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdiomaNativo() {
		return idiomaNativo;
	}

	public void setIdiomaNativo(String idiomaNativo) {
		this.idiomaNativo = idiomaNativo;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String[] getHabilidadesTecnicas() {
		return habilidadesTecnicas;
	}

	public void setHabilidadesTecnicas(String[] habilidadesTecnicas) {
		this.habilidadesTecnicas = habilidadesTecnicas;
	}
	
}
