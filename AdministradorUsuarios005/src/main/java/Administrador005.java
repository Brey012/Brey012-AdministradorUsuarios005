public class Administrador005 extends Usuario005 {
    public Administrador005(String nombre, String email, String rol) {
        super(nombre, email, rol);
    }
    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Permiso; para administrar a los empleados");
    }

    public void administrarEmpleado(EmpleadoRegular005 empleado){
        System.out.println("El administrador " + this.getNombre() + " esta administrando al empleado " + empleado.getNombre());
    }

    public void crearUsuario() {
        System.out.println("Cree un usuario");
    }

    public void modificarUsuario() {
        System.out.println("Modifique un usuario");
    }

    public void eliminarUsuario() {
        System.out.println("Elimine un usuario");
    }
}
