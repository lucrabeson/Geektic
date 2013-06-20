package geeks;

import javax.servlet.http.HttpServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("list")
public class ControlList extends HttpServlet {

	private static final long serialVersionUID = 1L;
	protected GeekService geekService;

	public ControlList() {}
	@Autowired
	public ControlList(GeekService g) {
		geekService = g;
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView listAllGeeks() {
		ModelAndView model = new ModelAndView("list");
		model.addObject("geeks", geekService.getGeeks());
		return model;
	}

	@RequestMapping(method = RequestMethod.POST, params={"category", "value", "sex"})
	public ModelAndView listGeeksCategory(@RequestParam(value="category") String category,
										  @RequestParam(value="value") String value,
										  @RequestParam(value="sex") String sex) {
		ModelAndView model = new ModelAndView("list");
		model.addObject("geeks", geekService.getGeeksCategory(category, value, sex));
		model.addObject("category", category);
		model.addObject("value", value);
		model.addObject("sex", sex);
		return model;
	}

}