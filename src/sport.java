
class Sport {
    private String name;
    private int teamSize;

    // Constructor
    public Sport(String name, int teamSize) {
        super();
        this.name = name;
        this.teamSize = teamSize;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return "Sport{name='" + name + "', teamSize=" + teamSize + "}";
    }
}


