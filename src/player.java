class Player {
    private String name;
    private int age;
    private Sport sport;
    private int experience; // in years

    // Constructor
    public Player(String name, int age, Sport sport, int experience) {
        this.name = name;
        this.age = age;
        this.sport = sport;
        this.experience = experience;
    }

    // Getters and setters
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

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Player{name='" + name + "', age=" + age + ", sport=" + sport + ", experience=" + experience + " years}";
    }
}

