//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.04.30 a las 09:03:01 PM CDT 
//


package me.tell.empleados;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="puesto" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="horasTrabajo" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
 *         &lt;element name="Salario" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "nombre",
    "puesto",
    "horasTrabajo",
    "salario"
})
@XmlRootElement(name = "MostrarListaEmpResponse")
public class MostrarListaEmpResponse {

    @XmlElement(type = Integer.class)
    protected List<Integer> id;
    public void setId(List<Integer> id) {
        this.id = id;
    }

    public void setNombre(List<String> nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(List<String> puesto) {
        this.puesto = puesto;
    }

    public void setHorasTrabajo(List<Integer> horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public void setSalario(List<Double> salario) {
        this.salario = salario;
    }

    @XmlElement(required = true)
    protected List<String> nombre;
    @XmlElement(required = true)
    protected List<String> puesto;
    @XmlElement(type = Integer.class)
    protected List<Integer> horasTrabajo;
    @XmlElement(name = "Salario", type = Double.class)
    protected List<Double> salario;

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getId() {
        if (id == null) {
            id = new ArrayList<Integer>();
        }
        return this.id;
    }

    /**
     * Gets the value of the nombre property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nombre property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNombre().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNombre() {
        if (nombre == null) {
            nombre = new ArrayList<String>();
        }
        return this.nombre;
    }

    /**
     * Gets the value of the puesto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the puesto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPuesto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPuesto() {
        if (puesto == null) {
            puesto = new ArrayList<String>();
        }
        return this.puesto;
    }

    /**
     * Gets the value of the horasTrabajo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the horasTrabajo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHorasTrabajo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getHorasTrabajo() {
        if (horasTrabajo == null) {
            horasTrabajo = new ArrayList<Integer>();
        }
        return this.horasTrabajo;
    }

    /**
     * Gets the value of the salario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getSalario() {
        if (salario == null) {
            salario = new ArrayList<Double>();
        }
        return this.salario;
    }

}
