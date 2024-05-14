package collection.array;

public class MyArrayV4Main {
    public static void main(String[] args) {
        MyArrayListV4<String> stingList=new MyArrayListV4<>();
        stingList.add("a");
        stingList.add("b");
        stingList.add("c");
        String string=stingList.get(0);
        System.out.println("string = " + string);

        MyArrayListV4<Integer> intList=new MyArrayListV4<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        Integer integer = intList.get(0);
        System.out.println("integer = " + integer);
    }
}
