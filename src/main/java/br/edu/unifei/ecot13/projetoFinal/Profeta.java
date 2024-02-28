package br.edu.unifei.ecot13.projetoFinal;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Profeta extends Ocupacao
{
	private static final long serialVersionUID = -8937106736348890760L;
	private boolean mensagem = true;
	
	public void atividade()
	{
		if(this.hasMensagem())
		{
			System.out.println("Profecia declarada.");
		}
	}
	public boolean hasMensagem()
	{
		return mensagem;
	}
	public void setMensagem(boolean mensagem)
	{
		this.mensagem = mensagem;
	}
}
