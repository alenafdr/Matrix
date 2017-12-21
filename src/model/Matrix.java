package model;

public class Matrix {
    private int[][] data;
    public Matrix(int size1, int size2) {
        data = new int[size1][size2];
    }

    public void set(int index1, int index2, int value){
        data[index1][index2] = value;
    }

    public int get(int index1, int index2){
        return data[index1][index2];
    }

    public int[] getLine(int index1){
        return data[index1];
    }

    public int length(){
        return data.length;
    }
}
