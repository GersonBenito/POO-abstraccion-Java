package Logica;

import java.text.DecimalFormat;

public class Circulo extends Figura{

    private double radio;

    public Circulo(){

    }

    public Circulo(double radio, double posicionX, double posicionY){
        super(posicionX, posicionY);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        // instancia para formatear numeros decimales
        // formato #.## redondea los decimales dejando un presicion de 0.00
        // formato #.00 remuve los decimes dejando una presicion de 0.00
        DecimalFormat df = new DecimalFormat("#.00");
        final double PI = 3.1416;
        double resultado = PI * (radio * radio);
        return Double.parseDouble(df.format(resultado));
    }

    public double getRadio(){
        return this.radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }
}
