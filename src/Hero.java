public class Hero extends Person {
    private String name;
    private String surname;
    private String nickname;
    private int heroID;
    private int deedTime;

    //    CalculatedLevel method
    public int calculatedLevel() {
        if (deedTime < 20) {
            return 1;
        } else if (deedTime >= 20 && deedTime < 40) {
            return 2;
        } else if (deedTime >= 40) {
            return 3;
        } else {
            return 0;
        }
    }

    //    To string method
    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", heroID=" + heroID +
                ", deedTime=" + deedTime +
                '}';
    }

//Argument constructor

    public Hero(String name, String surname, String nickname, int heroID, int deedTime) {
        this.name = name;
        this.surname = surname;
        this.nickname = nickname;
        this.heroID = heroID;
        this.deedTime = deedTime;
    }
    // No - argument constructor
    public Hero() {
        name = "Superman";


    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getHeroID() {
        return heroID;
    }

    public void setHeroID(int heroID) {
        this.heroID = heroID;
    }

    public int getDeedTime() {
        return deedTime;
    }

    public void setDeedTime(int deedTime) {
        this.deedTime = deedTime;
    }
}

