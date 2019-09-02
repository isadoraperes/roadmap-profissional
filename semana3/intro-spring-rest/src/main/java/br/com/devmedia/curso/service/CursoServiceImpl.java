package br.com.devmedia.curso.service;

import br.com.devmedia.curso.dao.CursoDAO;
import br.com.devmedia.curso.domain.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoDAO dao;

    @Override
    public void save(Curso curso) {
        dao.save(curso);
    }

    @Override
    public void update(Long id, Curso curso) {
        curso.setId(id);
        dao.findById(id);
        dao.update(curso);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Curso findById(Long id) {
        return dao.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Curso> findAll() {
        return dao.findAll();
    }

    @Override
    public Curso updateDataInicio(Long id, Date dataInicio) {
        Curso curso = dao.findById(id);
        curso.setDataInicio(dataInicio);
        return curso;
    }
}
