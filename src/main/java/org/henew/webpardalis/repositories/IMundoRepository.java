package org.henew.webpardalis.repositories;

import org.henew.webpardalis.models.Mundo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMundoRepository extends JpaRepository<Mundo, Integer>
{
}


