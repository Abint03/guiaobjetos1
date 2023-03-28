package net.abi.p4;

/*Modele el objeto que representa la cuenta de un banco, con identificador, nombre
y balance. Considere los getters, setters y constructores necesarios. Tenga en
cuenta los siguientes métodos.
a. El método crédito que representa un depósito de dinero en la cuenta. Este
método debe devolver el balance luego de la operación.
b. El método débito que representa una sustracción de dinero de la cuenta.
Este método debe devolver el balance luego de la operación. Si el dinero en
la cuenta no es suficiente para cubrir la sustracción, se debe imprimir por
pantalla un aviso.
c. Un método que imprima por pantalla las características del objeto.*/

public class CuentaBanco {
    private Integer id;
    private String nombre;
    private Double balance;

    public CuentaBanco() {
    }

    public CuentaBanco(Integer id, String nombre, Double balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getBalance() {
        return balance;
    }

    public Double credito(Double deposito){
        balance+=deposito;
        return balance;
    }

    public Double debito(Double compra){
        if(compra>balance){
            System.out.println("AVISO: SALDO INSUFICENTE");
            return balance;
        }else{
            balance-=compra;
            return balance;
        }
    }

    @Override
    public String toString() {
        return "Cuenta Banco: id: "+id+", nombre: "+nombre+", balance: "+balance;
    }
}