public class DynamicArray {
    private int ArrMaxSize = 10;
    private Person[] array = new Person[ArrMaxSize];
    private int elementsInArray = 0;

    public void add(Person person) {
        array[elementsInArray] = person;
        System.out.println("Added person: " + array[elementsInArray]);
        elementsInArray++;
    }

    public void get(int index) {
        try {
        if(index < 0 || array.length <= index) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds!");
        }
        System.out.println("Person at index " + index + " is: " + array[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void size() {
        System.out.println("Size of the array: " + elementsInArray);
    }

    public void remove() {
        try {
        if(elementsInArray <= 0) throw new ArrayIndexOutOfBoundsException("Nothing to remove, the array is empty!");

        System.out.println("removed: " + array[elementsInArray-1] + " from index: " + (elementsInArray-1));
        array[elementsInArray] = null;
        elementsInArray--;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }

    public void remove(int index) {

    }

    public void set(int index, Person person) {

    }

    public void clear() {

    }

}
