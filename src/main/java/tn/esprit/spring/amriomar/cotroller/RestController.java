package tn.esprit.spring.amriomar.cotroller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tn.esprit.spring.amriomar.entities.*;
import tn.esprit.spring.amriomar.service.*;


@org.springframework.web.bind.annotation.RestController
@AllArgsConstructor
public class RestController {
    private IService iService;

    @PostMapping("addMusee")
    public Musee ajouterMusee(@RequestBody Musee musee) {
        return null;
    }

    @PostMapping("ajouterZoneEtAffecterAMusee/{idMusee}")
    public Zone ajouterZoneEtAffecterAMusee(@RequestBody Zone zone, @PathVariable("idMusee") Long idMusee) {
        return null;
    }




}
