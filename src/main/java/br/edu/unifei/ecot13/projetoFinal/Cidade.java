package br.edu.unifei.ecot13.projetoFinal;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Cidade implements Serializable
{
	private static final long serialVersionUID = -3020949437681538134L;
	@Id
	private String nome;
	private boolean capital;
	@OneToOne
	private Altar altar;
	
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public Altar getAltar()
	{
		return altar;
	}
	public void setAltar(Altar altar)
	{
		this.altar = altar;
	}
	public boolean isCapital() {
		return capital;
	}
	public void setCapital(boolean capital) {
		this.capital = capital;
	}
}
