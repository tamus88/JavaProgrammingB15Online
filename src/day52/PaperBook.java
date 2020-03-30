package day52;

public class PaperBook extends Book implements KnowledgeBank,Readable {

    int weight;

    public PaperBook(String name, String author,int weight) {
        super(name, author);
    this.weight = weight;
    }

    @Override
    public void takeNote() {
        System.out.println("Taking notes from " + name);
    }

    @Override
    public void showTableOfContent() {

    }

    @Override
    public void displayBookInfo(){
        System.out.println("Paper books name is " + name + " author is " + author + " and weight is " + weight);
    }
    public void read(){
        System.out.println("");
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                "} ";
    }
}
