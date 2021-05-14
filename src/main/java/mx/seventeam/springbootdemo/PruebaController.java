package mx.seventeam.springbootdemo;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class PruebaController {
    @PostMapping("/validacion")
    public Object validacion(@Valid @RequestBody Persona persona){
        return persona;
    }
}
