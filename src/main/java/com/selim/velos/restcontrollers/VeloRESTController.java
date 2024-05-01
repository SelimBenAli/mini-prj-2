package com.selim.velos.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.selim.velos.entities.Velo;
import com.selim.velos.service.VeloService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class VeloRESTController {

    @Autowired
    VeloService veloService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Velo> getAllVelos() {
        return veloService.getAllVelos();
    }

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Velo getVeloById(@PathVariable("id") Long id) {
        return veloService.getVelo(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Velo createProduit(@RequestBody Velo velo) {
        return veloService.saveVelo(velo);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Velo updateVelo(@RequestBody Velo velo) {
        return veloService.updateVelo(velo);
    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteVelo(@PathVariable("id") Long id)
    {
        veloService.deleteVeloById(id);
    }

    @RequestMapping(value="/prodscat/{idType}",method = RequestMethod.GET)
    public List<Velo> getVelosByTypeId(@PathVariable("idType") Long idType) {
        return veloService.findByTypeIdType(idType);
    }

}

