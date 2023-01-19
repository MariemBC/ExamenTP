package com.isi.projet.Phase_Scoring.model;

import com.isi.projet.Phase_Scoring.enums.Evaluation;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idscore;

    private String dossier;

    private int calc_score;
    private Evaluation eval_score;
	public Long getIdscore() {
		return idscore;
	}
	public void setIdscore(Long idscore) {
		this.idscore = idscore;
	}
	public String getDossier() {
		return dossier;
	}
	public void setDossier(String dossier) {
		this.dossier = dossier;
	}
	public int getCalc_score() {
		return calc_score;
	}
	public void setCalc_score(int calc_score) {
		this.calc_score = calc_score;
	}
	public Evaluation getEval_score() {
		return eval_score;
	}
	public void setEval_score(Evaluation eval_score) {
		this.eval_score = eval_score;
	}
    
    
}
