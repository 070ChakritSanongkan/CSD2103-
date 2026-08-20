public class LibrarySearch {

    static int binarySearchBook(int[] bookIds, int target) {
        int low = 0;
        int high = bookIds.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            System.out.println(
                "low=" + low +
                ", high=" + high +
                ", middle=" + middle +
                ", value=" + bookIds[middle]
            );

            if (bookIds[middle] == target) {
                return middle;
            } else if (bookIds[middle] < target) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return -1;
    }

    static void runCase(int[] bookIds, int target, String label) {
        System.out.println("\n" + label + " | target=" + target);
        int result = binarySearchBook(bookIds, target);
        if (result >= 0) {
            System.out.println("Found at index " + result);
        } else {
            System.out.println("Not found (-1)");
        }
    }

    public static void main(String[] args) {
        int[] bookIds = {
            1001, 1005, 1010, 1024,
            1030, 1045, 1050
        };

        runCase(bookIds, 1024, "Middle");
        runCase(bookIds, 1001, "First");
        runCase(bookIds, 1050, "Last");
        runCase(bookIds, 1035, "Missing");
    }
}
