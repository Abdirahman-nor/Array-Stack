public class main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int[] result = Solution.reverseArray(numbers);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Bonus
        int[] bonus = Solution.reverseFirstK(numbers, 3);
        for (int num : bonus) {
            System.out.print(num + " ");
        }
}}