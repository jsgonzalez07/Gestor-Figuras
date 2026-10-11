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

    
}
