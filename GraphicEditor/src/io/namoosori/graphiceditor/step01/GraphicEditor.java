package io.namoosori.graphiceditor.step01;


public class GraphicEditor {
    // 상속 구조 이해 위한 실습 08.30 ~ 08.31

    private static final int ARRAY_LENGTH = 5;

    public static void main(String[] args) {

        //각 클래스 배열타입
        Rectangle[] rectangles = new Rectangle[ARRAY_LENGTH];
        Ellipse[] ellipses = new Ellipse[ARRAY_LENGTH];
        Line[] lines = new Line[ARRAY_LENGTH];

        // Generate shapes
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            int randomNumber = (int) (Math.random() * 3);
            if (randomNumber == 0) {
                rectangles[i] = new Rectangle();
            } else if (randomNumber == 1) {
                ellipses[i] = new Ellipse();
            } else {
                lines[i] = new Line();
            }

        }

        // Drawing shapes
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (rectangles[i] != null) {
                rectangles[i].drawRectangle();
            } else if (ellipses[i] != null) {
                ellipses[i].drawEllipse();
            } else {
                lines[i].drawLine();
            }
        }


    }
}
