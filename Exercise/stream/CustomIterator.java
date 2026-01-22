package sprint;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;


public class CustomIterator implements Iterator<Integer> {

    List<Integer> list;
    int currentIndex = 0;

    public CustomIterator(List<Integer> list) {
        this.list = list;
        this.currentIndex = 0;
    }

     public boolean hasNext() {
        return currentIndex < list.size();
     }

     public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return list.get(currentIndex++);
        }   
}

/*
 * ============================================================================
 * LINE-BY-LINE EXPLANATION OF CustomIterator CLASS
 * ============================================================================
 * 
 * Line 1: Package declaration - defines the package this class belongs to
 * 
 * Lines 3-5: Import statements
 *   - Iterator: Interface that defines iteration behavior
 *   - List: Interface for the data structure being iterated
 *   - NoSuchElementException: Exception for invalid iteration attempts
 * 
 * Line 8: Class Declaration
 *   - Creates a custom iterator that implements Java's Iterator<Integer> interface
 *   - This means it must implement hasNext() and next() methods
 * 
 * Lines 10-11: Instance Variables
 *   - list: Holds the reference to the List being iterated over
 *   - currentIndex: Tracks which element we're currently at (0-based indexing)
 *                   Starts at 0 (first element) and increments as we iterate
 * 
 * Lines 13-16: Constructor
 *   - Takes a List<Integer> as parameter
 *   - Initializes both instance variables
 *   - Sets currentIndex to 0 to start at the beginning
 *   - Stores the reference to the list in the instance variable
 * 
 * Lines 18-20: hasNext() Method
 *   - Checks if there are more elements to iterate over
 *   - Returns true if there are more elements, false otherwise
 *   - Compares currentIndex < list.size()
 *   - Example: If list has 5 elements (size=5) and currentIndex=3, 
 *     returns true (still have indices 3 and 4)
 * 
 * Lines 22-27: next() Method
 *   - Returns the next Integer in the iteration
 *   - First checks if there are more elements available
 *   - If not, throws NoSuchElementException (safety check)
 *   - Gets the element at the current index and returns it
 *   - Uses currentIndex++ (post-increment): gets the value at current index,
 *     then increments
 *   - Example: If currentIndex=2, returns element at index 2, 
 *     then sets currentIndex to 3
 * 
 * Usage Example:
 *   List<Integer> numbers = Arrays.asList(10, 20, 30);
 *   CustomIterator iter = new CustomIterator(numbers);
 *   while (iter.hasNext()) {
 *       System.out.println(iter.next()); // Prints: 10, 20, 30
 *   }
 * 
 * ============================================================================
 */