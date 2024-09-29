package MyFirstProjecttt.service;

import MyFirstProjecttt.entity.Student;
import MyFirstProjecttt.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {
//    private final ModelMapper modelMapper;
    private final StudentRepository studentRepository;

    public Student create(Student student) {
        return studentRepository.save(student);
    }

    public Optional<Student> getStudent(Long id){
        return studentRepository.findById(id);
    }

    public List<Student> getAll(){
        return  studentRepository.findAll();
    }

    public Student update(Long id,Student updatedStudent){
        Student existingStudent= studentRepository.findById(id)
                .orElseThrow(()->new RuntimeException("aloooo xetaaa"));

        existingStudent.setAge(updatedStudent.getAge());
        existingStudent.setName(updatedStudent.getName());
        existingStudent.setSurname(updatedStudent.getSurname());
        return studentRepository.save(existingStudent);
    }

    public void delete(Long id){
        studentRepository.deleteById(id);
    }

}
