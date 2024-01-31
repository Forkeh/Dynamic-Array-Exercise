public class Main {
    public static void main(String[] args) {
        Person harry = new Person("Harry Potter");
        Person snape = new Person("Snape");
        Person hermione = new Person("Hermione");
        Person martin = new Person("Martin");

        DynamicArray dynArr = new DynamicArray();

        dynArr.size();
        dynArr.add(harry);
        dynArr.add(snape);
        dynArr.add(snape);
        dynArr.add(snape);
        dynArr.add(snape);
        dynArr.add(snape);
        dynArr.add(snape);
        dynArr.add(snape);
        dynArr.add(martin);
        dynArr.add(hermione);
        dynArr.add(hermione);
        dynArr.add(harry);
        dynArr.add(snape);
        dynArr.add(snape);
        dynArr.add(snape);
        dynArr.add(snape);
        dynArr.add(snape);
        dynArr.add(snape);
        dynArr.add(snape);
        dynArr.add(martin);
        dynArr.add(hermione);
        dynArr.add(hermione);
        dynArr.size();
        dynArr.remove();
        dynArr.remove();
        dynArr.remove();
        dynArr.size();
    }
}