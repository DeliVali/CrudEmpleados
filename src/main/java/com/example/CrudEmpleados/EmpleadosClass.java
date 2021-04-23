package com.example.CrudEmpleados;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity




public class EmpleadosClass {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
Integer id;
String nombre;
String puesto;
Integer horasTrabajo;
Double salario;


//constructor
public EmpleadosClass(Integer id,Integer horasTrabajo, String nombre, String puesto,  Double salario) {
    this.id = id;
    this.nombre = nombre;
    this.puesto = puesto;
    this.horasTrabajo = horasTrabajo;
    this.salario = salario;
}
public EmpleadosClass() {
    
}


public Integer getId() {
    return id;
}
public void setId(Integer id) {
    this.id = id;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getPuesto() {
    return puesto;
}
public void setPuesto(String puesto) {
    this.puesto = puesto;
}
public Integer getHorasTrabajo() {
    return horasTrabajo;
}
public void setHorasTrabajo(Integer horasTrabajo) {
    this.horasTrabajo = horasTrabajo;
}
public Double getSalario() {
    return salario;
}
public void setSalario(Double salario) {
    this.salario = salario;
}
}



