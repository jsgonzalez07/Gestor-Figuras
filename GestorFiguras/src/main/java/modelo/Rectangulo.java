/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author alex
 */
public class Rectangulo extends FiguraGeometrica {
    private Punto vertice1;
    private Punto vertice2;

    public Rectangulo(Punto vertice1, Punto vertice2) {
        super("Rectangulo");
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
    }


    public Punto getVertice1() {
        return vertice1;
    }

    public Punto getVertice2() {
        return vertice2;
    }

    public double getBase() {
        return Math.abs(vertice2.getX() - vertice1.getX());
    }

    public double getAltura() {
        return Math.abs(vertice2.getY() - vertice1.getY());
    }
    
    @Override
    public double calcularArea() {
        return getBase() * getAltura();
    }


    @Override
    public void mover(double dx, double dy) {
        vertice1.desplazar(dx, dy);
        vertice2.desplazar(dx, dy);
    }
}
