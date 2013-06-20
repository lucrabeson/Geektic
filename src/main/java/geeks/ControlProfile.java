package geeks;

import javax.servlet.http.HttpServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("profile")
public class ControlProfile extends HttpServlet {

	private static final long serialVersionUID = 1L;
	protected GeekService geekService;

	public ControlProfile() {}
	@Autowired
	public ControlProfile(GeekService g) {
		geekService = g;
	}

	@RequestMapping(method = RequestMethod.GET, params = "id")
	public ModelAndView geekById(@RequestParam("id") int id) {
		ModelAndView model = new ModelAndView("profile");
		model.addObject("geek", geekService.getGeek(id));
		return model;
	}

}