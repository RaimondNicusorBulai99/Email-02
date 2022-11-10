package Servizi.Email2.students.services;

import Servizi.Email2.students.entities.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    static List<Student> students = Arrays.asList(
            new Student("1", "Raimond Nicusor", "Bulai", "condivisionedatiraimond@gmail.com"),
            new Student("2", "Rachele", "Di Gioia", "rdigioia03@white.com"),
            new Student("3", "Karina", "Kossovan", "Kossovankarina@dangeon.com"),
            new Student("4", "Mario", "Cotonacci", "m.cotonacci@boss.eu")
    );

    public Student getStudentById(String studentId) {
        Optional<Student> studentFromDb = students.stream().filter(student -> student.getId().equals(studentId)).findAny();
        if (studentFromDb.isPresent()) return studentFromDb.get();
        return null;
    }
}