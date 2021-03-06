package com.Gabriel.Biblioteca.api.dtos;

import javax.validation.constraints.NotEmpty;

public class EditoraDTO {

	private int id;
	private String codigo;
	private String nome;
	private boolean nacional;

	public EditoraDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@NotEmpty(message = "Código não deve ser vazio")
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@NotEmpty(message = "Nome não deve ser vazio")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isNacional() {
		return nacional;
	}

	public void setNacional(boolean nacional) {
		this.nacional = nacional;
	}

	@Override
	public String toString() {
		return "EditoraDTO [id=" + id + ", codigo=" + codigo + ", nome=" + nome + ", nacional=" + nacional + "]";
	}

}
