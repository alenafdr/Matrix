package service;

import controller.DataReceiver;
import model.Matrix;

public class MatrixFill {
    public void fill(Matrix matrix){
        DataReceiver dr = new DataReceiver();
        for (int i = 0; i < matrix.length(); i++) {
            for (int j = 0; j < matrix.getLine(i).length; j++) {
                System.out.println("Введите значение для координат " + i + " " + j);
                matrix.set(i,j,dr.readInt());
            }
        }
    }
}
