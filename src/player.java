abstract class Player {
    private String name;
    private int age;
    private String position;

    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    //Getters and setters for attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // Abstract method to be implemented by subclasses
    public abstract void play();

    // Method to return a string representation of the player
    @Override
    public String toString() {
        return "Player Name: " + name + ", Age: " + age + ", Position: " + position;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        player player = (player) obj;
        return age == player.age && name.equals(player.getName()) && position.equals(player.getPosition());
    }

    @Override
    public int hashCode() {
        return name.hashCode() + position.hashCode() + Integer.hashCode(age);
    }
}

