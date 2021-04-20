package com.example.CrudEmpleados;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.cache.support.NullValue;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class Empleados {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void insertWithQuery(Tablaempleados empleados) {
        entityManager.createNativeQuery("INSERT INTO empleados (id, horas_trabajo, nombre,puesto,salario) VALUES (NULL,?,?,?,?)")
          .setParameter(1, empleados.getId())
          .setParameter(2, empleados.getHorasTrabajo())
          .setParameter(3, empleados.getNombre())
          .setParameter(4, empleados.getPuesto())
          .setParameter(5, empleados.getSalario()) 
          .executeUpdate();
    }


    @Query
    public void givenPersonEntity_whenInsertedTwiceWithNativeQuery_thenPersistenceExceptionExceptionIsThrown() {
        Tablaempleados empleados = new Tablaempleados(1, 20, "lastname","xd",2.5);
    
        assertThatExceptionOfType(PersistenceException.class).isThrownBy(() -> {
            personInsertRepository.insertWithQuery(TABLAEMPLEADOS);
            personInsertRepository.insertWithQuery(TABLAE);
        });
    }


    
}
