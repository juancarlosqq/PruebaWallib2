package co.wallib.formas.app;

import co.wallib.formas.service.impl.ShapeMaker;

public class FacadeDemo {

  public static void main(String[] args) {
    ShapeMaker shapeMaker = new ShapeMaker();
    shapeMaker.drawCircle();
    shapeMaker.drawRectangle();
    shapeMaker.drawSquare();
  }
}
