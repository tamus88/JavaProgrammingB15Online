package day52;

public abstract class Book implements KnowledgeBank,Readable {

    String name;
    String author;

    public Book(String name,String author){
        this.name = name;
        this.author = author;
    }
    public abstract void displayBookInfo();



}
