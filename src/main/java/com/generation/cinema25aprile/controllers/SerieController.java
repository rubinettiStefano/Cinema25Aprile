package com.generation.cinema25aprile.controllers;

import com.generation.cinema25aprile.model.dao.SerieTvDao;
import com.generation.cinema25aprile.model.entites.SerieTv;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/serie")
public class SerieController
{
	private final SerieTvDao serieTvDao;

	public SerieController(SerieTvDao serieTvDao)
	{
		this.serieTvDao = serieTvDao;
	}

	@GetMapping
	public List<SerieTv> getAllSerie()
	{
		return serieTvDao.findAll();
	}

	@GetMapping("/{id}")
	public SerieTv getSerieById(@PathVariable Long id)
	{
		return serieTvDao.findById(id).orElse(null);
	}

	@PostMapping
	public SerieTv addSerie(@RequestBody SerieTv serieTv)
	{
		return serieTvDao.save(serieTv);
	}

	@PutMapping("/{id}")
	public SerieTv updateSerie(@PathVariable Long id, @RequestBody SerieTv serieTv)
	{
		serieTv.setId(id);
		return serieTvDao.save(serieTv);
	}

	@DeleteMapping("/{id}")
	public void deleteSerie(@PathVariable Long id)
	{
		serieTvDao.deleteById(id);
	}
}
