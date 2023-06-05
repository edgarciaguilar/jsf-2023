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
		Empleado empleado4=new Empleado("Maritza","Perez","Cruz","Administrativo",true);
		Empleado empleado5=new Empleado("Luis Alberto","Perez","Cruz","Administrativo",true);
		Empleado empleado6=new Empleado("Mario","Jose","Garcia","Administrativo",true);
		Empleado empleado7=new Empleado("Jesus Eleazar","Montes","Cruz","Administrativo",false);
		Empleado empleado8=new Empleado("Jose","Perez","Urbina","Administrativo",true);
		Empleado empleado9=new Empleado("Carlos","Lopez","Sanchez","Administrativo",true);
		Empleado empleado10=new Empleado("Jacinto","Cervantes","de Jesus","Administrativo",false);
		Empleado empleado11=new Empleado("Yolanda","Velez","Hernandez","Propietario",true);
		Empleado empleado12=new Empleado("Epifania","Jose","Ventura","Administrativo",true);
		Empleado empleado13=new Empleado("Aurora","Montes","Montes","Propietario",false);
		Empleado empleado14=new Empleado("Lucila","Hernandez","Cruz","Administrativo",true);
		Empleado empleado15=new Empleado("Jahir","Monets","Cruz","Propietario",false);
		Empleado empleado16=new Empleado("Betsabe","Juarez","Avendaño","Administrativo",true);
		Empleado empleado17=new Empleado("Elizabeth","Lopez","Cruz","Propietario",true);
		Empleado empleado18=new Empleado("Angel","Guzman","Santiago","Administrativo",false);
		Empleado empleado19=new Empleado("Adrian","Aparicio","Santiago","Administrativo",true);
		
		empleados.add(empleado1);
		empleados.add(empleado2);
		empleados.add(empleado3);
		empleados.add(empleado4);
		empleados.add(empleado5);
		empleados.add(empleado6);
		empleados.add(empleado7);
		empleados.add(empleado8);
		empleados.add(empleado9);
		empleados.add(empleado10);
		empleados.add(empleado11);
		empleados.add(empleado12);
		empleados.add(empleado13);
		empleados.add(empleado14);
		empleados.add(empleado15);
		empleados.add(empleado16);
		empleados.add(empleado17);
		empleados.add(empleado18);
		empleados.add(empleado19);
		
		
		
		
		
		return empleados;
	}

}
