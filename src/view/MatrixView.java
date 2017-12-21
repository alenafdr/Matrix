package view;

import model.Matrix;

public class MatrixView {

    public void showMatrix(Matrix matrix){
        for (int i = 0; i < matrix.length(); i++) {
            StringBuilder msg = new StringBuilder();
            for (int j = 0; j < matrix.getLine(i).length; j++) {
                msg.append(matrix.get(i, j) + " ");
            }
            ConsoleHelper.viewMessage(msg.toString());
        }
    }
}
