public class Animal {
    private String name;
    private boolean isDog;

    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    public String getName(String name) {
        return this.name;
    }

    public boolean getIsDog(boolean isDog) {
        return this.isDog;
    }

    @Override
    public String toString() {
        return "" + this.name + " is a dog = " + this.isDog;
    }

}
