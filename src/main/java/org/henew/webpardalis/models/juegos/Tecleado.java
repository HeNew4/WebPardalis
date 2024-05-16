package org.henew.webpardalis.models.juegos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class Tecleado implements Serializable
{

    @Id
    private Integer nivel;

    private Integer palabra;

}
