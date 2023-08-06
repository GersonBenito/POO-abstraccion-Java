package Logica;

public class Cuadrado extends Figura{

    private double lado;

    public Cuadrado(){

    }

    public Cuadrado(double lado, double posicionX, double posicionY){
        super(posicionX, posicionY);
        this.lado = lado;
    }

    // @Override es una sobreescritura del metodo del padre de donde fue heredado
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    // getter and setters
    public double getLado(){
        return this.lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

}
