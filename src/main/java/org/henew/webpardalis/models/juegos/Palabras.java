package org.henew.webpardalis.models.juegos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Palabras
{

    @Id
    @Column( name = "palabra_id" )
    private Integer palabraId;

    private String espannol;

    private String ingles;

    private String pronunciacion;

}
