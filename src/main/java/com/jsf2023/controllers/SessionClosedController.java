package com.jsf2023.controllers;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean
public class SessionClosedController {
	
	@PostConstruct
	public void init() {
		System.out.println("Cerrar sesión");
	}

	public void cerrarSesion() {
		ExternalContext  ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.invalidateSession();
		
		try {
			this.redireccionar("login.xhtml");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec =  FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}
	
}
