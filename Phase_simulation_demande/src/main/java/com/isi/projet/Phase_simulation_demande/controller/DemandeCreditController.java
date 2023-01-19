package com.isi.projet.Phase_simulation_demande.controller;

import com.isi.projet.Phase_simulation_demande.model.DemandeCredit;
import com.isi.projet.Phase_simulation_demande.services.DemandeCreditService;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DemandeCreditController {
    @Autowired
    public DemandeCreditService demandeCreditService;

    @RequestMapping(value="/demandecredits", method = RequestMethod.POST)
    public DemandeCredit createDemandeCredit (@RequestBody DemandeCredit c) {
        return demandeCreditService.createDemandeCredit(c);
    }


    @RequestMapping(value="/demandecredits/{id}", method=RequestMethod.GET)
    public DemandeCredit getDemandeCredit(@PathVariable(value = "id") Long id){
        return demandeCreditService.getDemandeCredit(id);
    }
}
