package org.henew.webpardalis.controllers;

import org.henew.webpardalis.models.Archivo;
import org.henew.webpardalis.services.ArchivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/archivo")
public class ArchivoController
{
    private final ArchivoService archivoService;

    @Autowired
    public ArchivoController( final ArchivoService archivoService )
    {
        this.archivoService = archivoService;
    }

    @PostMapping( value = "create", headers = "Accept=application/json" )
    public void createArchivo( @RequestBody Archivo archivo )
    {
        archivoService.createArchivo( archivo );
    }

    @GetMapping( value = "list", headers = "Accept=application/json" )
    public List<Archivo> listArchivos()
    {
        return archivoService.listArchivos();
    }

    @GetMapping( value = "listById/{id}", headers = "Accept=application/json" )
    public Optional<Archivo> searchById( @PathVariable Integer id )
    {
        return archivoService.searchById( id );
    }

    @PutMapping( value = "update", headers = "Accept=application/json" )
    public void updateArchivo( @RequestBody Archivo archivo )
    {
        archivoService.updateArchivo( archivo );
    }

    @DeleteMapping( value = "delete/{id}", headers = "Accept=application/json" )
    public void deleteArchivo( @PathVariable Integer id )
    {
        archivoService.deleteArchivo( id );
    }
}
