//class SportsClub {
//    private String name;
//    private int members;
//
//    // Constructor
//    public SportsClub(String name, String location, int members) {
//        this.name = name;
//        this.members = members;
//    }
//
//    // Getters and setters
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//
//    public int getMembers() {
//        return members;
//    }
//
//    public void setMembers(int members) {
//        this.members = members;
//    }
//
//    @Override
//    public String toString() {
//        return "SportsClub{name='" + name + "', members=" + members + "}";
//    }
//}
public class SportsClub extends Training {
    public SportsClub(int members, String name) {
        super(members, name);
    }

    public SportsClub(String s, String tomenaryk, int i) {
        super(s, tomenaryk, 1);
    }


    @Override
    public void display() {
        System.out.println("SportsClub details: " + this);
    }

    public void addPlayer(Player player) {
        System.out.println("Players added: " + player);
    }
}
