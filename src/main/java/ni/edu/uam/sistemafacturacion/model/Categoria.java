package ni.edu.uam.sistemafacturacion.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Categoria {
    private Integer id;
    private String nombre;
    private boolean activa;

    // Sobrescribimos toString para que el ComboBox de JavaFX muestre solo el nombre
    @Override
    public String toString() {
        return nombre != null ? nombre : "";
    }
}