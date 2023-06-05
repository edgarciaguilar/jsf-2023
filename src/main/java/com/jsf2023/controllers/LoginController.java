package com.jsf2023.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.jsf2023.dto.UsuarioDTO;

/*
 * @autor Edgar García 
 * Clase que controla el login al sistema 25-05-2023
 * */

@ManagedBean
public class LoginController {

	private String usuario;
	private String password;
	
	/*
	 * Bean que mantiene la informacion del usuario en sesion
	 * similar al Autowired
	 * */

	@ManagedProperty("#{sessionController}")
	private SessionController sessionController;
	
	public SessionController getSessionController() {
		return sessionController;
	}

	public void setSessionController(SessionController sessionController) {
		this.sessionController = sessionController;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void ingresar() {
		System.out.println("Usuario: " + usuario);
		System.out.println("Contraseña: " + password);

		if (usuario.equals("edgar") && password.equals("edgar")) {
			//FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario",
					//new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario incorrecto", ""));
			try {
				UsuarioDTO usuarioDTO = new UsuarioDTO();
				usuarioDTO.setUsuario(this.usuario);
				usuarioDTO.setPassword(this.password);
				
				this.sessionController.setUsuarioDTO(usuarioDTO);
				this.redireccionar("main.xhtml");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario",
					new FacesMessage(FacesMessage.SEVERITY_FATAL, "Nombre de usuario y/o contraseña incorrectos", ""));
		}
	}
	
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec =  FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}

}
