package net.abi.p5;

public class Hora {
    private Integer hora;
    private Integer minuto;
    private Integer segundo;

    public Hora() {
    }

    public Hora(Integer hora, Integer minuto, Integer segundo) {
        if ((hora<=23) && (minuto<=59) && segundo<=59){
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }else{
            if(hora>23){
                this.hora=23;
            }else{
                this.hora=hora;
            }
            if(minuto>59){
                this.minuto=59;
            }else{
                this.minuto=minuto;
            }
            if(segundo>59){
                this.segundo=59;
            }else{
                this.segundo=segundo;
            }
        }
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public Integer getMinuto() {
        return minuto;
    }

    public void setMinuto(Integer minuto) {
        this.minuto = minuto;
    }

    public Integer getSegundo() {
        return segundo;
    }

    public void setSegundo(Integer segundo) {
        this.segundo = segundo;
    }

    public void mostrarHora(){
        System.out.print("\n");

        if(hora<10){
            System.out.print("0"+hora+":");
        }else{
            System.out.print(hora+":");
        }
        if(minuto<10){
            System.out.print("0"+minuto+":");
        }else{
            System.out.print(minuto+":");
        }
        if(segundo<10){
            System.out.print("0"+segundo);
        }else{
            System.out.print(segundo);
        }

    }

    public void masSegundo(){
        if(segundo==59){
            segundo=0;
            if(minuto==59){
                minuto=0;
                if(hora==23){
                    hora=0;
                }else{
                    hora++;
                }
            }else{
                minuto++;
            }
        }else{
            segundo++;
        }
    }

    public void menosSegundo(){
        if(segundo==0){
            segundo=59;
            if(minuto==0){
                minuto=59;
                if(hora==0){
                    hora=23;
                }else{
                    hora--;
                }
            }else{
                minuto--;
            }
        }else{
            segundo--;
        }
    }
}
