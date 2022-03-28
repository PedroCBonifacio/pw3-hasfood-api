package br.com.pedro.bonifacio.pw3hasfoodapi.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

//CREATE TABLE TBL_TIPO_COZINHA(
//ID_TIPO_COZINHA BIGINT PRIMARY KEY IDENTITY,
//TX_NOME VARCHAR(30) NOT NULL,
//DT_EXCLUSAO DATE NOT NULL
//);

@Getter
@Setter
@Entity
@Table (name = "TBL_TIPO_COZINHA")
public class TipoCozinha {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "ID_TIPO_COZINHA")
	private Long id;
	
	@Column (name = "TX_NOME")
	private String nome;
	
	@Column (name = "DT_EXCLUSAO")
	private LocalDate dataExclusao;
	
}
