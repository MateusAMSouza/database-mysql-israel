package br.edu.unifei.ecot13.projetoFinal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Tribo implements Serializable
{
	private static final long serialVersionUID = -4941854005462864744L;
	@Id
	private String nome;
	private int tamanho;
	private String territorio;
	@OneToMany
	private List<Cidade> cidades =new ArrayList<>();
	
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public int getTamanho()
	{
		return tamanho;
	}
	public void setTamanho(int tamanho)
	{
		this.tamanho = tamanho;
	}
	public String getTerritorio()
	{
		return territorio;
	}
	public void setTerritorio(String territorio)
	{
		this.territorio = territorio;
	}
	public List<Cidade> getCidades()
	{
		return cidades;
	}
	public void setCidades(List<Cidade> cidades)
	{
		this.cidades = cidades;
	}
}
