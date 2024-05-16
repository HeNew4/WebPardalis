package org.henew.webpardalis.repositories;

import org.henew.webpardalis.models.juegos.Cuestiones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICuestionesRepository extends JpaRepository<Cuestiones, Integer>
{

    List<Cuestiones> findByNivel( Integer nivel );

}
