package Les1;

public class Car extends Vehicle{

    //ATTRIBUTS
        private String brandName = "Audi";

    //PROPERTIES
        public Car(){
            super();
            System.out.println("Car class constructor");
        }

    //PROPERTIES
        public String getBrandName(){
            return brandName;
        }

        public void setBrandName(String brandName){
            this.brandName = brandName;
        }

        public void honk(){
            System.out.println("Tuut tuut!");
        }

        public void sound(){
            super.honk();
        }

}
