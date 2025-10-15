public class Horse {

    private String name;
    private int position;

    public Horse(String name) {
        this.name = name;
        this.position = 0;
    }


    public String getName() {
        return name;
    }
    public int getPosition() { return position; }

    public void move() {
        int advance = (int)(Math.random() * 10);

        this.position += advance;
    }
}
