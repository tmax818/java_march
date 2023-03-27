package tyler.yoga.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "students_yogas", 
        joinColumns = @JoinColumn(name = "student_id"), 
        inverseJoinColumns = @JoinColumn(name = "yoga_id")
    )
    private List<Yoga> yogas;
    
}
