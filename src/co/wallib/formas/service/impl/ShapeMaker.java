package co.wallib.formas.service.impl;

import co.wallib.formas.service.Forma;

public class ShapeMaker {

  private Forma forma;

  public void drawCircle() {
    this.forma = new Circulo();
    forma.dibujar();
  }

  public void drawRectangle() {
    this.forma = new Rectangulo();
    forma.dibujar();
  }

  public void drawSquare() {
    this.forma = new Cuadrado();
    forma.dibujar();
  }
}
