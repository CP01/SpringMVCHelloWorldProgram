package java4s;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Java4sController {

	@RequestMapping("/java4s")
	public ModelAndView helloWorld() {
		String message = "Welcome from Controller";
		message += "<br> Mazel Tov!!!";

		return new ModelAndView("welcomePage", "welcomeMessage", message);
	}
}
