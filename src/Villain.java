public class Villain extends Person {
        private String name;
        private String surname;
        private String nickname;
        private int villainID;
        private int crimeTime;

//    To string method
        @Override
        public String toString() {
            return "Hero{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", nickname='" + nickname + '\'' +
                    ", heroID=" + villainID +
                    ", deedTime=" + crimeTime +
                    '}';
        }

//Argument constructor

        public Villain(String name, String surname, String nickname, int heroID, int crimeTime) {
            this.name = name;
            this.surname = surname;
            this.nickname = nickname;
            this.villainID = heroID;
            this.crimeTime = crimeTime;
        }
        // No - argument constructor
        public Villain() {
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
            return villainID;
        }

        public void setHeroID(int heroID) {
            this.villainID = heroID;
        }

        public int getCrimeTime() {
            return crimeTime;
        }

        public void setDeedTime(int deedTime) {
            this.crimeTime = deedTime;
        }
}
