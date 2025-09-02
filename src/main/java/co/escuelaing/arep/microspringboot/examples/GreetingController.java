package co.escuelaing.arep.microspringboot.examples;

import co.escuelaing.arep.microspringboot.annotations.RestController;
import co.escuelaing.arep.microspringboot.annotations.GetMapping;
import co.escuelaing.arep.microspringboot.annotations.RequestParam;
/**
 *
 * @author Juan David Rodríguez
 */
@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";

    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hola " + name;
    }
}
