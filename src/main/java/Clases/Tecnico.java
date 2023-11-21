package Clases;

import Enums.Especialidad;
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
    private Especialidad especialidad;

    @OneToMany(mappedBy = "idIncidente")
    private List<Incidente> listaIncidente;




}
