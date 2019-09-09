public class HelloWorld {
    public static void main(String[] args){

        Student vasya = new Student("Василий", 14);
        Student petya = new Student ("Петя");

        Student[] students = {vasya, petya};

        for (Student student: students){
            System.out.println(student);
        }
    }
}

