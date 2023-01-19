package com.isi.projet.Phase_simulation_demande.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DemandeCredit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddemandecredit")
    private Long id;
    private float montant_demande;
    private int duree_demande;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getMontant_demande() {
		return montant_demande;
	}

	public void setMontant_demande(float montant_demande) {
		this.montant_demande = montant_demande;
	}

	public int getDuree_demande() {
		return duree_demande;
	}

	public void setDuree_demande(int duree_demande) {
		this.duree_demande = duree_demande;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}






}
