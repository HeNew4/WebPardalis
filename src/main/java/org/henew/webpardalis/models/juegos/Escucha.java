package org.henew.webpardalis.models.juegos;

import jakarta.persistence.*;
import lombok.Data;
import org.henew.webpardalis.models.ids.EscuchaId;

import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@IdClass( EscuchaId.class )
public class Escucha implements Serializable
{

    @Id
    private Integer orden;

    @Id
    private Integer nivel;

    private String transcripciones;

    @OneToMany( mappedBy = "escucha" )
    // @JoinColumn( name = "respuesta", referencedColumnName = "preguntas_id" )
    // @JoinColumn( name = "preguntas_id", referencedColumnName = "orden" )
    private Set<BancoRespuestas> respuesta;

}
