/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных
массива и возвращающий новый массив, каждый элемент которого равен
разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить
пользователя.
*/
package Seminar_1.ParsingDZ;

import java.util.ArrayList;
import java.util.List;

public class ParsingDZ_3 {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {8, 2, 1};
        try{
            System.out.println(diffElementsArray(array1,array2));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    public static List<Integer> diffElementsArray(Integer[] array1, Integer[] array2) throws  IllegalArgumentException {
        if (array1.length != array2.length){
            throw new IllegalArgumentException("Массивы имеют разную длину!");
        }
        List<Integer> diffElementsArray = new ArrayList<>();
        for (int i = 0; i < array1.length; i++){
            diffElementsArray.add(array1[i] - array2[i]);
        }
        return diffElementsArray;
    }
}
