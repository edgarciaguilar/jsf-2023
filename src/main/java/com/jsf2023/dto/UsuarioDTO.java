package com.jsf2023.dto;

/**
 * @author edgar
 * clase que permitira contener la informacion del usuario en sesion
 */
public class UsuarioDTO {
	private String usuario;
	private String password;
	
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
	
	
}
