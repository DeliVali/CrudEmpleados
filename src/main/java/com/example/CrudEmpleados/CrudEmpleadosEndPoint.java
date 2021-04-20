package com.example.CrudEmpleados;

import javax.websocket.Session;

import org.hibernate.Hibernate;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import me.tell.empleados.AgregarEmpRequest;
import me.tell.empleados.AgregarEmpResponse;

public class CrudEmpleadosEndPoint {
    

  //Metodo para Sumar
  @PayloadRoot (namespace ="http://tell.me/empleados",localPart = "AgregarEmpRequest")
  @ResponsePayload
  public AgregarEmpResponse agregarEmp(@RequestPayload AgregarEmpRequest peticion){





    return respuesta;
  }

  

}
