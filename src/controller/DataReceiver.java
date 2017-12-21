package controller;

import view.ConsoleHelper;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DataReceiver {

    public int readInt() {
        int result;
        do{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                result = Integer.parseInt(reader.readLine());
                break;
            } catch (Exception e) {
                ConsoleHelper.viewMessage("Ошибка при вводе, попробуйте еще раз");
            }
        } while (true);
        return result;
    }

    public int readSize(){
        int result;
        do{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                result = Integer.parseInt(reader.readLine());
                if (result == 0){
                    ConsoleHelper.viewMessage("Размер не должен быть нулевым, попробуйте еще раз");
                } else {
                    break;
                }
            } catch (Exception e) {
                ConsoleHelper.viewMessage("Ошибка при вводе, попробуйте еще раз");
            }
        } while (true);
        return result;
    }
}
