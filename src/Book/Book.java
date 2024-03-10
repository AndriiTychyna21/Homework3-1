package Book;

public class Book {
    private Title title;
    private Author author;
    private Content content;

    public Book(){
        this.title = new Title();
        this.author = new Author();
        this.content = new Content();
    }

    public Book(Title title, Author author, Content content){
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public Book(String title, String author, String content){
        this.title = new Title(title);
        this.author = new Author(author);
        this.content = new Content(content);
    }

    public Author getAuthor() {
        return author;
    }

    public Content getContent() {
        return content;
    }

    public Title getTitle() {
        return title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public void show(){
        title.show();
        author.show();
        content.show();
    }
}
