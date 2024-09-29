package MyFirstProjecttt.controller;

import MyFirstProjecttt.entity.Student;
import MyFirstProjecttt.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        return studentService.create(student);
    }

    @GetMapping("/{id}")
    public Optional<Student> getById(@PathVariable Long id){
        return studentService.getStudent(id);
    }

    @GetMapping("/all")
    public List<Student> getAllStudents(){
        return studentService.getAll();
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id,@RequestBody Student updatedStudent){
        return studentService.update(id,updatedStudent);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.delete(id);
    }

}
