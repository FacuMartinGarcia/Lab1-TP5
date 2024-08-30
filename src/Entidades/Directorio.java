package Entidades;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import javax.swing.JOptionPane;

public class Directorio {
// Cambios, nombre al map e inicia en el constructor.
    private TreeMap<Long,Contacto> directorio;

    public Directorio() {
        directorio= new TreeMap<>();
    }

    public void agregarContacto(Long telefono, Contacto contacto) {
    
        if(directorio.containsKey(telefono)){
            JOptionPane.showMessageDialog(null,"Ya Existe ese numero de telefono, si lo graba sobrescribe los datos del contacto");
        }else{    
            directorio.put(telefono, contacto);
             JOptionPane.showMessageDialog(null, "Se ha guardado el alumno...");
        }

    }

    public void buscarContacto() {
    }

    public void buscarTelefono() {
    }

    public void buscarContactos() {
    }

    public void borrarContacto() {
    }
    
    public void mostrarDirectorio() {
        System.out.println("****Directorio*****");
        for (Map.Entry<Long, Contacto> entry : directorio.entrySet()) {
            Long telefono = entry.getKey();
            Contacto contacto = entry.getValue();
            System.out.println("Teléfono: " + telefono + ", Contacto: " + contacto);
        }
    }


    
    
}
