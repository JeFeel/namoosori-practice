package io.namoosori.graphiceditor.step02;


public class GraphicEditor {

    private static final int ARRAY_LENGTH = 5;

    public static void main(String[] args) {
        Shape[] shapes = new Shape[ARRAY_LENGTH];

        // Generate shapes
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            int randomNumber = (int) (Math.random() * 3);
            if (randomNumber == 0) {
                shapes[i] = new Rectangle(); //업캐스팅
            } else if (randomNumber == 1) {
                shapes[i] = new Ellipse();
            } else {
                shapes[i] = new Line();
            }

        }

        // Drawing shapes
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {    //꺼낸 객체가 Rectangle 타입이면 다운캐스팅
                ((Rectangle) shape).drawRectangle();
            }else if (shape instanceof Ellipse){
                ((Ellipse) shape).drawEllipse();
            }else if (shape instanceof Line){
                ((Line) shape).drawLine();
            }
        }


    }
}
