import java.util.Arrays;

public class DynamicArray {
    private final int INITIAL_SIZE = 10;
    private int size = INITIAL_SIZE;
    private Person[] array = new Person[INITIAL_SIZE];
    private int elementsInArray = 0;

    public void add(Person person) {
        array[elementsInArray] = person;
        elementsInArray++;

        if (elementsInArray >= INITIAL_SIZE && elementsInArray % INITIAL_SIZE == 0) grow();

        System.out.println(Arrays.toString(array));
    }

    public void get(int index) {
        try {
            if (index < 0 || array.length <= index) {
                throw new ArrayIndexOutOfBoundsException("Index out of bounds!");
            }
            System.out.println("Person at index " + index + " is: " + array[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void size() {
        System.out.println("Elements in the array: " + elementsInArray);
    }

    public void remove() {
        try {
            if (elementsInArray <= 0)
                throw new ArrayIndexOutOfBoundsException("Nothing to remove, the array is empty!");

//            System.out.println("removed: " + array[elementsInArray - 1] + " from index: " + (elementsInArray - 1));
            array[elementsInArray - 1] = null;
            elementsInArray--;

            if (elementsInArray > INITIAL_SIZE && elementsInArray % INITIAL_SIZE != 0) shrink();

            System.out.println("remove: " + Arrays.toString(array));

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }

    public void remove(int index) {
        for (int i = index; i < elementsInArray; i++) {
            array[i] = array[i + 1];
            array[i + 1] = null;
        }
        System.out.println("After removal: " + Arrays.toString(array));
        this.elementsInArray--;
    }

    public void set(int index, Person person) {
        array[index] = person;
        System.out.println("After set: " + Arrays.toString(array));
    }

    public void clear() {
        array = new Person[INITIAL_SIZE];
        System.out.println("After clear: " + Arrays.toString(array));
    }

    private void grow() {
        Person[] newArray = new Person[elementsInArray + INITIAL_SIZE];

        for (int i = 0; i < elementsInArray; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        System.out.println("GROW");
    }

    private void shrink() {
        Person[] newArray = new Person[elementsInArray - INITIAL_SIZE];

        for (int i = 0; i < elementsInArray; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        System.out.println("SHRINK!");
    }
}
