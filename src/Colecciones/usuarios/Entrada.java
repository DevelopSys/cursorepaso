package Colecciones.usuarios;


import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menus m = new Menus();
        Gestion o = new Gestion();
        int opcion = 0;

        do {
            m.menuGenerico();
            System.out.println("Introduce opción");

            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Opcion incorrecta, solo números");
            }

            switch (opcion) {
                case 1:
                    try {
                        System.out.println("Introduce nombre");
                        String nombre = sc.next();
                        System.out.println("Introduce apellido");
                        String apellido = sc.next();
                        System.out.println("Introduce télefono");
                        int telefono = sc.nextInt();
                        System.out.println("Introduce dni");
                        String dni = sc.next();
                        o.agregar(new Alumno(nombre,apellido,dni,telefono));
                    } catch (InputMismatchException e) {
                        System.out.println("Dato introducido incorrecto");
                    }

                    break;
                case 2:
                    try {

                        System.out.println("Introduce dni a buscar");
                        String dni = sc.next();

                    } catch (NumberFormatException e) {
                        System.out.println("Dato introducido incorrecto");
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Introduce dni a borrar");
                        String dni = sc.next();
                        o.borrar(dni);

                    } catch (InputMismatchException e) {
                        System.out.println("Dato introducido incorrecto");
                    }
                    break;
                case 4:
                    o.listar();
                    break;
                case 5:
                    o.exportarAlumnos();
                    break;
                case 6:
                    o.importarAlumnos();
                    break;
                default:
                    if (opcion != 7) {
                        System.out.println("Opción no contemplada");
                    }
                    break;
            }

        } while (opcion != 7);
    }

}
