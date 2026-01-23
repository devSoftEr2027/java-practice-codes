 class StudentToString {
    String name;
    int age;
    String rollNumber;
    String house;

     public StudentToString(String name , int age , String rollNumber , String house) {
         this.name = name;
         this.age = age;
         this.rollNumber = rollNumber;
         this.house = house;
     }
         public String toString(){
         return "Student Details: { Name:" + name
                 + ", Age:" + age
                 + ", Roll number:" + rollNumber
                 + ", House:" + house + " }";
     }

     public static void main(String[] args) {
         StudentToString stu = new StudentToString ( "Narayan..", 23, "22/668", "Faridabad" );
         System.out.println (stu);
     }

 }
