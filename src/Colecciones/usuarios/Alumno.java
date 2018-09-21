package Colecciones.usuarios;

public class Alumno {

    String nombre, apellido, dni;
    int telefono;

    public Alumno(String nombre, String apellido, String dni, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public int getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {

        String mensaje = "Nombre: %s, Apellidos: %s, DNI: %s, Teléfono: %d";
        return String.format(mensaje,getNombre(),getApellido(),getDni(),getTelefono());
    }
}
