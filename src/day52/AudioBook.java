package day52;

public class AudioBook extends Book implements KnowledgeBank,Readable {

    double duration;

    public AudioBook(String name, String author, double duration) {
        super(name, author);
        this.duration = duration;
    }

    @Override
    public void read() {

    }

    @Override
    public void takeNote() {
        System.out.println("Taking notes on the digital book by " + name + "writing the provided digital table");
    }

    @Override
    public void showTableOfContent() {

    }

    @Override
    public void displayBookInfo() {
        System.out.println("The name of audio book is " + name + " and the author is " + author +
                " duration is " + duration + " min");
    }
    public void listen(){
        System.out.println("Listening the audio book " + name + "by author" + author);

    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "duration=" + duration +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                "} ";
    }
}
