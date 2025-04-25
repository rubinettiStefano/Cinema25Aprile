package com.generation.cinema25aprile.model.dao;

import com.generation.cinema25aprile.model.entites.Episodio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EpisodioDao extends JpaRepository<Episodio,Long>
{
	List<Episodio> findAllBySerie_Titolo(String serieTitolo);

	List<Episodio> findAllBySerie_TitoloAndNumeroStagione(String serieTitolo, int numeroStagione);

	Episodio findBySerie_TitoloAndNumeroStagioneAndNumeroEpisodio(String serieTitolo, int numeroStagione, int numeroEpisodio);
}
