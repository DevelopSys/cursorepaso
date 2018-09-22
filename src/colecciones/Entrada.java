package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Entrada {

    ArrayList alumnos = new ArrayList();

    public static void main (String [] args){

        ArrayList <Alumno> alumnosMatriculados = new ArrayList();
        alumnosMatriculados.add(new Alumno("Nombre","Apellido","0000A",234));
        alumnosMatriculados.add(new Alumno("Nombre","Apellido","0000B",123));
        alumnosMatriculados.add(new Alumno("Nombre","Apellido","0000C",23));
        alumnosMatriculados.add(new Alumno("Nombre","Apellido","0000D",543));
        System.out.println(alumnosMatriculados.size());
        System.out.println(alumnosMatriculados.get(0).getNombre());
        for (Alumno al: alumnosMatriculados) {
            System.out.println(al.getMatricula());
        }

        //Comparator<Integer> comparador = Collections.reverseOrder();

        System.out.println("******");


        Collections.sort(alumnosMatriculados, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno a1, Alumno a2) {
                return new Integer(a1.getMatricula()).
                        compareTo(new Integer(a2.getMatricula()));
            }
        });

        for (Alumno al: alumnosMatriculados) {
            System.out.println(al.getMatricula());
        }

    }

}
