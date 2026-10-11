/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.Punto;
import modelo.Rectangulo;
/**
 *
 * @author juans
 */
public class ControladorRectangulo {
    private Rectangulo rectangulo;

    public ControladorRectangulo() {
        rectangulo = null;
    }


    private boolean existeRectangulo() {
        return rectangulo != null;
    }


    private String describirRectangulo() {
        return "Vertice 1: " + rectangulo.getVertice1() + "\n"
             + "Vertice 2: " + rectangulo.getVertice2() + "\n"
             + "Base: " + rectangulo.getBase() + "\n"
             + "Altura: " + rectangulo.getAltura() + "\n"
             + "Area: " + rectangulo.calcularArea();
    }


    public String crearRectangulo(double x1, double y1, double x2, double y2) {
        if (x1 == x2 || y1 == y2) {
            return "No se puede crear: los vértices deben tener X distintas y Y distintas.";
        }
        Punto vertice1 = new Punto(x1, y1);
        Punto vertice2 = new Punto(x2, y2);
        rectangulo = new Rectangulo(vertice1, vertice2);
        return "Rectangulo creado correctamente\n" + describirRectangulo();
    }

    
}
