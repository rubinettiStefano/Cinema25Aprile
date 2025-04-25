package com.generation.cinema25aprile;

import com.generation.cinema25aprile.model.dao.EpisodioDao;
import com.generation.cinema25aprile.model.dao.FilmDao;
import com.generation.cinema25aprile.model.dao.SerieTvDao;
import com.generation.cinema25aprile.model.entites.*;
import com.generation.cinema25aprile.model.entites.enums.Pegi;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Cinema25AprileApplicationTests
{
	@Autowired
	FilmDao filmDao;

	@Autowired
	SerieTvDao serieTvDao;

	@Autowired
	EpisodioDao episodioDao;

	@Test
	void contextLoads()
	{
		// Inserimento Film
		Film gladiatore = new Film();
		gladiatore.setTitolo("Il Gladiatore");
		gladiatore.setGenere("Storico");
		gladiatore.setAnno(2000);
		gladiatore.setPegi(Pegi.R);
		gladiatore.setDurata(155);
		gladiatore.setNazionalita("USA");
		gladiatore.setBotteghino(460000000);
		gladiatore.setSaga(null);
		filmDao.save(gladiatore);

		Film vitaBella = new Film();
		vitaBella.setTitolo("La vita è bella");
		vitaBella.setGenere("Drammatico");
		vitaBella.setAnno(1997);
		vitaBella.setPegi(Pegi.PG_13);
		vitaBella.setDurata(116);
		vitaBella.setNazionalita("Italia");
		vitaBella.setBotteghino(230000000);
		vitaBella.setSaga(null);
		filmDao.save(vitaBella);

		Film inception = new Film();
		inception.setTitolo("Inception");
		inception.setGenere("Fantascienza");
		inception.setAnno(2010);
		inception.setPegi(Pegi.PG_13);
		inception.setDurata(148);
		inception.setNazionalita("USA");
		inception.setBotteghino(829000000);
		inception.setSaga(null);
		filmDao.save(inception);

		Film interstellar = new Film();
		interstellar.setTitolo("Interstellar");
		interstellar.setGenere("Fantascienza");
		interstellar.setAnno(2014);
		interstellar.setPegi(Pegi.PG_13);
		interstellar.setDurata(169);
		interstellar.setNazionalita("USA");
		interstellar.setBotteghino(677000000);
		interstellar.setSaga(null);
		filmDao.save(interstellar);

		Film parasite = new Film();
		parasite.setTitolo("Parasite");
		parasite.setGenere("Thriller");
		parasite.setAnno(2019);
		parasite.setPegi(Pegi.R);
		parasite.setDurata(132);
		parasite.setNazionalita("Corea del Sud");
		parasite.setBotteghino(263000000);
		parasite.setSaga(null);
		filmDao.save(parasite);

		// Inserimento Serie TV ed Episodi
		SerieTv breakingBad = new SerieTv();
		breakingBad.setTitolo("Breaking Bad");
		breakingBad.setGenere("Drammatico");
		breakingBad.setAnno(2008);
		breakingBad.setPegi(Pegi.R);
		breakingBad.setNumeroStagioni(5);
		breakingBad.setEmittente("AMC");

		for(int epNum = 1; epNum <= 4; epNum++) {
			Episodio ep = new Episodio();
			ep.setNumeroStagione(1);
			ep.setNumeroEpisodio(epNum);
			ep.setDurata(47);
			ep.setTitolo("Breaking Bad S01E0" + epNum);
			ep.setDescrizione("Episodio " + epNum + " della prima stagione di Breaking Bad");
			ep.setSerie(breakingBad);
			breakingBad.getEpisodi().add(ep);
		}
		serieTvDao.save(breakingBad);

		// Potresti aggiungere altre 4 serie tv con dati realistici seguendo lo stesso schema
	}
}
