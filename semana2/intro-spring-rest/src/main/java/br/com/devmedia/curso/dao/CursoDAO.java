package br.com.devmedia.curso.dao;

import br.com.devmedia.curso.domain.Curso;

import java.util.List;

public interface CursoDAO {

    void save(Curso curso);

    void update(Curso curso);

    void delete(Long id);

    Curso findById(Long id);

    List<Curso> findAll();

}
