package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {

        //MyArrayList<Integer> list1 =new MyArrayList<>(); //x001
        MyArrayList<Integer> list =new MyArrayList<>(); //x002

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50_000);

    }
}
