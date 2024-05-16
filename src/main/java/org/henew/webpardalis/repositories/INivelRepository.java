package org.henew.webpardalis.repositories;

import org.henew.webpardalis.models.Nivel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface INivelRepository extends JpaRepository<Nivel, Integer>
{

    List<Nivel> findByNombre( String nombre );

}
