

public class List extends No {

    private No head;
    private int size;

    public void List(){
        head = null;
        size = 0;
    }

    public boolean emptyList(){
        if (size == 0){
            return true;
        }else return false;

    }
    public int getSize(){
        if(size < 1){
            return -1;
        }
        else return size;
    }

    public int element(int position){

        No aux = head;
        int cont = 1;

        if(emptyList()) return 0;

        if(position < 1 || position > size) return -1;

        while(position < size){
            aux = aux.getNext();
            cont++;

        }
        return aux.getContent();
    }

    public boolean insertBeginning(int element){

        No newNo = new No();

        newNo.setContent(element);
        newNo.setNext(head);
        head = newNo;
        size++;
        return true;
    }
    public boolean insertMiddle(int element, int position){

        No newNo = new No();
        newNo.setContent(element);
        int count = 1;
        No aux = head;

        if(position < 1) return false;

        while ((count < position-1) && (aux != null)){
            aux = aux.getNext();
            count++;
        }
        if (aux == null) return false;

        newNo.setNext(aux.getNext());
        aux.setNext(newNo);
        size++;
        return true;

        }

    public boolean insertEnd(int element){

        No newNo = new No();
        newNo.setContent(element);

        No aux = head;
        while(aux.getNext() != null){
            aux = aux.getNext();
        }

        newNo.setContent(element);
        newNo.setNext(null);
        this.size++;
        return true;
        }
    public boolean modify(int element, int position){

        No aux = head;
        int count = 1;

        if(position > size || position < 1) return false;

        while(count < position-1){

            aux = aux.getNext();
            count++;
        }

        aux.setContent(element);
        size++;
        return true;

    }
    public int obtainElement(int element){

        No aux = head;
        int position = 1;

        if(emptyList()) return 0;
        while(aux != null){
            if(aux.getContent() == element){
                return position;
            }
            aux = aux.getNext();
            position++;
        }
        return -1;
    }
    public int obtainPosition(int position){

        No aux = head;
        int count = 1;

        if(emptyList()) return -1;
        if(position > size || position < 1) return -1;

        while(count < position){
            aux = aux.getNext();
            count++;
        }
        return aux.getContent();

    }
    public boolean showList() {
        No aux = head;

        System.out.println(aux.getContent());
        while (aux.getNext() != null) {
            aux = aux.getNext();
            System.out.println(aux.getContent());
        }
        return true;
    }
    public int removeBeginning(int position){
        No aux = head;
        int dado = aux.getContent();

        head = aux.getNext();
        size--;

        aux = null;
        return dado;
    }
    public int removeMiddle(int position) {

        No current = null, ancestor = null;
        int data = -1, count = 1;

        current = head;

        while((count < position) && (current != null)){
            ancestor = current;
            current = current.getNext();
            count++;
        }
        if (current == null)
            return -1;

        data = current.getContent();
        ancestor.setNext(current.getNext());
        size--;

        current = null;
        return data;


    }



    }





