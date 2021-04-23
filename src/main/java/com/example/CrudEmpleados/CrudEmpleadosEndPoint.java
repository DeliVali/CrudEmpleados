package com.example.CrudEmpleados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import me.tell.empleados.AgregarEmpRequest;
import me.tell.empleados.AgregarEmpResponse;

@Endpoint
@Repository
@Transactional
public class CrudEmpleadosEndPoint {
    



EmpleadosClass empleados;

@Autowired
EmpleadoRepo repository;


//Agregar Empleado
  
  @PayloadRoot (namespace ="http://tell.me/empleados",localPart = "AgregarEmpRequest")
  
  @Transactional
  @ResponsePayload
  public AgregarEmpResponse AgregarEmp(@RequestPayload AgregarEmpRequest peticion){

      AgregarEmpResponse respuesta = new AgregarEmpResponse();
      empleados = new EmpleadosClass(null, null, null, null, null);
      empleados.setNombre(peticion.getNombre());
      empleados.setPuesto(peticion.getPuesto());
      empleados.setSalario(peticion.getSalario());
      empleados.setHorasTrabajo(peticion.getHorasTrabajo());

      repository.save(empleados);
      respuesta.setRespuesta("Empleado Agregado con exito");

      return respuesta;

      
  }



  

}
