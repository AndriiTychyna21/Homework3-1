package Book;

public class Content {
    private String text;

    public Content(){
        this.text = "";
    }

    public Content(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void show(){
        System.out.println("Content: " + text);
    }
}
