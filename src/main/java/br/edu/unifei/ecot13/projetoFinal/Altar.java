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
public class Altar implements Serializable
{
	private static final long serialVersionUID = 1767287584872399860L;
	@Id
	private String local;
	private String material;
	@OneToMany
	private List<Sacerdote> sacerdotes = new ArrayList<>();
	
	public String getLocal()
	{
		return local;
	}
	public void setLocal(String local)
	{
		this.local = local;
	}
	public String getMaterial()
	{
		return material;
	}
	public void setMaterial(String material)
	{
		this.material = material;
	}
	public List<Sacerdote> getSacerdotes() {
		return sacerdotes;
	}
	public void setSacerdotes(List<Sacerdote> sacerdotes) {
		this.sacerdotes = sacerdotes;
	}
	
}
