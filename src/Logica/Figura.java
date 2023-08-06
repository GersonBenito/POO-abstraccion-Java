package Logica;

// pasar pasar una clase de JAVA a abstracta se debe de colocar la palabra reservado abstract
// entre el modificar de acceso y la palabra servado class
public abstract class Figura {

    // las variables se les coloca como protected para que solo las clases hijas que hereden de Figura tengan acceso
    protected double posicionX;
    protected double posicionY;

    // constructores
    protected Figura(){

    }

    protected Figura(double posicionX, double posicionY){
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    // un metodo abstracto no es necesario abrir y cerrar {} debido a que las clase hijas lo implementaran a su manera
    public abstract double calcularArea();

}
