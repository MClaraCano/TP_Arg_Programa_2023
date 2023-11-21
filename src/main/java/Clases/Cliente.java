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
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCliente;
    private String razon_social;
    private int cuit;

    @ManyToMany
    @JoinColumn(name = "id_servicio", referencedColumnName = "idServicio")
    private List<Servicio> listaServicios;

    @OneToMany(mappedBy = "idIncidente")
    private List<Incidente> listaIncidentes;


}
