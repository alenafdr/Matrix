package controller;

import model.Matrix;
import service.MatrixFill;
import service.MatrixMultiply;
import view.ConsoleHelper;
import view.MatrixView;

public class Start {
    public static void main(String[] args) {

        int size1, size2;
        DataReceiver dr = new DataReceiver();

        ConsoleHelper.viewMessage("Введите размеры матрицы по вертикали");
        size1 = dr.readSize();

        ConsoleHelper.viewMessage("Введите размеры матрицы по горизонтали");
        size2 = dr.readSize();

        Matrix matrix1 = new Matrix(size1, size2);
        Matrix matrix2 = new Matrix(size1, size2);
        Matrix result = new Matrix(size1, size2);

        MatrixFill matrixFill = new MatrixFill();
        matrixFill.fill(matrix1);
        matrixFill.fill(matrix2);

        MatrixMultiply task = new MatrixMultiply(0,matrix1.length(), matrix1, matrix2,result);
        task.invoke();

        MatrixView matrixView = new MatrixView();
        matrixView.showMatrix(result);
    }
}
