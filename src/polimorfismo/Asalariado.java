package polimorfismo;

public class Asalariado extends Trabajador {

    int pagas, salarioAnual;
    int salarioMes;

    public Asalariado(String nombre, String apellido, String dni, int pagas, int salarioAnual) {
        super(nombre, apellido, dni);
        this.pagas = pagas;
        this.salarioAnual = salarioAnual;
    }

    @Override
    public void calcularSaldoMes() {
        salarioMes = (salarioAnual/pagas);
    }

    public int getPagas() {
        return pagas;
    }

    public int getSalarioAnual() {
        return salarioAnual;
    }

    public int getSalarioMes() {
        return salarioMes;
    }

    @Override
    public String mostrarDatos() {
        String mensaje = "con un número de pagas de %d y un salario anual de %d";
        return super.mostrarDatos() + String.format(mensaje,getPagas(),getSalarioAnual());
    }
}
