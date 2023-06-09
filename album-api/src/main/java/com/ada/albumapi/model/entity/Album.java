package com.ada.albumapi.model.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Album {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@GeneratedValue(strategy=GenerationType.UUID)
	@Column(name="usuario_id", nullable=false)
	private UUID usuarioId;
	
	@GeneratedValue(strategy=GenerationType.UUID)
	private UUID identificador;
	
	@GeneratedValue(strategy=GenerationType.UUID)
	@Column(name="identificador_fixo", nullable=false)
	private UUID identificadorFixo;
	
	@Column(name="titulo", nullable=false)
	private String titulo;
	
	@Column(name="descricao")
	private String descricao;
	
}
