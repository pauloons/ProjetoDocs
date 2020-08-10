package br.com.sosdocs.view;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MarcaBean")
public class MarcaBean implements Serializable{
	private static final long serialVersionUID = 1L;  
	
	public MarcaBean() {
		
	}
	
	@Id
	@GeneratedValue
	@Column(name = "marcaIdM")
	int marcaIdM;
	
	@Column(name = "nome")
	String nome;


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMarcaIdM() {
		return marcaIdM;
	}

	public void setMarcaId(int marcaIdM) {
		this.marcaIdM = marcaIdM;
	}

	@Override
	public String toString() {
		return "Marca [nome=" + nome + ", marcaId=" + marcaIdM + "]";
	}	

}
