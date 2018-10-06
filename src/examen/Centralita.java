package examen;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Centralita {

    ArrayList<Llamada> listaLlamadas;

    Centralita() {
        listaLlamadas = new ArrayList<Llamada>();
    }

    public void registrarLlamada(Llamada l) {
        if (listaLlamadas != null) {
            listaLlamadas.add(l);
        }
    }

    public void informacion(Class tipo) {
        if (listaLlamadas != null) {
            for (Llamada l : listaLlamadas) {
                if (l.getClass().getSimpleName().equals(tipo.getSimpleName())) {
                    System.out.println(l.toString());
                } else if (l.getClass().getSimpleName().equals(tipo.getSimpleName())) {
                    System.out.println(l.toString());
                }  else if (l.getClass().getSimpleName().equals(tipo.getSimpleName())) {
                    System.out.println(l.toString());
                } else if (l.getClass().getSuperclass().getSimpleName().equals(tipo.getSimpleName())){
                    System.out.println(l.toString());
                }
            }
        }
    }

    public double costeTotal() {

        double costeTotal = 0;
        if (listaLlamadas!=null){
            for (Llamada t : listaLlamadas) {
                System.out.println(t.getCoste());
                costeTotal = costeTotal + t.getCoste();
            }
        }
        return costeTotal;
    }

    public void exportarDatos() {
        if (listaLlamadas != null) {
            File f = new File("src/examen/fichero.obj");
            listaLlamadas.sort(new Comparator<Llamada>() {
                @Override
                public int compare(Llamada o1, Llamada o2) {
                    return 0;
                }
            });

            try {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
                oos.writeObject(listaLlamadas);
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void importarDatos() {

        File f = new File("src/examen/fichero.obj");
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
            if (listaLlamadas.size() != 0) {
                System.out.println("Estas seguro que quieres sobreescribir");
                Scanner sc = new Scanner(System.in);
                String opcion = sc.next();
                if (opcion.equals("S")) {
                    listaLlamadas = (ArrayList<Llamada>) ois.readObject();
                }
            }
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
