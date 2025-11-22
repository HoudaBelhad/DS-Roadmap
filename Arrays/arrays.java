package Arrays;

/** The 'arrays' class serves as an intro to basic Array concepts in java.
 * Arrays are a fundamental data structure used to store a fixed-size
 * sequential collection of elements (items) of the same 'data type'.
 */
public class arrays {
    public static void main(String[] args) {
        //An Array is a DS used to store multiple values(elements)
        //in a singla variable.
        //All elements in an array must be of the same unique type (e.g., String, int..)
        // --- 1. Array Decleration and Initialization (Method 1: Directly) ---
        //String[] cars= {"Camaro","Corvette","Tesla"};
       //cars[0] = "Mustang"; //Modify the first element
       //System.out.println(cars[0]); //Output: Mustang
       //System.out.println(cars[4]); //This would cause an ArrayIndexOutOfBoundsException
        //because the array size is 3 so indices should be 0, 1 or 2
        // --- 2. Array Decleration and Initialization (Method 2: Alocation) ---
        //This method first declares the array and allocates the required memory
        //based on the specified number of items .
        String[] cars= new String[3]; // Declares a String array of size 3
        //Assining values to array elements using their zero-based index.
        cars[0] = "BMW";
        cars[1] = "Ford";
        cars[2] = "Toyota";
        //Example: Accessing a single element
        //System.out.println(cars[0]); //Output: BMW
        // --- 3. Iterating Through the Array using a standard 'for' loop ---
        // The standard 'for' loop is used to browse all elements of the array.
        //It provides access to the index of each element/
        System.out.println("--- List of Cars ---");
        for (int i = 0; i < cars.length; i++) {
            //'cars.length' gives the total number of elements in the array (3)
            //The loop runs for i= 0,1 and 2
            System.out.println(cars[i]);
        }

    }
}