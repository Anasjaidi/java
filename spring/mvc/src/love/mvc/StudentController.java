package love.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	public String showForm(Model model) {
		
		Student newStudent = new Student();
		
		model.addAttribute("student", newStudent);
		
		return "student-form";
	}
}
