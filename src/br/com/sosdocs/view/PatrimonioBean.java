package br.com.sosdocs.view;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PatrimonioBean")

public class PatrimonioBean implements Serializable{
private static final long serialVersionUID = 1L; 
	
	@Id
	@GeneratedValue
	@Column(name = "marcaId")
	int marcaId;
	
	@Column(name = "nome")
	String nome;
	
	@Column(name = "nTombo")
	int nTombo;
	
	public PatrimonioBean() {}

	public PatrimonioBean(String nome, int marcaId, int nTombo) {
		this.nome = nome;
		this.marcaId = marcaId;
		this.nTombo = nTombo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMarcaId() {
		return marcaId;
	}

	public void setMarcaId(int marcaId) {
		this.marcaId = marcaId;
	}

	public int getnTombo() {
		return nTombo;
	}

	public void setnTombo(int nTombo) {
		this.nTombo = nTombo;
	}
}
