import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №8");

        //Task 1
        System.out.println("\nЗадание №1:");
        int[] firstArray = new int[]{1, 2, 3}; //Term 1 целочисленный массив
        double[] secondArray = new double[]{1.57, 7.654, 9.986}; //Term 2 массив в котором можно хранить дробные числа
        int[] thirdArray = {3, 6, 9}; //Term 3 произвольный массив
        System.out.println("Массивы объявлены\n");


        //Task 2
        System.out.println("Задача №2:");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i]);
            if (i + 1 != firstArray.length) { // Ставлю запятые кроме последней
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int j = 0; j < secondArray.length; j++) {
            System.out.print(secondArray[j]);
            if (j + 1 != secondArray.length) { // Ставлю запятые кроме последней
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int k = 0; k < thirdArray.length; k++) {
            System.out.print(thirdArray[k]);
            if (k + 1 != thirdArray.length) { // Ставлю запятые кроме последней
                System.out.print(", ");
            }
        }
        System.out.println();
        //Можно было и так: System.out.println("Первый массив (все элементы): " + Arrays.toString(firstArray) + "\nВторой массив (все элементы): " + Arrays.toString(secondArray) + "\nТретий массив (все элементы): " + Arrays.toString(thirdArray));
        //Но чтобы убрать скобки пришлось пользоваться циклами


        //Task 3
        System.out.println("\nЗадача №3:");
        for (int i = firstArray.length - 1; i >= 0; i--) {
            System.out.print(firstArray[i]);
            if (i + 1 >= firstArray.length - 1) { // Ставлю запятые кроме последней
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int j = secondArray.length - 1; j >= 0; j--) {
            System.out.print(secondArray[j]);
            if (j + 1 >= secondArray.length - 1) { // Ставлю запятые кроме последней
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int k = thirdArray.length - 1; k >= 0; k--) {
            System.out.print(thirdArray[k]);
            if (k + 1 >= thirdArray.length - 1) { // Ставлю запятые кроме последней
                System.out.print(", ");
            }
        }


        //Task 4
        System.out.println("\n\nЗадача №4:");
        for (int i = 0; i < firstArray.length; i++) { //Пробегаюсь по данным массива
            if (firstArray[i] % 2 != 0) { //Ищу нечетные числа
                firstArray[i] = firstArray[i] + 1; //Прибавляю к нечетному числу +1 который нашел выше
            }
            System.out.print(firstArray[i]);
            if (i + 1 != firstArray.length) { // Ставлю запятые кроме последней
                System.out.print(", ");
            }
        }

    }
}