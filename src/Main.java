public class Main {
    public static void main(String[] args) {
        Person harry = new Person("Harry Potter");
        Person snape = new Person("Snape");
        Person hermione = new Person("Hermione");

        DynamicArray dynArr = new DynamicArray();

        dynArr.size();
        dynArr.add(harry);
        dynArr.size();
        dynArr.add(snape);
        dynArr.size();
        dynArr.get(11);
        dynArr.remove();
        dynArr.remove();
        dynArr.remove();
        dynArr.size();
        dynArr.add(hermione);

    }
}