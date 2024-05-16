package org.henew.webpardalis.models.archivos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Tipo
{

    @Id
    @Column( name = "tipo_id" )
    private Integer tipoId;

    private String descripcion;

}
