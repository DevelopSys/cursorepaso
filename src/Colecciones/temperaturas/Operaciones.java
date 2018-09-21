package Colecciones.temperaturas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Operaciones {

    ArrayList<Double> listaTemperaturas = new ArrayList();

    public void anadirTemperatura(double temperatura) {
        if (listaTemperaturas.add(temperatura)) {
            System.out.println("Añadido correctamente");
        } else
            System.out.println("Fallo");
    }

    public void mostrarTemperaturas() {

        if (listaTemperaturas.size()>0){
            for (Double temporal : listaTemperaturas) {
                System.out.println(Double.valueOf(temporal));
            }
        }
        else
            System.out.println("No hay temperaturas");

    }

    public void vaciarLista() {
        listaTemperaturas.clear();
    }

    public Double sacarMedia() {

        double media = 0;
        for (Double temporal : listaTemperaturas) {
            //System.out.println(Double.valueOf(temporal));
            media += temporal;
        }
        media = media / listaTemperaturas.size();
        return media;
    }

    public Double[] sacarExtremos() {

        //Comparator<Integer> com = Collections.reverseOrder();

        Double max = 0.0;
        Double min = 0.0;

        Collections.sort(listaTemperaturas, new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return new Double(o1).compareTo(new Double(o2));
            }
        });

        max = listaTemperaturas.get(listaTemperaturas.size() - 1);
        min = listaTemperaturas.get(0);
        Double[] resultados = new Double[2];
        resultados[0] = min;
        resultados[1] = max;
        return resultados;
    }

}
