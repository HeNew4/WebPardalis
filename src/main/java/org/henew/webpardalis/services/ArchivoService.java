package org.henew.webpardalis.services;

import org.henew.webpardalis.models.Archivo;
import org.henew.webpardalis.repositories.IArchivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArchivoService
{
    private final IArchivoRepository archivoRepository;

    @Autowired
    public ArchivoService( IArchivoRepository archivoRepository )
    {
        this.archivoRepository = archivoRepository;
    }

    public void createArchivo( Archivo archivo )
    {
        archivoRepository.save( archivo );
    }

    public List<Archivo> listArchivos()
    {
        return archivoRepository.findAll();
    }

    public Optional<Archivo> searchById( Integer id )
    {
        return archivoRepository.findById( id );
    }

    public void updateArchivo( Archivo archivo )
    {
        archivoRepository.save( archivo );
    }

    public void deleteArchivo( Integer id )
    {
        archivoRepository.deleteById( id );
    }
}
