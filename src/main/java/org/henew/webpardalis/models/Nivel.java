package org.henew.webpardalis.models;

import jakarta.persistence.*;
import lombok.Data;
import org.henew.webpardalis.models.ids.NivelId;

@Data
@Entity
@IdClass( NivelId.class )
public class Nivel
{
    @Id
    private Integer nivel_id;

    // @OneToOne(mappedBy = "nivel", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Id
    // @ManyToOne
    // @JoinColumn(name = "mundo", referencedColumnName = "mundo_id")
    private Integer mundo;

    private String nombre;

    private String descripcion;
}
