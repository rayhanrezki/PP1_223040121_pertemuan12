package pertemuan12;

public class vertex {
    private char label; //label (e.g. 'A')
    private boolean wasVisited; 

    public vertex(char lab){//konstruktor
        label = lab;
        wasVisited = false;
    }

    // Getter utk label
    public char getLabel() {
        return label;
    }

    // Setter utk label
    public void setLabel(char label) {
        this.label = label;
    }

    // Getter utk wasVisited
    public boolean isWasVisited() {
        return wasVisited;
    }

    // Setter utk wasVisited
    public void setWasVisited(boolean wasVisited) {
        this.wasVisited = wasVisited;
    }

}