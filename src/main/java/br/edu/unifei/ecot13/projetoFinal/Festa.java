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
public class Festa implements Serializable
{
	private static final long serialVersionUID = -2206357999211244873L;
	@Id
	private String nome;
	private String mes;
	private int duracaoDias;
	private String motivo;
	@OneToMany
	private List<Pessoa> participantes = new ArrayList<>();
	
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public String getMes()
	{
		return mes;
	}
	public void setMes(String mes)
	{
		this.mes = mes;
	}
	public int getDuracaoDias()
	{
		return duracaoDias;
	}
	public void setDuracaoDias(int duracaoDias)
	{
		this.duracaoDias = duracaoDias;
	}
	public String getMotivo()
	{
		return motivo;
	}
	public void setMotivo(String motivo)
	{
		this.motivo = motivo;
	}
	public List<Pessoa> getParticipantes(){
		return participantes;
	}
	public void setParticipantes(List<Pessoa> pessoas) {
		this.participantes = pessoas;
	}
}
