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
    private TreeMap<Long,Contacto> directorio = new TreeMap<>();


    public void agregarContacto(Long telefono, Contacto contacto) {
    
        if(directorio.containsKey(telefono)){
            JOptionPane.showMessageDialog(null,"Ya Existe ese numero de telefono, si lo graba sobrescribe los datos del contacto");
        }else{    
            directorio.put(telefono, contacto);
            
        }

    }

    public void agregarVariosContactos(){
    
        
        directorio.put(2664484134L,new Contacto(28399283,"FACUNDO", "GARCIA", "LA PUNTA", "PIEDRAS 258"));
        directorio.put(2664482554L,new Contacto(24544544,"JUAN", "SOLER", "SAN LUIS", "RIOBAMBA 1187"));
        directorio.put(2664466513L,new Contacto(15321056,"PAULO", "GARCIA", "LA PUNTA", "B° ALGARROBO"));
        directorio.put(2665745469L,new Contacto(30658785,"DIEGO", "MUÑOZ", "MERLO", "LAFINUR 13"));
        directorio.put(2664151515L,new Contacto(18101125,"MATIAS", "CUELLO", "MERLO", "BOLIVAR 754"));
        directorio.put(2664327418L,new Contacto(44752747,"CARLOS", "RAMIREZ", "QUINES", "AVDA ESPAÑA 24"));
        directorio.put(2664480101L,new Contacto(33993636,"FRANCISCO", "RAMIREZ", "LA PUNTA", "ESTEBAN ADARO 38"));
        directorio.put(2665965214L,new Contacto(28399285,"MAURICIO", "CUELLO", "SAN LUIS", "LAS ACACIAS 1258"));
        
        
    }
    
    
    public Contacto buscarContacto(Long telefono) {
        
        Contacto contacto = directorio.get(telefono);
        if(contacto == null){
            return null;
        }else{
            return contacto;
        }
    }

    public Set<Long> buscarXapellido(String apellido) {
        Set<Long> telefonos = new TreeSet<>();
        Boolean encontrado=false;
        for (Map.Entry<Long, Contacto> entry : directorio.entrySet()) {
            if (entry.getValue().getApellido().equalsIgnoreCase(apellido)) {
                telefonos.add(entry.getKey());
                encontrado=true;
            }
        }
        return telefonos;

    }
    
   
    public Set<Long> buscarXciudad(String ciudad) {
        Set<Long> telefonos = new TreeSet<>();
        Boolean encontrado=false;
        for (Map.Entry<Long, Contacto> entry : directorio.entrySet()) {
            if (entry.getValue().getCiudad().equalsIgnoreCase(ciudad)) {
                telefonos.add(entry.getKey());
                encontrado=true;
            }
        }
        return telefonos;

    } 


    public boolean borrarContacto(Long telefono) {
        // Método para borrar un contacto
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
