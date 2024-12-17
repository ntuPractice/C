package LinkedList;

public class LinkedList<E> {
    Node<E> head;
    Node<E> tail;
    int size;

    public void addFirst(E element){
        Node<E>node=new Node<E>(element);
        node.next=head;
        head=node;
        size++;
        if(tail==null){
            tail=node;
        }
    }

    public void addLast(E element){
        if(tail==null){
            head=tail=new Node<>(element);
        }
        else{
          tail.next=new Node<>(element);
          tail=tail.next;
        }
        size++;
    }

    public void add(int index,E element) {
        if (index < 0 || index > size) {
            return;
        } else if (index == 0) {
            addFirst(element);
        } else if (index == size - 1) {
            addLast(element);
        } else {
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            Node<E> newNode = new Node<>(element);
            current.next = newNode;
            newNode.next = temp;
            size++;
        }
    }

    public void transverse(){
        Node<E>current=head;
        while (current!=null){
            System.out.print(current.element+" ");
            current=current.next;
        }
    }

    public boolean contain(E element){
        Node<E>current=head;
        while (current!=null){
            if(current.element.equals(element)){
                return true;
            }
            current=current.next;
        }
        return false;
    }

    public int indexOf(E element){
        int index=0;
        if(contain(element)){
            Node<E>current=head;
            while (current!=null){
                if(current.element.equals(element)){
                    return index;
                }
                current=current.next;
                index++;
            }
        }
        return -1;
    }

    public E removeFirst(){
        if(head==null){
            return null;
        } else  {
            E ele=head.element;
            head=head.next;
            if(head==null){
                tail=null;
            }
            size--;
            return ele;
        }
    }

    public E removeLast(){
        if(tail==null){
            return null;
        }else{
            E element=tail.element;
            Node<E>current=head;
            for(int i=0;i<size-2;i++){
                current=current.next;
            }
            tail=current;
            tail.next=null;
            size--;
            return element;
        }
    }

    public E get(int index){
        if(index==0){
            return head.element;
        } else if (index==size-1) {
            return tail.element;
        }else{
            Node<E>current=head;
            for (int i=0;i<index;i++){
                current=current.next;
            }
            return current.element;
        }
    }

    public E getFirst(){
        return head.element;
    }

    public E getLast(){
        return tail.element;
    }

    public E remove(int index){
        if(index<0 || index>=size){
            return null;
        } else if (index==0) {
            return removeFirst();
        } else if (index==size-1) {
            return removeLast();
        }else {
            Node<E>current=head;
            for(int i=0;i<index-1;i++){
                current=current.next;
            }
            E removeElement=current.next.element;
            current.next=current.next.next;
            size--;
            return removeElement;
        }
    }

    public boolean remove(E element){
        
    }


}

