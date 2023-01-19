package com.isi.projet.Phase_simulation_demande.model;

import com.isi.projet.Phase_simulation_demande.enums.TypeContrat;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String prenom;
    @Column(unique=true)
    private String cin;

    private float salaire_mensuel;
    @Enumerated(EnumType.STRING)
    private TypeContrat type_contrat;

    private Date date_naissance;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public float getSalaire_mensuel() {
		return salaire_mensuel;
	}

	public void setSalaire_mensuel(float salaire_mensuel) {
		this.salaire_mensuel = salaire_mensuel;
	}

	public TypeContrat getType_contrat() {
		return type_contrat;
	}

	public void setType_contrat(TypeContrat type_contrat) {
		this.type_contrat = type_contrat;
	}

	public Date getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}


}
