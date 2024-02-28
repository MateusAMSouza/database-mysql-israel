package br.edu.unifei.ecot13.projetoFinal;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Estrangeiro extends Pessoa
{
	private static final long serialVersionUID = 9061157912690079661L;
	private String origem;
	
	public Estrangeiro(Ocupacao ocupacao)
	{
		super(ocupacao);
	}
	public String getOrigem()
	{
		return origem;
	}
	public void setOrigem(String origem)
	{
		this.origem = origem;
	}
}
