package com.clinica.consulta.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "tbFicha")
public class fichaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "codFicha")
	private long codFicha;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "codPaciente", referencedColumnName = "codPaciente")
	private pacienteModel codPaciente;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "medico", referencedColumnName = "medico")
	private medicoModel medico;
	
	@Column(name = "dateConsulta")
	private Date dateConsulta = new java.sql.Date(System.currentTimeMillis());
	
	@Column(name = "valorCosulta", nullable = false)
	private double valorConsulta;
	
	@Column(name = "diagnostico", length = 255)
	private String diganostico;
	
	@Column(name = "procedimento0", length = )
	procedimento
	exame
	dateRetorno
	
}
