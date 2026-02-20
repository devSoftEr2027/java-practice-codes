package in.practice.superInheritance;

 class Car extends Vehicle {
     public void service(){
//         super.service ();
         System.out.println("Park Your Car in right Space....");
     }

     public static void main(String[] args) {
         Vehicle vehicle = new Vehicle ();
         Car car = new Car ();
         vehicle.service ();
         car.service ();
     }
}
