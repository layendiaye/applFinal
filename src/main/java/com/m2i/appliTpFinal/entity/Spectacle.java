package com.m2i.appliTpFinal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
/*
 * @NamedQuery(name="Spectacle.findAll",
 * query="SELECT s FROM Spectacle s WHERE s.nbPlace >= 0"), on active cette
 * partie si la methode n'est pas automatiquement creer par le crud dans
 * l'interface
 */
@Table(name = "spectacle")
public class Spectacle {
	@Id // pour mapper la clé primaire
	@GeneratedValue(strategy = GenerationType.IDENTITY) // la génération de la clé se fait à partir d'une identité
	private Long id; // propre à SGBD
	// GenerationType.AUTO : La génération de la clé primaire est laissée à
	// l’implémentation. C’est hibernate qui s’en charge et qui crée une séquence
	// unique sur tout le schéma via la table hibernate_sequence.

	@Column(length = 28)
	private String title;
	private String description;
	private Integer duration;
	private Double price;
	private Integer nbPlaces;

	@ManyToOne // @JoinColumn(name="cat_ref")
	private Category category;

	public Spectacle(Long id, String title, String description, Integer duration, Double price, Integer nbPlace) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.duration = duration;
		this.price = price;
		this.nbPlaces = nbPlace;
	}

}