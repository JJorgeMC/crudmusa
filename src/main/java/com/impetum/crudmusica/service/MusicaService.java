package com.impetum.crudmusica.service;


import java.util.List;

import com.impetum.crudmusica.entity.Musica;

public interface MusicaService {
	public int create(Musica e);
	public int update(Musica e);
	public int delete(int i);
	public Musica read(int i);
	public List<Musica> readAll();
}
