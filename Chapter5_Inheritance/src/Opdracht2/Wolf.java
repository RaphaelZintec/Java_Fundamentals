package Opdracht2;

import java.util.Objects;

public class Wolf {

    //ATTRIBUTS
        private String name;
        private int lifespan;
        private static int count = 0;

    //CONSTRUCTORS
        public Wolf(){++count;}

        public Wolf(String name, int lifespan) {
            ++count;
            this.name = name;
            this.lifespan = lifespan;
        }

    //METHODS
        public int getCount(){
            return this.getCount();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getLifespan() {
            return lifespan;
        }

        public void setLifespan(int lifespan) {
            this.lifespan = lifespan;
        }

        public void makeNoise() {
            System.out.println("Auuuuuuuuuuuuuuuuwwwwwww");
        }

        public void makeNoise(String noise) {
            System.out.println(noise);
        }

    //OVERRIDES
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Wolf)) return false;
            Wolf wolf = (Wolf) o;
            return getLifespan() == wolf.getLifespan() && getName().equals(wolf.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName(), getLifespan());
        }

        @Override
        public String toString() {
            return "Wolf{" +
                    "name='" + getName() + '\'' +
                    ", lifespan=" + getLifespan() +
                    ", counter=" + getCount() +
                    '}';
        }
}
