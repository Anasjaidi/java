package love.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWoldController {
	@RequestMapping("/showform")
	public String showForm() {
		return "helloworld-form";
	}

	
	@RequestMapping("/showformVersionTwo")
	public String showFormv2() {
		return "helloworld-form-v2";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String processFormV2(HttpServletRequest req, Model model) {
		String nameString = req.getParameter("studentName");
		
		nameString = nameString.toUpperCase();
		
		model.addAttribute("message", "Yo! " + nameString);
		
		return "helloworld-message";
	}
}
