package com.example.repository;

import com.example.model.MyEntity;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class EntityRepository {
    @PersistenceContext(unitName = "MySqlPU")
    private EntityManager entityManager;

    @Transactional
    public MyEntity create(MyEntity entity) {
        entityManager.persist(entity);
        return entity;
    }

    public MyEntity findById(Long id) {
        return entityManager.find(MyEntity.class, id);
    }

    public List<MyEntity> getEntities() {
        return entityManager.createNamedQuery("MyEntity.findAll", MyEntity.class)
                .getResultList();
    }

    @Transactional
    public MyEntity update(MyEntity entity) {
        return entityManager.merge(entity);
    }

    @Transactional
    public void delete(Long id) {
        MyEntity user = findById(id);
        if (user != null) {
            entityManager.remove(entityManager.contains(user) ? user : entityManager.merge(user));
        }
    }

}