/**
 * 
 */
package com.jsf2023.services;

import java.util.ArrayList;
import java.util.List;

import com.jsf2023.entity.Empleado;

/**
 * @author Edgar Garcia Aguilar
 * clase que permite realizar la logica de negcio para empleados
 *
 */
public class EmpleadoService {
	
	public List<Empleado> consultarEmpleado() {
		List<Empleado> empleados= new ArrayList<>();
		Empleado empleado1=new Empleado("Diego","Paniagua","Lopez","Administrador",true);
		Empleado empleado2=new Empleado("Edgar","Garcia","Agular","Propietario",true);
		Empleado empleado3=new Empleado("Mario Luis","Perez","Cruz","Administrativo",true);
		
		empleados.add(empleado1);
		empleados.add(empleado2);
		empleados.add(empleado3);
		
		
		return empleados;
	}

}
