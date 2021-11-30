package OtherObjects;

public class ModLinkedList {
    private Object content;
    private ModLinkedList next;

    public ModLinkedList(Object content,ModLinkedList next){

        this.content=content;
        this.next=next;
    }
    public void setContent(Object content){
        this.content=content;
    }

    public void setNext(ModLinkedList next) {
        this.next = next;
    }

    public Object getContent(){return this.content;}

    public ModLinkedList getNext() {
        return next;
    }
}
