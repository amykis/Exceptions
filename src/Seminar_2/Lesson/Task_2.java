/*
Задание №2
Обработайте возможные исключительные ситуации. “Битые” значения в
исходном массиве считайте нулями. Можно внести в код правки, которые считаете
необходимыми.

    public static int sum2d(String[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < 5; j++){
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

*/
package Seminar_2.Lesson;

public class Task_2 {
    public static void main(String[] args) {
        String[][] arr = {{"1", "1", "1", "1", "1", "1"}, {"1", "1", "1", "s", "1", "1"}, {"1", "1", "1", "1", "1", null}};
        System.out.println(sum2d(arr));
    }
    public static int sum2d(String[][] arr){
        int sum = 0;
        if (arr != null){
            for (int i = 0; i < arr.length; i++){
                for (int j = 0; j < arr[0].length; j++){
                    int val = tryParseInt(arr[i][j]);
                    sum += val;
                }
            }
        }
        return sum;
    }
    public static int tryParseInt(String a){
        try{
            return Integer.parseInt(a);
        }
        catch (NumberFormatException e){
            return 0;
        }
    }
}
