package br.edu.unifei.ecot13.projetoFinal;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public abstract class Ocupacao implements Serializable
{
	private static final long serialVersionUID = 1589022296908111364L;
	@Id
	@GeneratedValue
	private int codigo;

}
