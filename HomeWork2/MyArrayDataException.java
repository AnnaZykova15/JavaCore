package HomeWork2;

public class MyArrayDataException extends Exception{

    public MyArrayDataException(int i, int k, String value) {
        super("В массиве, в ячейке " + i + ";" + k + " содержится не числовое значение (" + value + ")");
    }
}
