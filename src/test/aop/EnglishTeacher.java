package aop;

public class EnglishTeacher implements Teacher{
    public String showClasses() {
        System.out.println("english classes");
        return "english classes";
    }
}
