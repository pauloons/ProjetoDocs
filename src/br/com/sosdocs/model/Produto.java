package br.com.sosdocs.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Produto")

public class Produto implements Serializable{
private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
int id;
@Column(name = "nome")
String nome;
@Column(name = "marca")
String marca;
@Column(name = "valor")
float valor;

public Produto() {}

public Produto(int id, String nome) {
	super();
	this.id = id;
	this.nome = nome;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public float getValor() {
	return valor;
}
public void setValor(float valor) {
	this.valor = valor;
}

}
