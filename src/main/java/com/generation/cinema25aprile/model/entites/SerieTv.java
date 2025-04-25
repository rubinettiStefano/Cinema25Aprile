package com.generation.cinema25aprile.model.entites;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class SerieTv extends ContenutoMultimediale
{
	private int numeroStagioni;
	private String emittente;

	@OneToMany(mappedBy = "serie",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private List<Episodio> episodi = new ArrayList<>();

	@Override
	public int getDurata()
	{
		return episodi.stream().mapToInt(e-> e.getDurata()).sum();
	}
	//tutti i metodi che iniziano con get/is/has/can/should  sono getter (tutti quelli dopo il get per booleani)
	//vengono in automatico messi nel json
	public int getNumeroEpisodi()
	{
		return episodi.size();
	}
}
