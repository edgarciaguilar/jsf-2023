package com.jsf2023.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.jsf2023.dto.UsuarioDTO;

@ManagedBean
@SessionScoped
public class SessionController {
	
	
	/**
	 * usuario que se mantendra en sesion
	 * */
	private UsuarioDTO usuarioDTO;
	
	
	/*
	 * Inicializa la sesion de usuario
	 * */
	@PostConstruct
	public void init() {
		System.out.println("Cargando informacion del usuario en la sesion");
	}

	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
	
	

}
