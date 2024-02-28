package br.edu.unifei.ecot13.projetoFinal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public abstract class Pessoa implements Serializable
{
	private static final long serialVersionUID = -8975975772425771819L;
	@Id
	private String nome;
	private int idade;
	private String sexo;
	@OneToOne
	private Ocupacao ocupacao;
	@OneToMany
	private List<Oferta> ofertas = new ArrayList<>();
	@ManyToOne
	private Sacerdote sacerdote;
	
	public Pessoa(Ocupacao ocupacao)
	{
		this.ocupacao = ocupacao;
	}
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public int getIdade()
	{
		return idade;
	}
	public void setIdade(int idade)
	{
		this.idade = idade;
	}
	public String getSexo()
	{
		return sexo;
	}
	public void setSexo(String sexo)
	{
		this.sexo = sexo;
	}
	public List<Oferta> getOfertas()
	{
		return ofertas;
	}
	public void setOfertas(List<Oferta> ofertas)
	{
		this.ofertas = ofertas;
	}
	public Sacerdote getSacerdote() {
		return sacerdote;
	}
	public void setSacerdote(Sacerdote sacerdote) {
		this.sacerdote = sacerdote;
	}
	public Ocupacao getOcupacao() {
		return ocupacao;
	}
}
