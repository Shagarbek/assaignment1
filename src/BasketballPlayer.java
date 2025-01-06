
class BasketballPlayer extends player {
    private int pointsScored;

    public BasketballPlayer(String name, int age, String position, int pointsScored, Sport basketball) {
        super(name, age, position);
        this.pointsScored = pointsScored;
    }


    // Polymorphism: Specific implementation of play() method
    @Override
    public void play() {
        System.out.println(getName() + " is playing basketball, scoring points: " + pointsScored);
    }

    @Override
    public String toString() {
        return super.toString() + ", Points Scored: " + pointsScored;
    }
}
