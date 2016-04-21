package comma.sist.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import comma.sist.controller.Controller;
import comma.sist.controller.RequestMapping;
import comma.sist.tourist.dao.TouristDAO;
import comma.sist.tourist.dao.TouristVO;

@Controller("tc")
public class TouristController {
	
	
	@RequestMapping("tourist.do")
	public String tour_list(HttpServletRequest req){
		HttpSession session=req.getSession();
		
		
		return "tourist/tourist.jsp";
	}
	
	
	

}
