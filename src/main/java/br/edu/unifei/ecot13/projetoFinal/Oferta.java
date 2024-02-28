package br.edu.unifei.ecot13.projetoFinal;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Oferta implements Serializable
{
	private static final long serialVersionUID = 375172847699432882L;
	@Id
	@Enumerated
	private propositoEnum proposito;
	@Enumerated
	private tipoEnum tipo;
	
	public propositoEnum getProposito()
	{
		return proposito;
	}
	public void setProposito(propositoEnum proposito)
	{
		this.proposito = proposito;
	}
	public tipoEnum getTipo()
	{
		return tipo;
	}
	public void setTipo(tipoEnum tipo)
	{
		this.tipo = tipo;
	}
}
