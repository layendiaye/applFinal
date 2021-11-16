package com.m2i.appliTpFinal.dto;

import com.m2i.appliTpFinal.entity.Spectacle;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@NoArgsConstructor
public class SpectacleCategory {
	Spectacle spectacle;
	Long categoryId;
}
