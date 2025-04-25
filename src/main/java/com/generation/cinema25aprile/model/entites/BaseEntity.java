package com.generation.cinema25aprile.model.entites;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

//le proprietà qui dentro finiscono nelle tabelle delle classi che la estendono
@MappedSuperclass
//Getter+Setter+toString+costruttore+altraRoba
@Data
public abstract class BaseEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
}
