package com.impetum.crudmusica.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.impetum.crudmusica.dao.MusicaDao;
import com.impetum.crudmusica.entity.Musica;
import com.impetum.crudmusica.service.MusicaService;

@Service
public class MusicaServiceImp implements MusicaService{

	@Autowired
	private MusicaDao dao;
	
	@Override
	public int create(Musica e) {
		// TODO Auto-generated method stub
		return dao.create(e);
	}

	@Override
	public int update(Musica e) {
		// TODO Auto-generated method stub
		return dao.update(e);
	}

	@Override
	public int delete(int i) {
		// TODO Auto-generated method stub
		return dao.delete(i);
	}

	@Override
	public Musica read(int i) {
		// TODO Auto-generated method stub
		return dao.read(i);
	}

	@Override
	public List<Musica> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
