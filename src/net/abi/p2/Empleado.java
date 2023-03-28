package net.abi.p2;

/*
2. Modele el objeto Empleado que posee las siguientes características, dni, nombre,
        apellido y salario. El mismo debe contar con la posibilidad de calcular el salario
        anual. A su vez se requiere otro método que permita aumentar el salario
        dependiendo del porcentaje que se le pase por parámetro. Considere crear un
        método que facilite imprimir por pantalla las características del objeto de la
        siguiente forma:
        Empleado[dni=?, nombre=?, apellido=?, salario=?]

*/

public class Empleado {
    private Integer dni;
    private String nombre;
    private String apellido;
    private Double salario;

    public Empleado() {
    }

    public Empleado(Integer dni, String nombre, String apellido, Double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Double getSalario() {
        return salario;
    }

    public Double salarioAnual(){
        return salario*12;
    }

    public void aumentoSalario(double porcentaje){
        porcentaje=porcentaje/100;
        this.salario+=(salario*porcentaje);
    }

    @Override
    public String toString() {
        return "Empleado[dni= "+dni+", nombre= "+nombre+", apellido= "+apellido+", salario= "+salario+"]";
    }
}
