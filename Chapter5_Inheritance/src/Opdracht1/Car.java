package Opdracht1;

public class Car {

    //ATTRIBUTS
        private String color;
        private int speed;
        private int hp;

    //CONSTRUCTORS
        public Car() {}
        public Car(String color) {
            this.color = color;
        }
        public Car(String color, int hp) {
            this.color = color;
            this.hp = hp;
        }

    //GETTER AND SETTER
        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public int getHp() {
            return hp;
        }

        public void setHp(int hp) {
            this.hp = hp;
        }

    //OTHER METHODS
        public void accelerate(int amount){
            speed+=Math.abs(amount)+(hp/100);
        }
        public void slow(int amount){
            speed-=Math.abs(amount)+(hp/100);
        }
        public void park(){
            speed = 0;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "color='" + color + '\'' +
                    ", speed=" + speed +
                    ", hp=" + hp +
                    '}';
        }
}
