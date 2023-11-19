package Clases;
import Enums.Aplicaciones;
import Enums.SistemaOperativo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idServicio;
    private SistemaOperativo sistema_operativo;
    private Aplicaciones aplicaciones;
}
