package colecciones.usuarios;

import java.io.*;
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

    public void buscar(String dni) {

        try {
            Alumno a = alumnos.get(dni);
            System.out.println(a.toString());
        } catch (NullPointerException e) {
            System.out.println("Alumno no encontrado");
        }
    }

    public void listar() {

        if (alumnos.size() > 0) {
            Enumeration<String> listaKeys = alumnos.keys();
            while (listaKeys.hasMoreElements()) {
                Alumno al = alumnos.get(listaKeys.nextElement());
                System.out.println(al.toString());
            }
        }
    }

    public void importarAlumnos() {

        ObjectInputStream oImportar = null;
        File f = new File("src/Colecciones/usuarios/ficheros/lista.obj");

        try {
            oImportar = new ObjectInputStream(new FileInputStream(f));
            alumnos = (Hashtable<String, Alumno>) oImportar.readObject();
            System.out.println("Lista importada correctamente");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                oImportar.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void exportarAlumnos() {
        File f = new File("src/Colecciones/usuarios/ficheros/lista.obj");
        Scanner sc = new Scanner(System.in);


        if (f.exists()) {
            System.out.println("El fichero ya existe, estas seguro que quieres sobreescribirlo? (S/N)");
            if (sc.next().equals("S")) {
                crearExportacion(f);
            }
        }
        else crearExportacion(f);

    }

    public void crearExportacion(File f){
        ObjectOutputStream oExportar = null;

        try {
            ordenarHash(alumnos);
            oExportar = new ObjectOutputStream(new FileOutputStream(f));
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

    public void ordenarHash(Hashtable tabla){
        Hashtable<String, Alumno>  listaTemp= (Hashtable) tabla.clone();
        tabla.clear();
        for (Alumno a: listaTemp.values()) {
            tabla.put(a.getTelefono(),a);
        }
        listaTemp = null;
    }
}
