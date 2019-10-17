package com.impetum.crudmusica.daoimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.impetum.crudmusica.dao.MusicaDao;
import com.impetum.crudmusica.entity.Musica;

@Transactional
@Repository
public class MusicaDaoImp implements MusicaDao{
	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public int create(Musica e) {
		String sql = "INSERT INTO musica VALUES (null, ?, ?)";		
		return jdbc.update(sql, e.getTitulo(), e.getAutor());
	}

	@Override
	public int update(Musica e) {
		String sql = "UPDATE musica SET titulo = ?, autor = ? WHERE idmusica = ?";
		return jdbc.update(sql, e.getTitulo(), e.getAutor(), e.getIdmusica());
	}

	@Override
	public int delete(int i) {
		String sql = "DELETE musica WHERE idmusica = ?";
		return jdbc.update(sql, i);
	}

	@Override
	public Musica read(int i) {
		String sql = "SELECT * FROM musica WHERE idmusica = ?";
		return jdbc.queryForObject(sql, new Object[] {i}, new BeanPropertyRowMapper<>(Musica.class));
	}

	@Override
	public List<Musica> readAll() {
		String sql = "SELECT * FROM musica";
		return jdbc.query(sql, new BeanPropertyRowMapper<>(Musica.class));
	}
	
}
