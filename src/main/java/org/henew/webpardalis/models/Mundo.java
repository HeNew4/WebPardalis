package org.henew.webpardalis.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.Set;

@Data
@Entity
public class Mundo
{

    @Id
    private Integer mundo_id;

    private String nombre_mundo;

    private String descripcion_mundo;

    @OneToMany
    @JoinColumn( name = "mundo", referencedColumnName = "mundo_id" )
    private Set<Nivel> nivel;

}
