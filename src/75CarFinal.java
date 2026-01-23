 class CarFinal {
    final int noOfWheels;
    final String model;
    final String engineInLiters;

     public CarFinal(int noOfWheels , String model , String engineInLiters) {
         this.noOfWheels = noOfWheels;
         this.model = model;
         this.engineInLiters = engineInLiters;
     }

     @Override
     public String toString() {
         return "CarFinal{" +
                 "noOfWheels=" + noOfWheels +
                 ", model='" + model + '\'' +
                 ", engineInLiters='" + engineInLiters + '\'' +
                 '}';
     }

     public static void main(String[] args) {
         CarFinal bolero = new CarFinal ( 4, "2020", "5" );
         System.out.println (bolero);
     }
 }
