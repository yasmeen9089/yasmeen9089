public class W1 {

        public static void main(String[] args) {
            circularlyLinkedList<Integer> list = new circularlyLinkedList<>();

            list.addFirst(1);
            list.addLast(2);
            list.addLast(3);
            list.addLast(4);
            list.addLast(5);
            list.print();
        }
    }
/*  public void addFirst(E newElment)
    {if (size==0)
    {   tail=new Node<E>(newElment,null);
        tail.setNext(tail);}
    else {
       tail.next=new Node<>(newElment,tail.next);
        tail.setNext(tail.next);
    }

        size++;

    }*/

