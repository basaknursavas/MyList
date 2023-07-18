
public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i*10);
        }
        System.out.println("The Number of Elements in the Array : " + list.size);
        System.out.println("The Capacity of the List : " + list.getCapacity());

        System.out.println("The value : " + list.get(4)); /*Returns the value in the given index.
        Returns null if an invalid index is entered.*/

        System.out.println("The index you want to delete : " + list.remove(3)); /*It should delete the data
        in the given index and scroll the data to the left after the deleted index.
        Returns null if an invalid index is entered.*/

        System.out.println("Added value : " + list.set(3,30)); /*It should perform the process of replacing the data
        in the given index with a new one. Returns null if an invalid index is entered.*/

        System.out.println("The elements : " + list.toString());/*A method that lists the elements in the array
        belonging to the class.*/

        System.out.println("Index : " + list.indexOf(40)); /*Returns the index of the object given in
        the parameter in the list. Returns the value -1 if the object is not in the list. */

        System.out.println("The last index : " + list.lastIndexOf(30));/*Returns the last index of
        the specified item in the list. Returns the value -1 if the object is not in the list.*/

        if (list.isEmpty() == true) { //It tells you if the list is empty.
            System.out.println("Is the list empty : YES");
        } else {
            System.out.println("Is the list empty : NO");
        }
        
    }
}
