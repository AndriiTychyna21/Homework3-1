package Book;

import java.sql.SQLOutput;

public class Title {
    private String name;

    public Title(){
        this.name = "Unnamed";
    }

    public Title(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void show(){
        System.out.println("Title: " + name);
    }
}
