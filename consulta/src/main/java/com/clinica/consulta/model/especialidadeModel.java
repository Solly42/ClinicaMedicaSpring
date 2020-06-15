package com.clinica.consulta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tbEspecialidade")
public class especialidadeModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codEspecialidade;
	
	@Column(name = "nomeEspecialidade", nullable = false, length = 50)
	private String nomeEspecialidade;
}
