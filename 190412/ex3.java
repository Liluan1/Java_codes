import java.lang.Object;

class Student extends Object{
    public String toString(){
        return "Student";
    }
}

class Teacher extends Object{
    public String toString(){
        return "Teacher";
    }
}

class Course extends Object{
    public String toString(){
        return "Course";
    }
}

class ex3{
    public static void main(String[] args){
        Object[] obj = new Object[3];
        obj[0] = new Student();
        obj[1] = new Teacher();
        obj[2] = new Course();
        for(int i=0;i<3;++i){
            System.out.println(obj[i]);
        }
    }
}
