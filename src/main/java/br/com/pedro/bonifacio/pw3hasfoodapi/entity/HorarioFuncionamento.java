package br.com.pedro.bonifacio.pw3hasfoodapi.entity;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.pedro.bonifacio.pw3hasfoodapi.enums.DiaSemanaEnum;
import lombok.Getter;
import lombok.Setter;

//CREATE TABLE TBL_HORARIO_FUNCIONAMENTO (
//ID_HORARIO_FUNCIONAMENTO BIGINT PRIMARY KEY IDENTITY,
//TX_DIA_SEMANA VARCHAR(20) NOT NULL,
//HR_ABERTURA TIME NOT NULL,
//HR_FECHAMENTO TIME NOT NULL,
//ID_RESTAURANTE BIGINT NOT NULL,
//FOREIGN KEY (ID_RESTAURANTE) REFERENCES TBL_RESTAURANTE(ID_RESTAURANTE)
//);


@Getter
@Setter
@Entity
@Table (name = "TBL_HORARIO_FUNCIONAMENTO")
public class HorarioFuncionamento {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	@Column (name = "TX_DIA_SEMANA")
	private DiaSemanaEnum diaSemana;
	
	@Column (name = "HR_ABERTURA")
	private LocalDate horaAbertura;
	
	@Column (name = "HR_FECHAMENTO")
	private LocalDate horaFechamento;
	
	@ManyToOne
	@Column (name = "ID_RESTAURANTE")
	private Restaurante restaurante;
	
}
