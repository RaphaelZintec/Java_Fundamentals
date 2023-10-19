package Opdracht2;

public class Affenpinscher extends HomelyDog{

    //ATTRIBUTS
        private String color;
        private String nickname;

    //CONSTRUCTORS
        public Affenpinscher(){super();}

        public Affenpinscher(String name, int lifespan, char size, char coat, String color, String nickname) {
            super(name, lifespan, size, coat);
            this.color = color;
            this.nickname = nickname;
        }

    //METHODS
        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public void dance(){}

    //OVERRIDES
        @Override
        public String toString() {
            return "HomelyDog{" +
                    "name='" + getName() + '\'' +
                    ", lifespan=" + getLifespan() +
                    ", size=" + getSize() +
                    ", coat=" + getCoat() +
                    ", color=" + getColor() +
                    ", nickname=" + getNickname() +
                    ", counter=" + getCount() +
                    '}';
        }
}
