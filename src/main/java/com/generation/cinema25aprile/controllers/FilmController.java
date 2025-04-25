package com.generation.cinema25aprile.controllers;

import com.generation.cinema25aprile.model.dao.FilmDao;
import com.generation.cinema25aprile.model.entites.Film;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/film")
public class FilmController
{
	private final FilmDao filmDao;

	public FilmController(FilmDao filmDao)
	{
		this.filmDao = filmDao;
	}

	@GetMapping
	public List<Film> getAllFilms()
	{
		return filmDao.findAll();
	}

	@GetMapping("/{id}")
	public Film getFilmById(@PathVariable Long id)
	{
		return filmDao.findById(id).orElse(null);
	}

	@PostMapping
	public Film addFilm(@RequestBody Film film)
	{
		return filmDao.save(film);
	}

	@PutMapping("/{id}")
	public Film updateFilm(@PathVariable Long id, @RequestBody Film film)
	{
		film.setId(id);
		return filmDao.save(film);
	}

	@DeleteMapping("/{id}")
	public void deleteFilm(@PathVariable Long id)
	{
		filmDao.deleteById(id);
	}
}