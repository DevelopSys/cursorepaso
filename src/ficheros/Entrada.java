package ficheros;

import java.io.*;
import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {

        File f = new File("src/ficheros/documentos/ejemplo.txt");
        File f2 = new File("src/ficheros/documentos/ejemplo.obj");
        //escribirNormalBuffer(f);
        //lecturaNormalBuffer(f);
        escribirObjeto(f2);
    }

    public static void escribirNormal(File file) {

        FileWriter fw = null;

        try {
            fw = new FileWriter(file);
            fw.write("Ejemplo de escritura en el fichero de texto");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NullPointerException e) {
                System.out.println("El archivo no existe");
            }
        }
    }

    public static void escribirNormalBuffer(File file) {

        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write("Ejemplo de escritura con buffer");
            bw.newLine();
            bw.write("segunda linea de ejecución");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NullPointerException e) {
                System.out.println("El archivo no existe");
            }
        }
    }

    public static void lecturaNormalBuffer(File f){
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            // lee la linea completa
            String linea = br.readLine();
            while (linea!=null){
                System.out.println(linea);
                linea = br.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void escribirObjeto(File f){

        ObjectOutputStream os = null;

        ArrayList<Alumno> listaAl = new ArrayList<>();
        listaAl.add(new Alumno("qweqwe","asd","asd",231));
        listaAl.add(new Alumno("gsdgsdg","asd","asd",231));

        try {
            os = new ObjectOutputStream(new FileOutputStream(f));
            os.writeObject(listaAl);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void leerObjetos(File f){

        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(f));
            ArrayList<Alumno> listaRecuperada = (ArrayList<Alumno>) ois.readObject();
            for (Alumno temporal: listaRecuperada) {
                System.out.println(temporal.getNombre());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
