package Colecciones.usuarios;

import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Gestion {

    Hashtable<String, Alumno> alumnos = new Hashtable<String, Alumno>();

    public void agregar(Alumno alumno) {
        if (!alumnos.containsKey(alumno.getDni())) {
            alumnos.put(alumno.getDni(), alumno);
        } else
            System.out.println("Alumno ya existe");
    }

    public void borrar(String dni) {
        if (!alumnos.containsKey(dni)) {
            System.out.println("Alumno no existe");
        } else
            alumnos.remove(dni);

    }

    public void listar() {

        if (alumnos.size()>0){
            Enumeration<String> listaKeys = alumnos.keys();
            while (listaKeys.hasMoreElements()){
                Alumno al = alumnos.get(listaKeys.nextElement());
                System.out.println(al.toString());
            }
        }
    }

    public void importarAlumnos(){

        Scanner sc = new Scanner(System.in);
        ObjectInputStream oImportar = null;
        File f = new File("src/Colecciones/usuarios/ficheros/lista.obj");

        if (f.exists()) {
            System.out.println("El fichero ya existe, estas seguro que quieres sobreescribirlo? (S/N");
            if (sc.next().equals("S")) {
                try {
                    oImportar = new ObjectInputStream(new FileInputStream(f));
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        oImportar.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        } else {
            try {
                oImportar = new ObjectInputStream(new FileInputStream(f));
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    alumnos = (Hashtable<String, Alumno>) oImportar.readObject();
                    oImportar.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    public void exportarAlumnos(){
        ObjectOutputStream oExportar = null;
        try {
            oExportar = new ObjectOutputStream(new FileOutputStream(
                    new File("src/Colecciones/usuarios/ficheros/lista.obj")));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oExportar.writeObject(alumnos);
                oExportar.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
