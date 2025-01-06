
class Sport {
    private String name;
    private String type; // Например, командный или индивидуальный

    // Конструктор
    public Sport(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //toString
    @Override
    public String toString() {
        return "Sport Name: " + name + ", Type: " + type;
    }
}

// Update class Player
abstract class player {
    public String name;
    public int age;
    private String position;
    private Sport sport; // Ссылка на объект Sport

    // Конструктор
    public player(String name, int age, String position, Sport sport) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.sport = sport;
    }

    public player(String name, int age, String position) {
    }

    // getter and setter
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

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    // abstraction method
    public abstract void play();

    @Override
    public String toString() {
        return "Player Name: " + name + ", Age: " + age + ", Position: " + position + ", Sport: " + sport;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        player player = (player) obj;
        return age == player.age && name.equals(player.name) && position.equals(player.position) && sport.equals(player.sport);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + position.hashCode() + Integer.hashCode(age) + sport.hashCode();
    }
}