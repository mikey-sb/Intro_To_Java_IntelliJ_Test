public class Planet {

    private String name;
    private double size;
    private boolean exploded;

    public Planet(String name, double size, boolean exploded){
        this.name = name;
        this.size = size;
        this.exploded = exploded;
    }

    public String getName() {
        return this.name;
    }

    public double getSize() {
        return this.size;
    }

    public boolean getExploded() {
        return this.exploded;
    }

    public String explode() {
        this.exploded = true;
        return String.format("%s has exploded? %s", name, exploded);
    }
}
