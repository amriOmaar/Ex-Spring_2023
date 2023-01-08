package tn.esprit.spring.amriomar.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Zone implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idZone;
    private String code;
    private String libelle;
    private boolean actif;
    @Enumerated(EnumType.STRING)
    private Direction direction;

    @ManyToOne
    @JsonIgnore
    private Musee musee;


}
