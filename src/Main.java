public class Main {
    public static void main(String[] args) {
      /*
      Необходимо реализовать следующий метод:
        1. Получаем на входе массив чисел.
        2. Все четные числа увеличиваем на единицу.
        3. Возвращаем кусок списка с 3-го по 7-й элемент.
       */

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i]++;
            }
        }

        System.out.println("Измененный массив чисел:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        int[] sublist = getSublist(numbers, 3, 7);

        System.out.println("Кусок списка с 3-го по 7-й элемент:");
        for (int number : sublist) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static int[] getSublist(int[] numbers, int start, int end) {
        int sublistSize = end - start + 1;

        int[] sublist = new int[sublistSize];

        for (int i = start - 1; i <= end - 1; i++) {
            sublist[i - start + 1] = numbers[i];
        }
        return sublist;
    }
}