package com.jsf2023.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.jsf2023.entity.Empleado;
import com.jsf2023.services.EmpleadoService;

/**
 * @author Edgar Garcia Aguilar
 * Clase controller que se encarga de procesar la informacion para la pantalla main.xhtml
 */


//La anotacion managedBean indica que esta clase java es un controlador de JSF
@ManagedBean
@ViewScoped
public class PrincipalController {
	
	//Lista de empleados para la tabla
	private List<Empleado> empleados;
	//Servicio con los metodos que realizan la logica de negocio de empleados
	private EmpleadoService empleadoService = new EmpleadoService();
	
	/**
	 * Metodo que se encarga de inicializar la inforamcion de la pantalla main.xhtml
	 * 
	 */
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
	}
	
	//metodo que consulta la lista de empleados
	public void consultarEmpleados() {
		this.empleados = this.empleadoService.consultarEmpleado();
	}
	
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	

}
