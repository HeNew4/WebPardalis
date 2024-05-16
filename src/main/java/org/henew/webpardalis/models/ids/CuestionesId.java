package org.henew.webpardalis.models.ids;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class CuestionesId implements Serializable
{

    @Column( name = "orden" )
    private Integer orden;

    @Column( name = "nivel" )
    private Integer nivel;

}
