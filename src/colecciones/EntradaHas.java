package colecciones;

import java.util.Enumeration;
import java.util.Hashtable;

public class EntradaHas {

    public static void main(String[] args) {

        Hashtable<Integer, Alumno> listaAlumnos = new Hashtable();
        Alumno a3 = new Alumno("qwe", "Apellido", "123D", 123);
        Alumno a1 = new Alumno("sfdf", "pepe", "345D", 345);
        Alumno a2 = new Alumno("hretrt", "pepe", "789D", 789);
        listaAlumnos.put(a1.getMatricula(), a1);
        listaAlumnos.put(a2.getMatricula(), a2);
        listaAlumnos.put(a3.getMatricula(), a3);

        listaAlumnos.contains(new Alumno("qwe", "Apellido", "123D", 123));
        listaAlumnos.contains(a1);

        Ejecuciones ejecuciones = new Ejecuciones();
        ejecuciones.agregarDatos(a1);
        ejecuciones.agregarDatos(a1);
        ejecuciones.agregarDatos(a1);
        ejecuciones.agregarDatos(a1);
        ejecuciones.agregarDatos(a1);
        ejecuciones.agregarDatos(a1);

        //Alumno recuperado = listaAlumnos.get(789);
        //System.out.println(recuperado.getNombre());

        /*if (listaAlumnos.containsKey(123)){
            listaAlumnos.remove(123);
        }
        else {
            System.out.println("Imposible borrar");
        }*/

        Enumeration<Integer> claves = listaAlumnos.keys();
        while (claves.hasMoreElements()){
            Integer c = claves.nextElement();
            if(listaAlumnos.get(c).getApellido().equals("pepe")){
                System.out.println(listaAlumnos.get(c).getApellido());
            };
        }



    }
}
