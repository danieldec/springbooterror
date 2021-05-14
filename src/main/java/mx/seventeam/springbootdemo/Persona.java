package mx.seventeam.springbootdemo;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class Persona {
    @NotNull
    @NotEmpty
    private String nombre;
    @NotNull(message = "apellido no debe ser nulo")
    private String apellido;
    private int edad;
    private double peso;
}
