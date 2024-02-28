package br.edu.unifei.ecot13.projetoFinal;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Israelita extends Pessoa
{
	private static final long serialVersionUID = 8535459153131535389L;
	private String familia;
	@OneToOne
	private Tribo tribo;
	
	public Israelita(Ocupacao ocupacao, Tribo tribo)
	{
		super(ocupacao);
		this.tribo = tribo;
	}
	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	public Tribo getTribo() {
		return tribo;
	}
	public void setTribo(Tribo tribo) {
		this.tribo = tribo;
	}
	
}
