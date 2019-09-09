class Student{
    public String name;
    public int age;
    public boolean isLazy;

    public Student(String name){
        this.name=name;
        age=200;
        isLazy=true;
    }

    public Student(String name, int age){
        this.name=name;
        this.age=age;
        isLazy=true;
    }

    public String toString(){
        return name + ", "+age + "y.o";
    }
}