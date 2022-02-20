package HomeWork2;

public class Main {

    public static void main(String[] args){
        Test1();
        Test2();
        Test3();
    }

    private static void Test1(){
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};
        try{
            System.out.println("Test #1 result: " + SumArray(arr));
        }
        catch (MyArraySizeException e){
            System.out.println("Test #1 result: " + e.getMessage());
        }
        catch (MyArrayDataException e){
            System.out.println("Test #1 result: " + e.getMessage());
        }
    }

    private static void Test2(){
        String[][] arr = {
                {"1", "2", "3", "4", "45"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};
        try{
            System.out.println("Test #2 result: " + SumArray(arr));
        }
        catch (MyArraySizeException e){
            System.out.println("Test #2 result: " + e.getMessage());
        }
        catch (MyArrayDataException e){
            System.out.println("Test #2 result: " + e.getMessage());
        }
    }

    private static void Test3(){
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "GeekBrains one love", "12"},
                {"13", "14", "15", "16"}};
        try{
            System.out.println("Test #3 result: " + SumArray(arr));
        }
        catch (MyArraySizeException e){
            System.out.println("Test #3 result: " + e.getMessage());
        }
        catch (MyArrayDataException e){
            System.out.println("Test #3 result: " + e.getMessage());
        }
    }

    static int SumArray(String[][] newArray)
            throws MyArraySizeException, MyArrayDataException {
        int result=0;
        if (newArray.length != 4) throw new MyArraySizeException();
        for(int i=0; i < newArray.length; i++) {
            if (newArray[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int k = 0; k < newArray[i].length; k++) {
                try {
                    result += Integer.parseInt(newArray[i][k]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, k, newArray[i][k]);
                }
            }
        }
        return result;
    }
}
