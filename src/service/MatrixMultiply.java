package service;

import model.Matrix;

import java.util.concurrent.RecursiveAction;

public class MatrixMultiply extends RecursiveAction {
    private final int threshold = 1;
    private int indexStart, indexEnd;
    private Matrix matrix1, matrix2, resultMatrix;

    public MatrixMultiply(int indexStart, int indexEnd, Matrix matrix1, Matrix matrix2, Matrix resultMatrix) {
        this.indexStart = indexStart;
        this.indexEnd = indexEnd;
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.resultMatrix = resultMatrix;
    }

    @Override
    protected void compute() {

        if(indexEnd - indexStart <= threshold){
            for(int i = 0; i < matrix1.getLine(indexStart).length; i++){ //обрабатываем строку
                resultMatrix.set(indexStart, i, matrix1.get(indexStart, i) * matrix2.get(indexStart, i));
            }
        } else { //если строк больше, чем одна, распараллеливаем
            int middle = (indexStart + indexEnd) / 2;
            invokeAll(new MatrixMultiply(indexStart, middle, matrix1, matrix2, resultMatrix),
                    new MatrixMultiply(middle, indexEnd, matrix1, matrix2, resultMatrix));
        }
    }
}
