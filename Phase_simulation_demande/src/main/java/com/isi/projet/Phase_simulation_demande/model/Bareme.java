package com.isi.projet.Phase_simulation_demande.model;import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Bareme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "refBareme")
    private Long id;
    private float taux_nominal;

    private int duree_minimal;
    private int duree_maximal;
    private float montant_minimal;
    private float montant_maximal;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public float getTaux_nominal() {
		return taux_nominal;
	}
	public void setTaux_nominal(float taux_nominal) {
		this.taux_nominal = taux_nominal;
	}
	public int getDuree_minimal() {
		return duree_minimal;
	}
	public void setDuree_minimal(int duree_minimal) {
		this.duree_minimal = duree_minimal;
	}
	public int getDuree_maximal() {
		return duree_maximal;
	}
	public void setDuree_maximal(int duree_maximal) {
		this.duree_maximal = duree_maximal;
	}
	public float getMontant_minimal() {
		return montant_minimal;
	}
	public void setMontant_minimal(float montant_minimal) {
		this.montant_minimal = montant_minimal;
	}
	public float getMontant_maximal() {
		return montant_maximal;
	}
	public void setMontant_maximal(float montant_maximal) {
		this.montant_maximal = montant_maximal;
	}

}
