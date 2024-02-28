package br.edu.unifei.ecot13.projetoFinal;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Santuario implements Serializable
{
	private static final long serialVersionUID = 5366898872049993141L;
	@Id
	private String nome;
	private boolean fixo;
	private boolean destruido;
	private boolean possuiArca;
	@OneToOne
	private Altar altarSacrificio;
	
	
	
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public boolean isFixo()
	{
		return fixo;
	}
	public void setFixo(boolean fixo)
	{
		this.fixo = fixo;
	}
	public Altar getAltarSacrificio()
	{
		return altarSacrificio;
	}
	public void setAltarSacrificio(Altar altarSacrificio)
	{
		this.altarSacrificio = altarSacrificio;
	}
	public boolean isDestruido()
	{
		return destruido;
	}
	public void setDestruido(boolean destruido)
	{
		this.destruido = destruido;
	}
	public boolean isPossuiArca()
	{
		return possuiArca;
	}
	public void setPossuiArca(boolean possui)
	{
		if(possui)
		{
			this.possuiArca = true;
		}
		else
		{
			this.possuiArca = false;
		}
	}
}
