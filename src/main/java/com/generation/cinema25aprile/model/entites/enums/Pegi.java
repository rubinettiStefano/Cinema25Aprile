package com.generation.cinema25aprile.model.entites.enums;

import lombok.Data;
import lombok.Getter;


@Getter
public enum Pegi
{
	G("General Audiences"),
	PG("Parental Guidance Suggested"),
	PG_13("Parents Strongly Cautioned"),
	R("Restricted"),
	NC_17("Adults Only");



	Pegi(String nome)
	{
		this.nome = nome;
	}

	private final String nome;

}
