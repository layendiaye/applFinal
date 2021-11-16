package com.m2i.appliTpFinal.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 28)
	private String title;

	@OneToMany(mappedBy = "category", cascade = { CascadeType.ALL }) // pour faire mappedBy category il faut manyToOne
																		// ds la class Spectacle
	@JsonIgnore // pour annuler les boucle infinies
	private List<Spectacle> spectacle;

	public Category(Long id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

}
