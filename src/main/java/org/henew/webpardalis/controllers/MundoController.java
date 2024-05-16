package org.henew.webpardalis.controllers;

import org.henew.webpardalis.models.Mundo;
import org.henew.webpardalis.services.MundoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping( "/api/mundo" )
public class MundoController
{

    private final MundoService mundoService;

    @Autowired
    public MundoController( final MundoService mundoService )
    {
        this.mundoService = mundoService;
    }

    @PostMapping( value = "create", headers = "Accept=application/json" )
    public void createMundo( @RequestBody Mundo mundo )
    {
        mundoService.createMundo( mundo );
    }

    @GetMapping( value = "list", headers = "Accept=application/json" )
    public List<Mundo> listMundos()
    {
        return mundoService.listMundos();
    }

    @GetMapping( value = "listById/{id}", headers = "Accept=application/json" )
    public Optional<Mundo> searchById( @PathVariable Integer id )
    {
        return mundoService.searchById( id );
    }

    @PutMapping( value = "update", headers = "Accept=application/json" )
    public void updateMundo( @RequestBody Mundo mundo )
    {
        mundoService.updateMundo( mundo );
    }

    @DeleteMapping( value = "delete/{id}", headers = "Accept=application/json" )
    public void deleteMundo( @PathVariable Integer id )
    {
        mundoService.deleteMundo( id );
    }

}
