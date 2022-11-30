package in.ashokit.binding;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="KSTUDENT_DTLS")
public class Student 
{
	@Column(name="STUDENT_ID")
	@GeneratedValue
	@Id
	private Integer studentId;
	
	@Column(name="STUDENT_NAME")
	private String StudentName;
	
	@Column(name="STUDENT_EMAIL")
	private String studentEmail;
	
	@Column(name="STUDENT_PHNO")
	private Long studentPhno;
	
	@Column(name="STUDNET_GENDER")
	private String studentGender;
	
	@Column(name="STUDENT_COURSE")
	private String studentCourse;
	
	@OrderColumn
	@ElementCollection
	@CollectionTable(name="STUDENT_TIMINGS",joinColumns=@JoinColumn(name="STUDENT_ID"))
	private String[] timings;

}
