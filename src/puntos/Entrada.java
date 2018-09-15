package puntos;

import java.awt.*;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Menus m = new Menus();
        int opcionG;
        Punto3D punto3D = null;
        Punto4D punto4D = null;

        do {
            System.out.println(m.menuGenerico());
            opcionG = sc.nextInt();
            if (punto3D!=null && punto4D != null){
                String patron = "Los puntos con los que se trabaja son: \n Punto3D: %s \n Punto4D: %s";
                System.out.println(String.format(patron,punto3D.toString(),punto4D.toString()));
            }

            switch (opcionG) {
                case 1:
                    if (punto3D != null) {
                        System.out.println("ya existe un punto creado, ¿seguro que quieres sobreescribirlo (S/N)?");
                        String opcionSN = sc.next();
                        if (opcionSN.equals("S")) {
                            punto3D.crearPunto();
                            System.out.println("Punto creado correctamente situado en: " + punto3D.toString());
                        } else if (opcionSN.equals("N")) {
                            break;
                        } else
                            System.out.println("Entrada no reconocida");

                    } else {
                        punto3D = new Punto3D();
                        punto3D.crearPunto();
                        System.out.println("Punto creado correctamente situado en: " + punto3D.toString());
                    }
                    break;
                case 2:
                    if (punto4D != null) {
                        System.out.println("ya existe un punto creado, ¿seguro que quieres sobreescribirlo (S/N)?");
                        String opcionSN = sc.next();
                        if (opcionSN.equals("Y")) {
                            punto4D.crearPunto();
                            System.out.println("Punto creado correctamente situado en: " + punto4D.toString());
                        } else if (opcionSN.equals("N")) {
                            break;
                        } else
                            System.out.println("Entrada no reconocida");

                    } else {
                        punto4D = new Punto4D();
                        punto4D.crearPunto();
                        System.out.println("Punto creado correctamente situado en: " + punto3D.toString());
                    }
                    break;
                case 3:

                    if (punto3D != null) {
                        System.out.println("Introduce la coordenada x a mover el punto");
                        int xm = new Scanner(System.in).nextInt();
                        System.out.println("Introduce la coordenada y a mover el punto");
                        int ym = new Scanner(System.in).nextInt();
                        System.out.println("Introduce la coordenada z a mover el punto ");
                        int zm = new Scanner(System.in).nextInt();
                        punto3D.move(xm,ym,zm);
                        System.out.println("El punto queda en las coordenadas: "+ punto3D.toString());

                    } else System.out.println("No existe ningún punto creado");

                    break;
                case 4:
                    if (punto3D != null) {
                        System.out.println("Introduce la coordenada x a transladar el punto");
                        int xt = new Scanner(System.in).nextInt();
                        System.out.println("Introduce la coordenada y a transladar el punto");
                        int yt = new Scanner(System.in).nextInt();
                        System.out.println("Introduce la coordenada z a transladar el punto ");
                        int zt = new Scanner(System.in).nextInt();
                        punto3D.translate(xt,yt,zt);
                        System.out.println("El punto queda en las coordenadas: "+ punto3D.toString());
                    } else System.out.println("No existe ningún punto creado");
                    break;
                case 5:
                    if (punto4D != null) {
                        System.out.println("Introduce la coordenada x a mover el punto");
                        int xm = new Scanner(System.in).nextInt();
                        System.out.println("Introduce la coordenada y a mover el punto");
                        int ym = new Scanner(System.in).nextInt();
                        System.out.println("Introduce la coordenada z a mover el punto ");
                        int zm = new Scanner(System.in).nextInt();
                        System.out.println("Introduce la coordenada j a mover el punto ");
                        int jm = new Scanner(System.in).nextInt();
                        punto4D.move(xm,ym,zm,jm);
                        System.out.println("El punto queda en las coordenadas: "+ punto4D.toString());
                    } else System.out.println("No existe ningún punto creado");
                    break;
                case 6:
                    if (punto4D != null) {
                        System.out.println("Introduce la coordenada x a transladar el punto");
                        int xt = new Scanner(System.in).nextInt();
                        System.out.println("Introduce la coordenada y a transladar el punto");
                        int yt = new Scanner(System.in).nextInt();
                        System.out.println("Introduce la coordenada z a transladar el punto ");
                        int zt = new Scanner(System.in).nextInt();
                        System.out.println("Introduce la coordenada j a transladar el punto ");
                        int jt = new Scanner(System.in).nextInt();
                        punto4D.translate(xt,yt,zt,jt);
                        System.out.println("El punto queda en las coordenadas: "+ punto4D.toString());
                    } else System.out.println("No existe ningún punto creado");
                    break;
                default:

                    if (opcionG != 7) {
                        System.out.println("Opción incorrecta");
                    }

                    break;
            }

        } while (opcionG != 7);

    }
}
