import net.abi.p2.Empleado;
import net.abi.p1.Rectangulo;
import net.abi.p3.ItemVenta;
import net.abi.p4.CuentaBanco;
import net.abi.p5.Hora;

public class Main {
    public static void main (String[] args){
        //punto1
        Rectangulo ejemplo=new Rectangulo(3.9,4.9);
        System.out.println(ejemplo.toString());
        double perimetro=ejemplo.perimetro();
        double area=ejemplo.area();
        System.out.println("EL PERIMETRO ES: "+perimetro+" EL AREA ES: "+area);
        Rectangulo predeterminado=new Rectangulo();
        System.out.println(predeterminado.toString());

        //punto2
       /* a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de
        25000.
        b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de
        27500.
        c. Imprima ambos objetos por pantalla
        d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el
        salario anual del mismo.*/
        Empleado carlos=new Empleado(23456345,"Carlos","Gutiérrez",25000.0);
        Empleado ana=new Empleado(34234123,"Ana","Sánchez",27500.0);
        System.out.println(carlos.toString());
        System.out.println(ana.toString());
        carlos.aumentoSalario(15);
        double salario=carlos.salarioAnual();
        System.out.println("EL SALARIO ANUAL DE CARLOS ES: "+salario);

        //punto 3
        ItemVenta ej3=new ItemVenta(4,"silla blanca",8,15.0);
        System.out.println(ej3.toString());

        //punto 4
        CuentaBanco ej4=new CuentaBanco(399,"Abigail Alegre", 15000.0);
        ej4.credito(2500.0);
        ej4.debito(1500.0);
        ej4.debito(30000.0);
        System.out.println(ej4.toString());

        //punto 5
        Hora horita=new Hora(23,00,00);
        horita.mostrarHora();
        horita.masSegundo();
        horita.mostrarHora();
        horita.menosSegundo();
        horita.mostrarHora();
    }
}
