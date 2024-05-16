package org.henew.webpardalis.services;

import org.henew.webpardalis.models.Mundo;
import org.henew.webpardalis.repositories.IMundoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MundoService
{

    private final IMundoRepository _mundoRepository;

    @Autowired
    public MundoService( IMundoRepository _mundoRepository )
    {
        this._mundoRepository = _mundoRepository;
    }

    public void createMundo( Mundo mundo )
    {
        _mundoRepository.save( mundo );
    }

    public List<Mundo> listMundos()
    {
        return _mundoRepository.findAll();
    }

    public Optional<Mundo> searchById( Integer id )
    {
        return _mundoRepository.findById( id );
    }

    public void updateMundo( Mundo mundo )
    {
        _mundoRepository.save( mundo );
    }

    public void deleteMundo( Integer id )
    {
        _mundoRepository.deleteById( id );
    }

}
