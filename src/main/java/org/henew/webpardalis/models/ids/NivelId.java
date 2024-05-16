package org.henew.webpardalis.models.ids;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class NivelId implements Serializable
{
    private Integer nivel_id;
    private Integer mundo;
}
