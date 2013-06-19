package geeks;

import javax.servlet.http.HttpServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class ControlIndex extends HttpServlet {

	private static final long serialVersionUID = 1L;
	protected GeekService geekService;

	public ControlIndex() {}
	@Autowired
	public ControlIndex(GeekService g) {
		geekService = g;
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView indexAction() {
		ModelAndView model = new ModelAndView("index");
		model.addObject("geekNumero1", geekService.getGeek(1));
		return model;
	}

}