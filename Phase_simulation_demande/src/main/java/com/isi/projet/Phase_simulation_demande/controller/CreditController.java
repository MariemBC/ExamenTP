package com.isi.projet.Phase_simulation_demande.controller;

import com.isi.projet.Phase_simulation_demande.model.Bareme;
import com.isi.projet.Phase_simulation_demande.model.Credit;
import com.isi.projet.Phase_simulation_demande.services.CreditService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CreditController {

    @Autowired
    public CreditService creditService;

    @RequestMapping(value="/credits/nouveaucredit/{iddmd}/{refBar}", method = RequestMethod.POST)
    public Credit createCredit (@PathVariable (value= "iddmd") Long iddemande, @PathVariable (value="refBar") Long refBareme) {
        return creditService.createCredit(iddemande,refBareme);
    }

    @RequestMapping(value="/credits", method=RequestMethod.GET)
    public List<Credit> readCredit() {
        return creditService.getCredit();
    }

    @RequestMapping(value ="/credits/{id}", method=RequestMethod.PUT)
    public Credit updateCredit (@PathVariable(value = "id") Long id, @RequestBody Credit creditDetails)
    {
        return creditService.updateCredit(id, creditDetails);
    }

    @RequestMapping(value="/credits/{id}", method=RequestMethod.DELETE)
    public void deleteCredit (@PathVariable(value = "id") Long id) {
        creditService.deleteCredit(id);
    }

    @RequestMapping(value="/getCredit/{id}", method=RequestMethod.GET)
    public Credit getCredit(@PathVariable(value = "id") Long id){
        return creditService.sendCredit(id);
    }
}

