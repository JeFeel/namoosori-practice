package io.namoosori.graphiceditor.step03;


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
            shape.draw();
        }
        // 배열의 첫 자리에 rectangle이 왔다면 부모 클래스인 shape이 아니라
        // 자식 클래스인 rectangle의 draw가 먼저 호출됨

    }
}
