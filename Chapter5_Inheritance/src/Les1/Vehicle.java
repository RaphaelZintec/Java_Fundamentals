package Les1;

public class Vehicle {

    //ATTRIBUTS
        private String typeOfVehicle = "Car";

    //CONSTRUCTOR
        public Vehicle(){
            System.out.println("Vehicle class constructor");
        }

    //PROPERTIES
        public String getTypeOfVehicle(){
            return typeOfVehicle;
        }

        public void setTypeOfVehicle(String typeOfVehicle){
            this.typeOfVehicle = typeOfVehicle;
        }

        public void honk(){
            System.out.println("Bip Bip");
        }

}
