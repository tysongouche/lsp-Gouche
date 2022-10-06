import java.util.ArrayList;
import java.util.List;


/** Tyson Gouche
 *
 * @author tysongouche
 *
 * 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
 */


/** The IntegerSet class defines  methods that alter the content of an ArrayList.
 * All the methods below have a description included.
 * All ArrayLists declared in the TestFile class are objects of the IntegerSet class.
 */
class IntegerSet {
    private ArrayList<Integer> set = new ArrayList<Integer>();

    /**
     * getter method, called by equal(), union(), intersect(), and diff() methods.
     *
     */
    public IntegerSet() {
        List<Integer> set = new ArrayList<Integer>();
    }

    /**
     * method to return a set object so that it could be used as a parameter
     *
     * @return set, which includes the values of each ArrayList object when called by a method.
     */
    public ArrayList<Integer> getSet() {
        return this.set;
    }


    /**
     * Method clears all items from the set, then prints the empty set.
     * Method is void
     */
    public void clear() {
        this.set.clear();
    }

    /**
     * Method determines the length of the set, then returns this value.
     *
     * @return length, an integer used to obtain the length of the set.
     */
    public int length() {
        return this.set.size();
    }

    /**
     * This method compares two sets to see if they have the same values.
     *
     * @param b, the set being compared to another set for the same values.
     * @return equal if two sets have the same values, false if different values.
     */
    public boolean equals(IntegerSet b) {
        return this.set.equals(b.getSet());
    }

    /**
     * This method searches the set for a specific value. Returns true if value exists in set.
     *
     * @param value, the item which this method searches the set for.
     * @return contained, a boolean set to true by default.
     * Maintained as true if value is found in set, else changed to false.
     */
    public boolean contains(int value) {
        return this.set.contains(value);
    }

    /**
     * This method Return true if the set is empty, false otherwise
     */
    boolean isEmpty() {
        return this.length() == 0;
    }

    /**
     * Returns the largest item in the set; Throws a IntegerSetException if set is empty
     */
    public int largest() throws IntegerSetException {
        if (this.isEmpty()) {
            throw new IntegerSetException("Set is empty!");
        }
        int largest = this.set.get(0);

        for (int i = 1; i < this.length(); i++) {
            if (this.set.get(i) > largest) {
                largest = this.set.get(i);
            }
        }
        return largest;
    }

    /**
     * @Returns the smallest item in the set; Throws a IntegerSetException if set is empty
     */
    public int smallest() throws IntegerSetException {
        if (this.isEmpty()) {
            throw new IntegerSetException("Set is empty!");
        }
        int smallest = this.set.get(0);
        for (int i = 1; i < this.length(); i++) {
            if (this.set.get(i) < smallest) {
                smallest = this.set.get(i);
            }
        }
        return smallest;
    }

    /**
     * @Param item, the item to be added
     * Adds an item to the set or does nothing if it's already there
     */
    public void add(int item) {
        if (!this.contains(item)) {
            this.set.add(item);
        }
    }

    /**
     * @Param index, index of the item to be removed
     * Removes an item to the set or throws an exception if it's already empty
     */
    // Removes an item from the set or does nothing if it's not there
    public void remove(int index) throws IntegerSetException {
        if (this.isEmpty()) {
            throw new IntegerSetException("Set is empty!");
        }
        this.set.remove(index);
    }

    /**
     * @Param setb, the set to be unionized with
     * unionizes two sets into the set that is calling this method
     */
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.getSet()) {
            this.add(item);
        }
    }

    /**
     * @Param setb, the set that the method calling set will check for intersection
     * Uses the retain method to remove all the elements in the method calling
     * set that aren't in the parameter set.
     */
    public void intersect(IntegerSet intSetb) {
        this.set.retainAll(intSetb.getSet());
    }

    /**
     * String representation of the set
     * @return returns the string value of the set
     */
    public String toString() {
        String returnStr = " ";
        for (int item : this.getSet()) {
            returnStr += String.format("%d ", item);
        }
        return returnStr;
    }
}
