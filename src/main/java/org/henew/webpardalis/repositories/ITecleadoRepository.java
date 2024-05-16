package org.henew.webpardalis.repositories;

import org.henew.webpardalis.models.juegos.Tecleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITecleadoRepository extends JpaRepository<Tecleado, Integer>
{

    List<Tecleado> findByNivel( Integer nivel );

}
