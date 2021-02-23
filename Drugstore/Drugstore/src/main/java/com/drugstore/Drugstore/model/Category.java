package com.drugstore.Drugstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "tb_category")
@NoArgsConstructor
public class Category {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "ID")
	@Getter
	private long id;
	
	@Column (name = "Sections", nullable = false)
	@Size (min = 10, max = 30)
	@Getter @Setter
	private String sections;
	//Medicamentos, Estética, Higiene Pessoal, Mamãe & Bebê
	
	@Column (name = "Description", nullable = false)
	@Size (min = 10, max = 50)
	@Getter @Setter
	private String description;
	//breve descrição da categoria
}
