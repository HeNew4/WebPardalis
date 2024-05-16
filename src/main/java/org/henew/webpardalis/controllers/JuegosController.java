package org.henew.webpardalis.controllers;

import org.henew.webpardalis.models.juegos.Cuestiones;
import org.henew.webpardalis.models.juegos.Escucha;
import org.henew.webpardalis.models.juegos.Tecleado;
import org.henew.webpardalis.repositories.ICuestionesRepository;
import org.henew.webpardalis.repositories.IEscuchaRepository;
import org.henew.webpardalis.repositories.ITecleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping( "/api/juegos" )
public class JuegosController
{

    private final IEscuchaRepository escuchaRepository;

    private final ITecleadoRepository tecleadoRepository;

    private final ICuestionesRepository cuestionesRepository;

    @Autowired
    public JuegosController( final IEscuchaRepository escuchaRepository, final ITecleadoRepository tecleadoRepository,
                             final ICuestionesRepository cuestionesRepository )
    {
        this.escuchaRepository = escuchaRepository;
        this.tecleadoRepository = tecleadoRepository;
        this.cuestionesRepository = cuestionesRepository;
    }

    @GetMapping( "list" )
    public List<Object> obtenerJuegos()
    {

        // Obtener instancias de Escucha
        List<Escucha> escuchas = escuchaRepository.findAll();
        List<Object>  juegos   = new ArrayList<>( escuchas );

        // Obtener instancias de Tecleado
        List<Tecleado> tecleados = tecleadoRepository.findAll();
        juegos.addAll( tecleados );

        // Obtener instancias de Cuestiones
        List<Cuestiones> cuestiones = cuestionesRepository.findAll();
        juegos.addAll( cuestiones );

        return juegos;
    }

    @GetMapping( "listByNivel/{id}" )
    public List<Object> obtenerJuegosNivel( @PathVariable Integer id)
    {

        // Obtener instancias de Escucha
        List<Escucha> escuchas = escuchaRepository.findByNivel(id);
        List<Object>  juegos   = new ArrayList<>( escuchas );

        // Obtener instancias de Tecleado
        List<Tecleado> tecleados = tecleadoRepository.findByNivel(id);
        juegos.addAll( tecleados );

        // Obtener instancias de Cuestiones
        List<Cuestiones> cuestiones = cuestionesRepository.findByNivel(id);
        juegos.addAll( cuestiones );

        return juegos;
    }

}
