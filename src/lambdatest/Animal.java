package lambdatest;

public class Animal {
    private String name;
    private boolean canJump;
    private boolean canSwim;

    public Animal(String name, boolean canJump, boolean canSwim) {
        super();
        this.name = name;
        this.canJump = canJump;
        this.canSwim = canSwim;
    }

    public boolean canJump() {
        return canJump;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String toString() {
        return name;
    }
}
