package Oefening2Planeten;

public abstract class Planet {
    //ATTRIBUTS
        protected final double RADIUS;
        private final double PI = Math.PI;
        protected double omtrek;

    //CONSTRUCTOR
        public Planet(double radius){
            this.RADIUS = radius;
            setOmtrek(radius);
        }

    //METHODS
        //final
        private final void setOmtrek(double radius){
            omtrek = PI*(radius * 2);
        }
        //abstract
        public abstract String getOmtrek();
        public abstract String getRadius();

}
