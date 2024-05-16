package org.henew.webpardalis.repositories;

import org.henew.webpardalis.models.juegos.Escucha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEscuchaRepository extends JpaRepository<Escucha, Integer>
{

    List<Escucha> findByNivel( Integer nivel );

}
