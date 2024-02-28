package br.edu.unifei.ecot13.projetoFinal;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Pastor extends Ocupacao
{
	private static final long serialVersionUID = 4763646574396534018L;
	private int tamanhoRebanho;
	
	public void atividade()
	{
		System.out.println("Cuidando do rebanho de " + this.getTamanhoRebanho() + " cabecas.");
	}
	public int getTamanhoRebanho()
	{
		return tamanhoRebanho;
	}
	public void setTamanhoRebanho(int tamanhoRebanho)
	{
		this.tamanhoRebanho = tamanhoRebanho;
	}
}
