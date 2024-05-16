package org.henew.webpardalis.models.juegos;

import jakarta.persistence.*;
import lombok.Data;
import org.henew.webpardalis.models.ids.CuestionesId;

import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@IdClass( CuestionesId.class )
public class Cuestiones implements Serializable
{

    @Id
    @Column( name = "orden" )
    private Integer orden;

    @Id
    @Column( name = "nivel" )
    private Integer nivel;

    @OneToMany( mappedBy = "cuestiones" )
    private Set<BancoRespuestas> respuestas;

}
