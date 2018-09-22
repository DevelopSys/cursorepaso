package colecciones;

import java.util.Hashtable;

public class Ejecuciones {

    Hashtable<Integer, Alumno> listaAlumnos = new Hashtable<Integer, Alumno>();

    public boolean agregarDatos(Alumno alumno){

        listaAlumnos.put(alumno.getMatricula(),alumno);
        return listaAlumnos.containsKey(alumno.getMatricula());
    }
}
