public class Main005 {
    public static void main(String[] args) {
        Supervisor005 supervisor = new Supervisor005("Juan", "juan@juan.com", "Supervisor");
        EmpleadoRegular005 empleado = new EmpleadoRegular005("Pedro", "pedro@...", "Empleado");
        Administrador005 administrador = new Administrador005("Maria", "maria@...", "Administrador");

        supervisor.supervisarEmpleado(empleado);
        empleado.mostrarDetalles();
        administrador.administrarEmpleado(empleado);
        administrador.crearUsuario();
        administrador.eliminarUsuario();
        administrador.modificarUsuario();
    }
}
