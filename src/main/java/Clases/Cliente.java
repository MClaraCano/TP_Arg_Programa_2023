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

    @OneToMany(mappedBy = "idServicio")
    private List<Servicio> servicio;

    @OneToMany(mappedBy = "idIncidente")
    private List<Incidente> incidente;

    @ManyToOne
    @JoinColumn(name = "id_operador", referencedColumnName = "idOperador")
    private Operador operador;

}
