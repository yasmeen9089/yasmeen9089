public class W6 {
    public static void main(String[] args) {
        circularlyLinkedList<Integer>list=new circularlyLinkedList<>();
        circularlyLinkedList<Integer>list1=new circularlyLinkedList<>();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        System.out.print("list1: ");
        list.print();

        list1=list1.clone(list);
        System.out.println("after clone:  ");
        System.out.print("list1:  ");
        list.print();

        System.out.print("list2:  ");
        list1.print();



    }
}
