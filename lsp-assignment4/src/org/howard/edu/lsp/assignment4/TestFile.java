
public class TestFile {
    public static void main(String[] args) {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());
        System.out.println();
        try {
            System.out.println("Largest value in Set1 is: " + set1.largest());
        } catch(IntegerSetException ise) {
            System.out.println(ise);
        }
        try {
            System.out.println("Smallest value in Set1 is: " + set1.smallest());
        } catch(IntegerSetException ise) {
            System.out.println(ise);
        }
        System.out.println();
        System.out.println("Union of Set1 and Set2");
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());
        set1.union(set2);
        System.out.println("Result of union of Set1 and Set2:\n" + set1.toString());
        System.out.println();
        System.out.println("The result of Clearing Set1:");
        set1.clear();
        System.out.println("Set1 is now: "+ "[" + set1 + "]");
        System.out.println("The length of Set1 is now: " + set1.length());
        System.out.println();
        System.out.println("The length of Set2 is currently: "+ set2.length());
        System.out.println("Value of Set2 is currently: " + set2.toString());
        System.out.println("Removed the 2nd value from Set2.");
        try {
            set2.remove(1);
            System.out.println("Value of Set2 is now: " + set2.toString());
        } catch(IntegerSetException ise) {
            System.out.println(ise);
        }

        System.out.println("Set2 contains the element 5?: " + set2.contains(5));
        System.out.println();
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());
        System.out.println("Does Set1 == Set2?: " + set1.equals(set2));
        System.out.println();
        System.out.println("Adding the element 4 to Set1");
        set1.add(4);
        System.out.println("The value of set1 is now: "+ set1.toString());
        set1.intersect(set2);
        System.out.println("Set1 and Set2 intersect at: " + set1.toString());

    }
    }

// My exception IntegerSetException
class IntegerSetException extends Exception {
    public IntegerSetException(String str)
    {
        // Call the constructor of parent exception
        super(str);
    }
}

