package com.generation.cinema25aprile.model.dao;

import com.generation.cinema25aprile.model.entites.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmDao extends JpaRepository<Film,Long>
{
	Film findByTitolo(String titolo);
}
