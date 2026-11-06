public class Solution {

    public static int[] reverseArray(int[] numbers) {
        ArrayStack<Integer> stack = new ArrayStack<Integer>(2);

        // Push
        for (int i = 0; i < numbers.length; i++) {
            stack.push(numbers[i]);
        }

        //  reversed numbers
        int[] reversed = new int[numbers.length];

        // Pop
        int index = 0;
        while (!stack.isEmpty()) {
            reversed[index] = stack.pop();
            index++;
        }
        return reversed;
    }

    // Bonus Challenge
    public static int[] reverseFirstK(int[] numbers, int k) {
        ArrayStack<Integer> stack = new ArrayStack<Integer>(2);

        // Push
        for (int i = 0; i < k; i++) {
            stack.push(numbers[i]);
        }

        int[] result = new int[numbers.length];

        // Pop
        int index = 0;
        while (!stack.isEmpty()) {
            result[index] = stack.pop();
            index++;
        }

        // Copy
        for (int i = k; i < numbers.length; i++) {
            result[i] = numbers[i];
        }

        return result;
    }


}