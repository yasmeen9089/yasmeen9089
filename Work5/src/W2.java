public class W2 {

        public static void main(String[] args) {
            circularlyLinkedList<Integer>list=new circularlyLinkedList<>();

            list.addFirst(1);
            list.addLast(2);
            list.addLast(3);
            list.addLast(4);
            list.addLast(5);
            list.print();
            System.out.println("Size of list: "+list.methodSize(list));

            System.out.println("Size of list: "+list.size());

        }
    }

