package in.practice;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<> ( new Comparator<Student> () {
            @Override
            public int compare(Student o1 , Student o2) {
                return o1.getGrade () - o2.getGrade ();
            }
        } );

        queue.offer ( new Student ( "Narayan", 'B' ) );
        queue.offer ( new Student ( "Dev", 'C' ) );
        queue.offer ( new Student ( "Ankit", 'A' ) );
        queue.offer ( new Student ( "Dev", 'D' ) );
        queue.offer ( new Student ( "Nepal", 'A' ) );
        queue.offer ( new Student ( "Anuj", 'B' ) );

        System.out.println (queue);
        System.out.printf ("Got %s\n", queue.poll ());
        System.out.printf ("Got %s", queue.poll ());
        System.out.printf ("\nGot %s", queue.poll ());
        System.out.printf ("\nGot %s", queue.poll ());
        System.out.printf ("\nGot %s", queue.poll ());
        System.out.printf ("\nGot %s", queue.poll ());
        System.out.printf ("\nGot %s", queue.poll ());

    }







    private static class Student{
        private final String name;
        private final char grade;

        public Student(String name, char grade){
            this.name = name;
            this.grade = grade;
        }

        public String getName(){
            return  name;
        }

        public char getGrade(){
            return grade;
        }

        @Override
        public String toString() {
            return "name='" + name +
                    ", grade=" + grade;
        }
    }
}
