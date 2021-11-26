public class ModLinkedList {
    Object content;
    ModLinkedList next;

    public ModLinkedList(Object c,ModLinkedList n){

        this.content=c;
        this.next=n;
    }
    public void setContent(Object c){
        this.content=c;
    }
}
