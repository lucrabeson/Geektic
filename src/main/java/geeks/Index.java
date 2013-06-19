package geeks;

import javax.servlet.http.HttpServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class Index extends HttpServlet {

	private static final long serialVersionUID = 1L;
	protected GeekService geekService;

	public Index() {}
	@Autowired
	public Index(GeekService g) {
		geekService = g;
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView indexAction() {
		return new ModelAndView("index");
	}

}