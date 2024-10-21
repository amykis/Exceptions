package Seminar_1.ParsingDZ;

public class ParsingDZ {
    public static void main(String[] args) {
        int [] array = {1, 2, 3 ,4};
//        test1(array);
//        System.out.println(test2(10, 0));
        System.out.println(test3("abc"));
    }
    public static int [] test1(int [] array){
        for (int i = 1; i < 5; i++){
            array[i] = 0;
        }
        return  array;
    }
    public static int test2(int a, int b){
        return a/b;
    }
    public static int test3(String a){
        return Integer.parseInt(a);
    }
}
