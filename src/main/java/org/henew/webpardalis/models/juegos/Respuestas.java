package org.henew.webpardalis.models.juegos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Respuestas
{

    @Id
    @Column( name = "pregunta_id" )
    private Integer preguntaId;

    private String respuesta;

    private Boolean correcto;

}
