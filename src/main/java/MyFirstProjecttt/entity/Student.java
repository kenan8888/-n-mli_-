package MyFirstProjecttt.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "studentTableee")
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Integer age;
    String name;
    String surname;
}
