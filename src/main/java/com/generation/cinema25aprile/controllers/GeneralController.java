package com.generation.cinema25aprile.controllers;

import com.generation.cinema25aprile.model.dao.FilmDao;
import com.generation.cinema25aprile.model.dao.SerieTvDao;
import com.generation.cinema25aprile.model.entites.ContenutoMultimediale;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/all")
public class GeneralController
{

	private final FilmDao fDao;
	private final SerieTvDao sDao;

	//è un Autowired, come quello di Angular
	public GeneralController(FilmDao fDao, SerieTvDao sDao)
	{
		this.fDao = fDao;
		this.sDao = sDao;
	}

	/**
	 * Questo metodo restituisce tutti i contenuti nel db
	 */
	@GetMapping
	public List<ContenutoMultimediale> tutto()
	{
		List<ContenutoMultimediale> res = new ArrayList<>();
		res.addAll(fDao.findAll());
		res.addAll(sDao.findAll());

		return res;
	}

	//segnaposto che viene sostituito dal valore in quel punto dell'uri
	//localhost:8080/api/all/Il%20Gladiatore -> "Il Gladiatore"
	@GetMapping("/{titolo}")
	public ContenutoMultimediale perTitolo(@PathVariable String titolo)
	{
		List<ContenutoMultimediale> res = new ArrayList<>();
		res.addAll(fDao.findAll());
		res.addAll(sDao.findAll());

		return res.stream().filter(c->c.getTitolo().equalsIgnoreCase(titolo)).findAny().orElse(null);
	}
}
