public abstract class Training {
    private String name;
    private int members;

    public Training(int members, String name) {
        this.members = members;
        this.name = name;
    }

    public Training(String s, String tomenaryk, int i) {

    }

    public abstract void display();

    public String getName() {
        return name;
    }
    public int getMembers() {
        return members;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Training{age=" + members + ", name='" + name + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Training training = (Training) obj;
        return members == training.members && name.equals(training.name);
    }

    @Override
    public int hashCode() {
        return members * name.hashCode();
    }
}