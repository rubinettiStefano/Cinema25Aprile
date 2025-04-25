package com.generation.cinema25aprile.model.entites;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Film extends ContenutoMultimediale
{
	private int durata;
	private String nazionalita;
	private int botteghino;
	private String saga;

}
