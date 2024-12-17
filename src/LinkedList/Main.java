package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.add(2,5);
        list.addLast(7);
        System.out.print("Display elements:");
        list.transverse();
        System.out.println();
        System.out.println("Remove first element:"+list.removeFirst());
        System.out.println("Remove last elements:"+list.removeLast());
        System.out.print("Display elements:");
        list.transverse();
        System.out.println();
        list.add(2,99);
        System.out.println();
        System.out.println();
        System.out.println("First elements:"+list.getFirst());
        System.out.println("Last elements:"+list.getLast());
        System.out.print("Display elements:");
        list.transverse();
        System.out.println();
        System.out.println();
        System.out.println("Index of 99:"+list.indexOf(99));
        System.out.println("Remove element at index:"+list.remove(3));
        System.out.print("Display elements:");
        list.transverse();
        System.out.println();
        System.out.println();
        System.out.println("List contain element 4?"+list.contain(4));
        list.addFirst(3);
        list.addFirst(2);
    }
}