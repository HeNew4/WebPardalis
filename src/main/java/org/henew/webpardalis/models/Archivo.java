package org.henew.webpardalis.models;

import jakarta.persistence.*;
import lombok.Data;
import org.henew.webpardalis.models.archivos.Seccion;
import org.henew.webpardalis.models.archivos.Tipo;

@Entity
@Data
public class Archivo
{
    @Id
    private Integer nivel;

    @OneToOne
    @JoinColumn(name = "tipo", referencedColumnName = "tipo_id")
    private Tipo tipo;

    @OneToOne
    @JoinColumn(name = "seccion", referencedColumnName = "seccion_id")
    private Seccion seccion;

    private String url;

    @Column(columnDefinition = "json")
    private String mapeo;
}
