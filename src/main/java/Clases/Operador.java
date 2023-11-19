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
public class Operador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idOperador;

    @OneToMany(mappedBy = "idCliente")
    private List<Cliente> cliente;

    @OneToMany(mappedBy = "idTecnico")
    private List<Tecnico> tecnico;
}
