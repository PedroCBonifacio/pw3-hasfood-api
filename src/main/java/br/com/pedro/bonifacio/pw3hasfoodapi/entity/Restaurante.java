package br.com.pedro.bonifacio.pw3hasfoodapi.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

//CREATE TABLE TBL_RESTAURANTE (
//ID_RESTAURANTE BIGINT PRIMARY KEY IDENTITY,
//TX_CNPJ VARCHAR(14) NOT NULL,
//TX_NOME VARCHAR(255) NOT NULL,
//TX_DESCRICAO VARCHAR(1000),
//DT_APROVACAO DATE,
//VLR_ENTREGA FLOAT,
//NR_TEMPO_MIN_ENTREGA INT,
//NR_TEMPO_MAX_ENTREGA INT,
//ID_TIPO_COZINHA BIGINT NOT NULL,
//FOREIGN KEY (ID_TIPO_COZINHA) REFERENCES TBL_TIPO_COZINHA(ID_TIPO_COZINHA)
//);


@Getter
@Setter
@Entity
@Table (name = "TBL_RESTAURANTE")
public class Restaurante {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "ID_RESTAURANTE")
	private Long id;
	
	@Column (name = "TX_CNPJ")
	private String CNPJ;
	
	@Column (name = "TX_NOME")
	private String nome;
	
	@Column (name = "TX_DESCRICAO")
	private String descricao;
	
	@Column (name = "DT_APROVACAO DATE")
	private LocalDate dataAprovacao;
	
	@Column (name = "VLR_ENTREGA")
	private Float valorEntrega;
	
	@Column (name = "NR_TEMPO_MIN_ENTREGA")
	private int numeroTempoMinEntrega;
	
	@Column (name = "NR_TEMPO_MAX_ENTREGA")
	private int numeroTempoMaxEntrega;
	
	@OneToMany
	@Column (name = "ID_TIPO_COZINHA")
	private TipoCozinha tipoCozinha;

}
