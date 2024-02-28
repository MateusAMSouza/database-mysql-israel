package br.edu.unifei.ecot13.projetoFinal;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Rei extends Ocupacao
{
	private static final long serialVersionUID = -950536467906729596L;
	private int reinadoAnos;
	@OneToOne
	private Exercito exercito;
	
	public void atividade() {
		if(!exercito.isAcampado())
		{
			exercito.setAcampado(true);
			System.out.println("Convocou exercito.");
		}
		else
		{
			exercito.setAcampado(false);
			System.out.println("Dispensou exercito.");
		}
	}

	public int getReinadoAnos() {
		return reinadoAnos;
	}

	public void setReinadoAnos(int reinadoAnos) {
		this.reinadoAnos = reinadoAnos;
	}

	public Exercito getExercito() {
		return exercito;
	}

	public void setExercito(Exercito exercito) {
		this.exercito = exercito;
	}
}
