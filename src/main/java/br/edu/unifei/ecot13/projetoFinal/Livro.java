package br.edu.unifei.ecot13.projetoFinal;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Livro implements Serializable
{
	private static final long serialVersionUID = -2423560519933370114L;
	@Id
	private String titulo;
	private String proposito;
	@ManyToOne
	private Profeta autor;
	
	public String getTitulo()
	{
		return titulo;
	}
	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}
	public String getProposito()
	{
		return proposito;
	}
	public void setProposito(String proposito)
	{
		this.proposito = proposito;
	}
	public Profeta getAutor()
	{
		return autor;
	}
	public void setAutor(Profeta autor)
	{
		this.autor = autor;
	}
}
