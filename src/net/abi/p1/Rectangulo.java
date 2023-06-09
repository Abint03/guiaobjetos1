package net.abi.p1;
/*
Modele el objeto Rectángulo con sus propiedades, ancho y alto. Ambas con valor
        1,0 por defecto. Este objeto debe exponer los getters y setters necesarios. También
        debe contar con un método para calcular el área y perímetro del mismo. Ejecute las
        siguientes pruebas:
        a. Inicializar un objeto Rectángulo estableciendo ancho y alto.
        b. Imprimir por pantalla el alto y ancho.
        c. Imprimir por pantalla el área y perímetro.
        d. Modificar el alto y el ancho de la instancia.
        e. Imprimir por pantalla nuevamente el cálculo del área y perímetro.
        f. Inicializar un objeto Rectángulo con los valores por defecto y verificar.
*/

public class Rectangulo {
    private Double ancho=1.0;
    private Double alto=1.0;

    public Rectangulo() {
    }

    public Rectangulo(Double ancho, Double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getAncho() {
        return ancho;
    }

    public Double getAlto() {
        return alto;
    }

    @Override
    public String toString() {
        return "Rectangulo: " +
                "ancho= " + ancho +
                ", alto= " + alto;
    }

    public Double area(){
        return (ancho*alto);
    }
    public Double perimetro(){
        return ((ancho*2)+(alto*2));
    }
}
