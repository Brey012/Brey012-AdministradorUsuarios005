public class Supervisor005  extends  Usuario005{
    public Supervisor005(String nombre, String email, String rol) {
        super(nombre, email, rol);
    }
    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Permiso; para supervisar a los empleados");
    }

    public void supervisarEmpleado(EmpleadoRegular005 empleado){
        System.out.println("El supervisor " + this.getNombre() + " esta supervisando al empleado " + empleado.getNombre());
    }
}
