package Entidades;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import java.util.TreeSet;
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

    public Contacto buscarContacto(Long telefono) {
        if (directorio.containsKey(telefono)) {
            return directorio.get(telefono);
        } else {
            JOptionPane.showMessageDialog(null, "El contacto con el teléfono " + telefono + " no existe.");
            return null;
        }
    }

    public Set<Long> buscarTelefono(String apellido) {
        Set<Long> telefonos = new TreeSet<>();
        for (Map.Entry<Long, Contacto> entry : directorio.entrySet()) {
            if (entry.getValue().getApellido().equalsIgnoreCase(apellido)) {
                telefonos.add(entry.getKey());
            }
        }
        return telefonos;
    }


    public ArrayList<Contacto> buscarContactos(String ciudad) {
        ArrayList<Contacto> resultados = new ArrayList<>();
        for (Contacto contacto : directorio.values()) {
            if (contacto.getCiudad().equalsIgnoreCase(ciudad)) {
                resultados.add(contacto);
            }
        }
        return resultados;
    }

     // Método para borrar un contacto
    public boolean borrarContacto(Long telefono) {
        if (directorio.containsKey(telefono)) {
            directorio.remove(telefono);
            return true;
        }
        return false;
    }
    
    //test
    public void mostrarDirectorio() {
        System.out.println("****Directorio*****");
        for (Map.Entry<Long, Contacto> entry : directorio.entrySet()) {
            Long telefono = entry.getKey();
            Contacto contacto = entry.getValue();
            System.out.println("Teléfono: " + telefono + ", Contacto: " + contacto);
        }
    }


    
    
}
