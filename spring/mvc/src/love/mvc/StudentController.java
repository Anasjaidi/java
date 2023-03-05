package love.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
//	@RequestMapping("/")
	public String showForm2(Model model) {
		
		Student newStudent = new Student();
		
		model.addAttribute("student", newStudent);
		
		return "student-form";
	}
	
	@RequestMapping("/showtheForm")
	public String showForm(Model model) {
		
		Student newStudent = new Student();
		
		model.addAttribute("student", newStudent);
		
		return "student-form";
	}
	
	@RequestMapping("/processtheForm")
	public String processForm(@ModelAttribute("student") Student newStudent) {
		
		System.out.println(newStudent.getFirstName());
		System.out.println(newStudent.getLastName());
		return "student-confirmation";
	}
}
