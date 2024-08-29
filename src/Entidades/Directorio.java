package Entidades;

import java.util.TreeMap;

public class Directorio {
// Cambios, nombre al map e inicia en el constructor.
    private TreeMap<Long,Contacto> directorio;

    public Directorio() {
        directorio= new TreeMap<>();
    }

    public void agregarContacto(Long telefono, Contacto contacto) {
        directorio.put(telefono, contacto);
    }

    public void buscarContacto() {
    }

    public void buscarTelefono() {
    }

    public void buscarContactos() {
    }

    public void borrarContacto() {
    }
    
    public void mostrarTree() {
        
        // ERROR
        
        directorio.values();//Devuelve una colección de los valores contenidos en 
        //este mapa.
        //System.out.println(directorio.values() + directorio.);
    }
}
