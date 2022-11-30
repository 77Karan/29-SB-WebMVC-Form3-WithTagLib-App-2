package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.Student;
import in.ashokit.repository.StudentRepository;

@Controller
public class StudentController 
{
	
	@Autowired
	private StudentRepository repo;
	
	
	@GetMapping("loadform")
	public String loadStudentForm(Model model)
	{
		Student studentObj = new Student();
		model.addAttribute("studentObjKey",studentObj);
		return "index";
	}
	
	@PostMapping("/submitform")
	public String submitForm(Student student)
	{
		System.out.println(student);
		repo.save(student);
		return "sucess";
		
	}

}
