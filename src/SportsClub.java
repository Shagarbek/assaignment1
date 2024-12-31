class SportsClub {
    private String name;
    private String location;
    private int members;

    // Constructor
    public SportsClub(String name, String location, int members) {
        this.name = name;
        this.location = location;
        this.members = members;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "SportsClub{name='" + name + "', location='" + location + "', members=" + members + "}";
    }
}
