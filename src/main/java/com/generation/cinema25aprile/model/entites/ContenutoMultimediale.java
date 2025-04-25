package com.generation.cinema25aprile.model.entites;

import com.generation.cinema25aprile.model.entites.enums.Pegi;
import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;

//salverò oggetti di questo tipo nel db
@MappedSuperclass
@Data
//sono due metodi di Object, che Data overrida
//con questa annotazione gli diciamo di chiamare nell'override quello
//del supertipo
@EqualsAndHashCode(callSuper = true)
public abstract class ContenutoMultimediale extends BaseEntity
{
	protected String titolo;
	protected String genere;
	protected int anno;
	protected Pegi pegi;

	public abstract int getDurata();
}




