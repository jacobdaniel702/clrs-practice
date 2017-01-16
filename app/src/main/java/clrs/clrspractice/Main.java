package clrs.clrspractice;
public class Main {

    public static void main(String[] args) {
        Integer[] a = new Integer[]{1,4,2,3,9,7,8,10,14,16};
        Heap<Integer> heap = new Heap<>(a);
        heap.Print();
        Sorts<Integer> s = new Sorts<>();
        s.HeapSort(heap);
        heap.Print();
    }
}