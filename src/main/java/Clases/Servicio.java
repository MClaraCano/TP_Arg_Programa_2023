package Clases;
import Enums.Aplicaciones;
import Enums.SistemaOperativo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idServicio;
    private SistemaOperativo sistema_operativo;
    @ManyToMany
    @JoinColumn(name = "id_cliente", referencedColumnName = "idCliente")
    private List<Cliente> listaCliente;
}
