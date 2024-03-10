package Book;

public class Author {
    private String name;

    public Author(){
        this.name = "Anonym";
    }

    public Author(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void show(){
        System.out.println("Author: " + name);
    }
}
