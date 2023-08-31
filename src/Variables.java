public class Variables {
    public static void main(String[] args) {
        // Variables
        int number = 5;
        String course = "TestingBase";
        char letter = 'A';
        double nr_dublu =  5.8;
        boolean test = true;

        if (nr_dublu >= 0) {
            System.out.println("This is my " + course + " number " + number + " course!");
        }
        else {
            System.out.println(letter);
        }

        // Arrays
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 6;
        a[3] = 5;
        a[4] = 9;

        int[] b = {1,2,3,4,5,6,7,8,9};
        System.out.println("First array! " + "selected position: " + a[0]);
        System.out.println("Second array! " + "selected position: " + b[5]);

    }
}
