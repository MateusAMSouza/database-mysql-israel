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
public class Exercito implements Serializable
{
	private static final long serialVersionUID = -2623187568635775140L;
	@Id
	private int tamanho;
	private boolean acampado = false;
	@OneToMany
	private List<Tribo> tribos = new ArrayList<>();
	
	public boolean isAcampado() {
		return acampado;
	}
	public void setAcampado(boolean acampado) {
		this.acampado = acampado;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public List<Tribo> getTribos() {
		return tribos;
	}
	public void setTribos(List<Tribo> tribos) {
		this.tribos = tribos;
	}
}
