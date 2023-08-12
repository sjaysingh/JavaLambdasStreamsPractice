package MindLStreamsCourse;

public class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString(){
        return String.format("%s %s",name, age);
    }

    @Override
    public boolean equals(final Object obj){
        if(obj==null) return false;

        if(!Person.class.isInstance(obj)) return false;

        Person p = (Person)obj;
        return this.name.equals(p.name) && this.age==p.age;
    }

    @Override
    public int hashCode(){
        return this.age + this.name.hashCode();
    }
}
