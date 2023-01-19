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
public class Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "refDossier")
    private Long id;

    @OneToOne
    @JoinColumn(name = "Demande_credit")
    private DemandeCredit demandeCredit;
    
    @OneToOne
    @JoinColumn(name = "bareme_id")
    private Bareme refbareme;

    private float mensualite;

    private float interet;

    @Column(name = "client_cin")
    private String refclient;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DemandeCredit getDemandeCredit() {
		return demandeCredit;
	}

	public void setDemandeCredit(DemandeCredit demandeCredit) {
		this.demandeCredit = demandeCredit;
	}

	public Bareme getRefbareme() {
		return refbareme;
	}

	public void setRefbareme(Bareme refbareme) {
		this.refbareme = refbareme;
	}

	public float getMensualite() {
		return mensualite;
	}

	public void setMensualite(float mensualite) {
		this.mensualite = mensualite;
	}

	public float getInteret() {
		return interet;
	}

	public void setInteret(float interet) {
		this.interet = interet;
	}

	public String getRefclient() {
		return refclient;
	}

	public void setRefclient(String refclient) {
		this.refclient = refclient;
	}

}
