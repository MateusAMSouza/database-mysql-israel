package br.edu.unifei.ecot13.projetoFinal;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Sacerdote extends Ocupacao
{
	private static final long serialVersionUID = -1615248410046368144L;
	private boolean sumoSacerdote;
	@ManyToOne
	private Altar altar;
	@OneToMany
	private List<Pessoa> pessoas = new ArrayList<>();
	
	public void atividade()
	{
		System.out.println("Cuidando do altar de " + altar.getLocal()+" .");
	}
	
	public void realizaSacrifiico()
	{
		if(this.pessoas.get(0).getOfertas().isEmpty())
		{
			System.out.println(pessoas.get(0).getNome() + " nao possui ofertas");
		}
		else
		{
			System.out.println("Sacerdote realizou o sacrificio de "
					+ this.pessoas.get(0).getOfertas().get(0).getProposito() + " com "
					+ this.pessoas.get(0).getOfertas().get(0).getTipo() + 
					" ofertado por " + this.pessoas.get(0).getNome() + " no altar em " + this.altar.getLocal());
					this.pessoas.get(0).getOfertas().remove(0);
		}
	}
	
	public boolean isSumoSacerdote()
	{
		return sumoSacerdote;
	}

	public void setSumoSacerdote(boolean sumoSacerdote)
	{
		this.sumoSacerdote = sumoSacerdote;
	}

	public Altar getAltar()
	{
		return altar;
	}

	public void setAltar(Altar altar)
	{
		this.altar = altar;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoa(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
}
