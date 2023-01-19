package com.isi.projet.Phase_decision.model;

import com.isi.projet.Phase_decision.enums.Statut;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Decision {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iddec;

    private String ref_demande;

    private Date date_decision;
    private Statut statut;

	public Long getIddec() {
		return iddec;
	}

	public void setIddec(Long iddec) {
		this.iddec = iddec;
	}

	public String getRef_demande() {
		return ref_demande;
	}

	public void setRef_demande(String ref_demande) {
		this.ref_demande = ref_demande;
	}

	public Date getDate_decision() {
		return date_decision;
	}

	public void setDate_decision(Date date_decision) {
		this.date_decision = date_decision;
	}

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}


}
