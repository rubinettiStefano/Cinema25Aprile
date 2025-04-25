package com.generation.cinema25aprile.model.dao;

import com.generation.cinema25aprile.model.entites.SerieTv;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieTvDao extends JpaRepository<SerieTv,Long>
{
	SerieTv findByTitolo(String titolo);
}
