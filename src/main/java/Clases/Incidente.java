package Clases;

import Enums.EstadoIncidente;
import Enums.TipoIncidente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Incidente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idIncidente;
    private String descripcion;
    private double tiempo_estimado_resolucion;
    private TipoIncidente tipo_incidente;
    private EstadoIncidente estado_incidente;

    @ManyToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "idCliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "tecnico_id", referencedColumnName = "idTecnico")
    private Tecnico tecnico;

}
