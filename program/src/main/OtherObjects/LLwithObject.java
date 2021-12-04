package OtherObjects;

import java.util.ArrayList;

public class LLwithObject extends ModLinkedList{

    private ArrayList<Double> list;

    public LLwithObject(Object content,ModLinkedList next){
        super(content, next);
    }

    public void setlist(ArrayList<Double> list){
        this.list=list;
    }

    public ArrayList<Double> getlist() {
        return this.list;
    }

    public Double getListSum(){
        double sum=0;
        for(Double i:this.list){
            sum+=i;
        }
        return sum;
    }
}
