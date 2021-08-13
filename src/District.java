import java.lang.reflect.Array;
import java.util.ArrayList;

public class District {
    private String title;
    private String city;
    private int districtID;
    ArrayList<Hero> heroesInTheDistrict = new ArrayList<Hero>();

//    No argument constructor

    public District(String title, String city, int districtID, ArrayList<Hero> heroesInTheDistrict) {
        this.title = title;
        this.city = city;
        this.districtID = districtID;
        this.heroesInTheDistrict = heroesInTheDistrict;
    }

    //    Argument constructor
    public District() {
    }

//    Get and set functions

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDistrictID() {
        return districtID;
    }

    public void setDistrictID(int districtID) {
        this.districtID = districtID;
    }

    public ArrayList<Hero> getHeroesInTheDistrict() {
        return heroesInTheDistrict;
    }

    public void setHeroesInTheDistrict(ArrayList<Hero> heroesInTheDistrict) {
        this.heroesInTheDistrict = heroesInTheDistrict;
    }

//  To String method

    @Override
    public String toString() {
        return "District{" +
                "title='" + title + '\'' +
                ", city='" + city + '\'' +
                ", districtID=" + districtID +
                ", heroesInTheDistrict=" + heroesInTheDistrict +
                '}';
    }
    //  Add new hero method
    public boolean addNewHero(Hero hero){
        heroesInTheDistrict.add(hero);
        return true;
    }

    //  Remove a hero method
    public Hero removeHero (int index){
        return heroesInTheDistrict.remove(index);
    }
    //  Calculate average level in the district method
    public float calculateAvgLevelInDistrict(){
        float heroLevelSum = 0;
        for (int i = 0; i < heroesInTheDistrict.size(); i++) {
            Hero hero= heroesInTheDistrict.get(i);
            heroLevelSum= hero.calculatedLevel();
        }
        return heroLevelSum/heroesInTheDistrict.size();
    }
}

