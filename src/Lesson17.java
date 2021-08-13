import java.util.ArrayList;

public class Lesson17 {
    public static void main(String[] args) {

//      Create seven heroes and three villains as the objects and two Districts as the objects.

        Hero hero1= new Hero ("Marta","Dice", "Superman", 12345,23);
        Hero hero2= new Hero ("Annija","Pukite", "Batman", 124545,2);
        Hero hero4= new Hero("Janis", "Ozolins", "Spiderman", 123568, 7);
        Hero hero5= new Hero("Ricards", "Berzins", "Hulk", 123778, 72);
        Hero hero6= new Hero("Egija", "Vanis", "Lemonman", 124568, 23);
        Hero hero7= new Hero("Peteris", "Calis", "Flowerman", 123558, 33);
        Hero hero3 = new Hero();
        hero3.setName("Elina");
        hero3.setSurname("Dice");
        hero3.setNickname("Ironman");
        hero3.setDeedTime(34);
        hero3.setHeroID(12345);

        Villain villain1 = new Villain("Toms", "Berzins", "Turtleman",124,34  );
        Villain villain2 = new Villain("Maija", "Priede", "Penguin", 12467, 35);
        Villain villain3 = new Villain("Edgars", "Egle", "Sofaman", 2345, 15);

        ArrayList<Hero> heroesInTheDistrict1 = new ArrayList<Hero>();
        ArrayList<Hero> heroesInTheDistrict2 = new ArrayList<Hero>();
        District district1 = new District("Lauki", "Ergli", 124589, heroesInTheDistrict1);
        District district2 = new District("Pilseta", "Riga", 124568,heroesInTheDistrict2);

//      Add three heroes in the first District and others in the second District.

        district1.addNewHero(hero1);
        district1.addNewHero(hero2);
        district1.addNewHero(hero3);
        district2.addNewHero(hero4);
        district2.addNewHero(hero5);
        district2.addNewHero(hero6);
        district2.addNewHero(hero7);

//      Print out all information about each District.
        System.out.println(district1.toString());
        System.out.println(district2.toString());

//      Print out all information about all Villains.
        System.out.println("Villain Nr.1: " + villain1);
        System.out.println("Villain Nr.2: " +villain2);
        System.out.println("Villain Nr.3: " +villain3);

//      Remove one hero from the second District.
        district2.removeHero(2);
        System.out.println(district2.toString());

//      Create an arraylist for Villains storing. Put all Villains in it.
        ArrayList<Villain> villainArrayList = new ArrayList<>();
        villainArrayList.add(villain1);
        villainArrayList.add(villain2);
        villainArrayList.add(villain3);

//      Find out the total number (total time) of the crimes in which the Villains were involved.
        int crimeSum = 0;
        for (Villain villain: villainArrayList) {
            crimeSum+= villain.getCrimeTime();
        }
        System.out.println("There are " + crimeSum + " crimes in which Villains are involved.");

//       Find out which Villains is involved the most to crimes (max time spent).
            if (villain1.getCrimeTime()> villain2.getCrimeTime() && villain1.getCrimeTime()> villain3.getCrimeTime()){
                System.out.println("The " + villain1.getName() + " is involved in most crimes = " + villain1.getCrimeTime());
            } else if (villain2.getCrimeTime()> villain1.getCrimeTime() && villain2.getCrimeTime()> villain3.getCrimeTime()){
                System.out.println("The " + villain2.getName() + " is involved in most crimes = " + villain2.getCrimeTime());
            } else{
                System.out.println("The " + villain3.getName() + " is involved in most crimes = " + villain3.getCrimeTime());
            }

//      Calculate average level of each District.
        district1.calculateAvgLevelInDistrict();
        System.out.println("Average level of district 1: " + district1.calculateAvgLevelInDistrict());
        district2.calculateAvgLevelInDistrict();
        System.out.println("Average level of district 2: " + district2.calculateAvgLevelInDistrict());

//      Create an arraylist of the Districts and put both District objects in the arraylist.

        ArrayList<ArrayList<Hero>> bothDistricts = new ArrayList<>();
        bothDistricts.add(heroesInTheDistrict1);
        bothDistricts.add(heroesInTheDistrict2);

        System.out.println(bothDistricts.toString());

//      Calculate how many heroes are in both Districts.

        int numberOfHeroesInBothDistricts = 0;
        numberOfHeroesInBothDistricts = heroesInTheDistrict1.size()+heroesInTheDistrict2.size();
        System.out.println("There are " + numberOfHeroesInBothDistricts + " heroes in both districts.");

//      Calculate the average level of both Districts.
        float averageLevelOfBothDistricts = 0;
        averageLevelOfBothDistricts = (district1.calculateAvgLevelInDistrict() + district2.calculateAvgLevelInDistrict()) / bothDistricts.size();
        System.out.println("Average level of both districts is: " + averageLevelOfBothDistricts);

//      Find out which District is the best based on the average level of heroes.

        if (district1.calculateAvgLevelInDistrict()>district2.calculateAvgLevelInDistrict()){
            System.out.println("The district1 is the best!");
        } else if (district2.calculateAvgLevelInDistrict()>district1.calculateAvgLevelInDistrict()) {
            System.out.println("The district 2 is the best!");
        } else {
            System.out.println("Both districts are equal!");
        }

//      Delete the first District. What’s happening with heroes in there?

        bothDistricts.remove(district1);
        System.out.println(bothDistricts.toString());
    }
}

