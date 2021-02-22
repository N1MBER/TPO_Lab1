package main.thirdBlock;

public class ControlElements implements Comparable<ControlElements>{
    private String nameElement;
    private int id;


    ControlElements(String name,int id){
        this.nameElement = name;
        this.id = id;
    }

    public String getNameElement() {
        return nameElement;
    }

    @Override
    public int compareTo(ControlElements o) {
        if (this.id == o.id && this.nameElement.equals(o.nameElement))
            return 0;
        else
            return 1;
    }
}
