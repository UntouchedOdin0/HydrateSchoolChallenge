package me.untouchedodin0.school.objects;

public record Classroom(String subject) {

    public String getSubject() {
        return subject;
    }
}
