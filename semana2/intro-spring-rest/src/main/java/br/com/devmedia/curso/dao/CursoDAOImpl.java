package br.com.devmedia.curso.dao;

import br.com.devmedia.curso.domain.Curso;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CursoDAOImpl implements CursoDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Curso curso) {

        entityManager.persist(curso);
    }

    @Override
    public void update(Curso curso) {

        entityManager.merge(curso);
    }

    @Override
    public void delete(Long id) {
            entityManager.remove(entityManager.getReference(Curso.class, id));
    }

    @Override
    public Curso findById(Long id) {
        return entityManager.find(Curso.class, id);
    }

    @Override
    public List<Curso> findAll() {
        return entityManager
                .createQuery("select c from Curso c", Curso.class)
                .getResultList();
    }

}
