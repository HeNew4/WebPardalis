package org.henew.webpardalis.controllers;

import org.henew.webpardalis.models.Nivel;
import org.henew.webpardalis.services.NivelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping( "/api/nivel" )
public class NivelControllers
{

    private final NivelService nivelService;

    @Autowired
    public NivelControllers( NivelService nivelService )
    {
        this.nivelService = nivelService;
    }

    @PostMapping( value = "create", headers = "Accept=application/json" )
    public void createNiveles( @RequestBody Nivel nivel )
    {
        nivelService.createNivel( nivel );
    }

    @GetMapping( value = "list", headers = "Accept=application/json" )
    public List<Nivel> listNiveles()
    {
        return nivelService.listNiveles();
    }

    @GetMapping( value = "listById/{id}", headers = "Accept=application/json" )
    public Optional<Nivel> searchById( @PathVariable Integer id )
    {
        return nivelService.searchById( id );
    }

    @PutMapping( value = "update", headers = "Accept=application/json" )
    public void updateNiveles( @RequestBody Nivel niveles )
    {
        nivelService.updateNivel( niveles );
    }

    @DeleteMapping( value = "delete/{id}", headers = "Accept=application/json" )
    public void deleteNiveles( @PathVariable Integer id )
    {
        nivelService.deleteNivel( id );
    }

    @GetMapping( value = "listByName/{name}", headers = "Accept=application/json" )
    public List<Nivel> listNivelesByName( @PathVariable String name )
    {
        return nivelService.searchByName( name );
    }

}
