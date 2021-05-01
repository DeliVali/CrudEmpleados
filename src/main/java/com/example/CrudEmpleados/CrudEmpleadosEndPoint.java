package com.example.CrudEmpleados;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import me.tell.empleados.AgregarEmpRequest;
import me.tell.empleados.AgregarEmpResponse;
import me.tell.empleados.EditarEmpRequest;
import me.tell.empleados.EditarEmpResponse;
import me.tell.empleados.EliminarEmpRequest;
import me.tell.empleados.EliminarEmpResponse;
import me.tell.empleados.MostrarEmpRequest;
import me.tell.empleados.MostrarEmpResponse;
import me.tell.empleados.MostrarListaEmpRequest;
import me.tell.empleados.MostrarListaEmpResponse;

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

  

  //Eliminar Empleado
  
@PayloadRoot (namespace ="http://tell.me/empleados",localPart = "EliminarEmpRequest")
  
@Transactional
@ResponsePayload
public EliminarEmpResponse EliminarEmp(@RequestPayload EliminarEmpRequest peticion){
    EliminarEmpResponse respuesta = new EliminarEmpResponse();

    repository.deleteById(peticion.getId());
    respuesta.setRespuesta("Empleado eliminado con exito");

    return respuesta;

    
}




//Editar

@PayloadRoot (namespace ="http://tell.me/empleados",localPart = "EditarEmpRequest")

@Transactional
@ResponsePayload
public EditarEmpResponse EditarEmp(@RequestPayload EditarEmpRequest peticion){
    EditarEmpResponse respuesta = new EditarEmpResponse();
    empleados = new EmpleadosClass(null, null, null, null, null);
    empleados.setId(peticion.getId());
    empleados.setNombre(peticion.getNombre());
    empleados.setPuesto(peticion.getPuesto());
    empleados.setSalario(peticion.getSalario());
    empleados.setHorasTrabajo(peticion.getHorasTrabajo());
    boolean res = repository.existsById(peticion.getId());
    if(res){
      repository.save(empleados);
      respuesta.setRespuesta("Empleado editado con exito");
    }else{
      respuesta.setRespuesta("Ese id no existe, el empleado no fue editado");
    }
    return respuesta;

    
}
  
//Mostrar Empleado
  
@PayloadRoot (namespace ="http://tell.me/empleados",localPart = "MostrarEmpRequest")
  
@Transactional
@ResponsePayload
public MostrarEmpResponse MostrarEmp(@RequestPayload MostrarEmpRequest peticion){
    MostrarEmpResponse respuesta = new MostrarEmpResponse();
    EmpleadosClass res = new EmpleadosClass();
    boolean bus = repository.existsById(peticion.getId());
    if(bus){
      res = repository.getOne(peticion.getId());
      respuesta.setNombre(res.getNombre());
      respuesta.setPuesto(res.getPuesto());
      respuesta.setHorasTrabajo(res.getHorasTrabajo());
      respuesta.setSalario(res.getSalario());
    }else{
    }
    return respuesta;

    
}


//Mostrar Lista
  
@PayloadRoot (namespace ="http://tell.me/empleados",localPart = "MostrarListaEmpRequest")
  
@Transactional
@ResponsePayload
public MostrarListaEmpResponse MostrarListaEmpResponse(@RequestPayload MostrarListaEmpRequest peticion){
    
  List<Integer> idList = new ArrayList<Integer>();
  List<String> nombreList = new ArrayList<String>();
  List<String> puestoList = new ArrayList<String>();
  List<Integer> horasTList = new ArrayList<Integer>();
  List<Double> salarioList = new ArrayList<Double>();

    List<EmpleadosClass> res = new ArrayList<EmpleadosClass>();
    EmpleadosClass aux = new EmpleadosClass();
    res = repository.findAll();
  MostrarListaEmpResponse respuesta = new MostrarListaEmpResponse();
    for(int i=0; i<res.size(); i++){
      aux = res.get(i);
        idList.add(aux.getId());
        nombreList.add(aux.getNombre());
        puestoList.add(aux.getPuesto());
        horasTList.add(aux.getHorasTrabajo());
        salarioList.add(aux.getSalario());
    }
    respuesta.setId(idList);
      respuesta.setNombre(nombreList);
      respuesta.setPuesto(puestoList);
      respuesta.setHorasTrabajo(horasTList);
      respuesta.setSalario(salarioList);
     
    return respuesta;   
  }
}


