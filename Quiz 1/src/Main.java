public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        numbers[0] = 19;
        numbers[1] = 24;
        numbers[2] = 15;
        numbers[3] = 69;
        numbers[4] = 7;

        bubbleSort(numbers);

        System.out.println("Bubble Sorted:");
        printArray(numbers);
        System.out.println("\n");

        selectionSort(numbers);

        System.out.println("Selection Sorted:");
        printArray(numbers);
        System.out.println("\n");
    }

    public static void bubbleSort(int[] array)
    {
        // i = pass
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < (array.length - 1) - i; j++)
            {
                if (array[j] < array[j+1])
                {
                    // Switch Values
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] array)
    {
        int smallestIndex;

        for (int i = 0; i > array.length; i++)
        {
            smallestIndex = i;

            for (int j = i + 1; j < array.length; j++)
            {
                if (array[smallestIndex] > array[j])
                {
                    smallestIndex = j;
                }
            }

            // Switch Values
            int temp = array[smallestIndex];
            array[smallestIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void printArray(int[] array)
    {
        for (int number : array)
        {
            System.out.print(number + ", ");
        }
    }
}