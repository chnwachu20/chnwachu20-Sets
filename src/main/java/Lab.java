import java.util.HashSet;
import java.util.Set;

/**
 * Sets are unordered collections of elements. Sets do not allow duplicates.
 *
 * Sets are very efficient for storing items that should be unique.
 */
public class Lab {

    /**
     * Instantiate and return a Set of Integers.
     *
     * Like List, Set is an interface. However, the Set interface is different: for instance, it doesn't make sense
     * for Sets to have a get method to retrieve an item at a particular index from a set, because Sets are unordered.
     *
     * Some common implementations of Set are HashSet and TreeSet. Look into how to instantiate them.
     * @return a new Set<Integer> object.
     */
    public Set<Integer> createSet() {
        return new HashSet<>(); // Return a new HashSet instance
    }

    /**
     * Return the size of a set.
     * @param set The set that we will be manipulating.
     * @return the size of the set. (number of values)
     * @throws IllegalArgumentException if the set is null
     */
    public int getSize(Set<Integer> set) {
        if (set == null) {
            throw new IllegalArgumentException("Set cannot be null");
        }
        return set.size();
    }

    /**
     * Add a new, unique item to a set. Sets can only store unique items (no duplicates).
     * @param set The set that we will be manipulating.
     * @param item The item which we will be adding to set.
     * @throws IllegalArgumentException if the set is null
     */
    public void addUniqueItem(Set<Integer> set, int item) {
        if (set == null) {
            throw new IllegalArgumentException("Set cannot be null");
        }
        set.add(item); // Add the item to the set
    }

    /**
     * Remove an item from a set.
     * @param set The set that we will be manipulating.
     * @param item The item which we will be removing from set.
     * @throws IllegalArgumentException if the set is null
     */
    public void removeItem(Set<Integer> set, int item) {
        if (set == null) {
            throw new IllegalArgumentException("Set cannot be null");
        }
        set.remove(item); // Remove the item from the set
    }
}