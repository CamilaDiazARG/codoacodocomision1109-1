
package personal;


public class Departamento extends Personal {
    public String depto;
    public Departamento (String nombre, String apellido, int edad, String depto){
        super(nombre,apellido,edad);
        this.depto = depto;

    }
    public String MostrarDatos(){
        return "\nNombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad 
                + "\nSueldo: " + this.getSueldo()+ "\nPertenece al depto: " 
                + depto ;
    }
}