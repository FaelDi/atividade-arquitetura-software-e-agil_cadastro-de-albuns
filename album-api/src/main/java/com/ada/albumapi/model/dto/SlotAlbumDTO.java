package com.ada.albumapi.model.dto;

import java.util.UUID;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SlotAlbumDTO {

	private Long id;
	
	private UUID identificador;
	
	private UUID identificadorAlbum;
	
	private int quantidadeFigurinhas;
	
	private int ordem;

	public SlotAlbumDTO(UUID identificador, UUID identificadorAlbum, int ordem) {
		
		this.id = null;
		this.identificador = identificador;
		this.identificadorAlbum = identificadorAlbum;
		this.quantidadeFigurinhas = 0;
		this.ordem = ordem;
		
	}
	
}
