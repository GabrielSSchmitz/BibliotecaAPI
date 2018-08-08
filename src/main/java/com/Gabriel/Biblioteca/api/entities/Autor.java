package com.Gabriel.Biblioteca.api.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "autor")
public class Autor implements Serializable {

	private static final long serialVersionUID = 8458069119263096764L;

	private int id;
	private int codigo;
	private String nome;
	private String sobrenome;

	public Autor() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Column
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Column
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	@Override
	public String toString() {
		return "Autor [id=" + id + ", codigo=" + codigo + ", nome=" + nome + ", sobrenome=" + sobrenome + "]";
	}

}
