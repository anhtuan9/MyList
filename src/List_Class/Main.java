package List_Class;

public class Main {
    public static void main(String[] args) {
        List<Integer> listInteger = new List<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(4);
        listInteger.add(49);
        System.out.println("element 4: " + listInteger.get(4));
        System.out.println("element 1: " + listInteger.get(1));
        System.out.println("element 2: " + listInteger.get(2));

        listInteger.get(6);
        System.out.println("element 2: " + listInteger.get(6));

    }
}
