/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных
массива и возвращающий новый массив, каждый элемент которого равен
частному элементов двух входящих массивов в той же ячейке. Если длины
массивов не равны, необходимо как-то оповестить пользователя.
Важно: При выполнении метода единственное исключение, которое
пользователь может увидеть - RuntimeException, т.е. ваше
*/
package Seminar_1.ParsingDZ;

import java.util.ArrayList;
import java.util.List;

public class ParsingDZ_4 {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {8, 2, 0};
        try{
            System.out.println(divElementsArray(array1,array2));
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
    public static List<Integer> divElementsArray(Integer[] array1, Integer[] array2) throws  RuntimeException {
        if (array1.length != array2.length){
            throw new RuntimeException("Массивы имеют разную длину!");
        }
        List<Integer> divElementsArray = new ArrayList<>();
        for (int i = 0; i < array1.length; i++){
            if (array2[i] == 0){
                throw new RuntimeException("Деление на 0");
            }
            divElementsArray.add(array1[i] / array2[i]);
        }
        return divElementsArray;
    }
}
