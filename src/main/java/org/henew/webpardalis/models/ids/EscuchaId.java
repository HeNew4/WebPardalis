package org.henew.webpardalis.models.ids;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class EscuchaId implements Serializable
{

    private Integer orden;

    private Integer nivel;

}
