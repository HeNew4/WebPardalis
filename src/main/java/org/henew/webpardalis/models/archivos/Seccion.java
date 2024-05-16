package org.henew.webpardalis.models.archivos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Seccion
{

    @Id
    @Column( name = "seccion_id" )
    private Integer seccionId;

    private String descripcion;

}
