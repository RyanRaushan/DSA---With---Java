package Function;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        String name = "Kunal";
        {
            // int a = 78; // already initialised outside the block in the same method,
            // hence you cannot initialise again
            a = 100; // reassign the origin ref variable to some other value
            System.out.println(a);
            name = "Rahul";
            System.out.println(name);
            // values initialised in this block, will remain in block
        }
        int c = 900;
        System.out.println(a);
        System.out.println(name);
        System.out.println(c); 

        // scoping in for loops
        for (int i = 0; i < 4; i++) {
            a = 10000;
        }
        System.out.println();
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}