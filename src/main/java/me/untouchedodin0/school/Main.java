package me.untouchedodin0.school;

import me.untouchedodin0.school.objects.Classroom;
import me.untouchedodin0.school.objects.School;
import me.untouchedodin0.school.objects.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        School school = new School("Developer Den");

        System.out.println("Loading school " + school.getSchoolName());

        List<Student> students = new ArrayList<>();
        List<Classroom> classrooms = new ArrayList<>();

        Classroom devDen = new Classroom("DevDen");
        Classroom java = new Classroom("Java");
        Classroom haskell = new Classroom("Haskell");

        Student hydrate = new Student("Hydrate", 20, java);
        Student bristerMitten = new Student("BristerMitten", 20, haskell);
        Student redempt = new Student("Redempt", 20, java);
        Student odin = new Student("UntouchedOdin0", 20, devDen);

        students.add(hydrate);
        students.add(bristerMitten);
        students.add(redempt);
        students.add(odin);

        students.forEach(s -> {
            Classroom classroom = s.classroom();
            String formatted = String.format("Loaded student %s who's studying %s", s.name(), classroom.getSubject());
            System.out.println(formatted);
            classrooms.add(classroom);
        });
        String formatted = String.format("Loaded a total of %s classrooms", classrooms.size());
        System.out.println(formatted);
    }
}
