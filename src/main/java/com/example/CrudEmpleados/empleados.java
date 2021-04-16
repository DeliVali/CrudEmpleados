package com.example.CrudEmpleados;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class empleados {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String nombre;
    String puesto;
    Integer horasTrabajo;
    Double salario;

    
}
