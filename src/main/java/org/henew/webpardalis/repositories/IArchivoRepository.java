package org.henew.webpardalis.repositories;

import org.henew.webpardalis.models.Archivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IArchivoRepository extends JpaRepository<Archivo, Integer>
{

}
