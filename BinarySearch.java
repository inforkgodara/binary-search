import java.util.*;

/**
 * This is an implementation of the binary search algorithm.
 * @author Ramesh Kumar
 *
 */
public class BinarySearch {

    /**
     * binary search implementation.
     * @param list the array to be searched.
     * @param left the integer which has max size of list.
     * @param right the integer which has minimum size of list.
     * @param search the element being looked for in the array.
     * @return the index at which the search element was first found or -1 if not found.
     */
    static int search(int list[], int left, int right, int search) 
    {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (list[middle] < search) {
                left = middle + 1;
            } else if (list[middle] > search) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.print("Enter length of list : ");
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] list = new int[length];

        for (int index = 0; index < length; index++) {
            list[index] = scanner.nextInt();
        }

        Arrays.sort(list);

        System.out.print("Enter element to search : ");
        int search = scanner.nextInt();
        int elementAt = search(list, 0, length - 1, search);

        String result = elementAt == -1 ? "Element not found." : "Element is at index " + elementAt;
        System.out.println(result);
    }
}