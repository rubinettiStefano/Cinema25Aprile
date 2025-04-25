package com.generation.cinema25aprile.model.entites;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Episodio extends BaseEntity
{
	private int numeroStagione;
	private int numeroEpisodio;
	private int durata;
	private String titolo;
	private String descrizione;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_serie")
	//con questo il JSON di Episodio non conterrà questa proprietà
	@JsonIgnore
	private SerieTv serie;
}
