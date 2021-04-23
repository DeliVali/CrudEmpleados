package com.example.CrudEmpleados;

import org.springframework.data.jpa.repository.JpaRepository;


public interface EmpleadoRepo extends JpaRepository<EmpleadosClass,Integer> {
    
    
}
