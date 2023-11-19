package Clases;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Tecnico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idTecnico;
    private boolean disponible;

    @OneToMany(mappedBy = "idIncidente")
    private List<Incidente> incidente;

    @ManyToOne
    @JoinColumn(name = "id_operador", referencedColumnName = "idOperador")
    private Operador operador;

}
