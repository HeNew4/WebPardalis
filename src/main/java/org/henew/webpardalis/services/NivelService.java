package org.henew.webpardalis.services;

import org.henew.webpardalis.models.Nivel;
import org.henew.webpardalis.repositories.INivelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelService
{

    private final INivelRepository nivelRepository;

    @Autowired
    public NivelService( INivelRepository nivelRepository )
    {
        this.nivelRepository = nivelRepository;
    }

    public void createNivel( Nivel nivel )
    {
        nivelRepository.save( nivel );
    }

    public List<Nivel> listNiveles()
    {
        return nivelRepository.findAll();
    }

    public Optional<Nivel> searchById( Integer id )
    {
        return nivelRepository.findById( id );
    }


    public List<Nivel> searchByName( String nombreNivel )
    {
        return nivelRepository.findByNombre( nombreNivel );
    }

    public void updateNivel( Nivel niveles )
    {
        nivelRepository.save( niveles );
    }

    public void deleteNivel( Integer id )
    {
        nivelRepository.deleteById( id );
    }


}
