package org.henew.webpardalis.models.juegos;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class BancoRespuestas
{

    @Id
    @Column( name = "preguntas_id" )
    private Integer preguntasId;

    private String interrogativo;

    @ManyToOne
    @JoinColumn( name = "escucha_id", referencedColumnName = "orden" )
    private Escucha escucha;

    @ManyToOne
    @JoinColumn( name = "cuestion_id", referencedColumnName = "orden" )
    private Cuestiones cuestiones;

}
