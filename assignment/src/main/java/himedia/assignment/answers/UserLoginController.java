package himedia.assignment.answers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import himedia.assignment.answers.vo.UserVo;
import jakarta.servlet.http.HttpSession;

/*
[TODOS]
- 본 서블릿을 /users/login의 POST 메서드에 반응하도록 만들어 주십시오
- 전달된 HTML 폼의 데이터를 userId와 userPassword로 받아 주십시오
- 정상적인 사용자 정보는 CORRECT_USERID, CORRECT_USERPASSWORD에 담겨 있습니다. 
- 입력한 userId가 CORRECT_USERID와 일치하고 userPassword가 CORRECT_USERPASSWORD와 일치하면
	- UserVo에 해당 정보를 담아서 HttpSession에 authUser로 속성 추가해 주십시오.
- 성공, 실패에 관계 없이, 홈 페이지로 리다이렉트(Redirect)해 주십시오.
 */
@Controller
@RequestMapping("/users")
public class UserLoginController {
	private static String CORRECT_USERID = "himedia";
	private static String CORRECT_USERPASSWORD = "himedia";
	
//	@GetMapping("/login")
//	public String loginForm(@ModelAttribute UserVo userVo) {
//		return "/";	
//	}
	
	@PostMapping("/login")
	public String loginAction(
				@RequestParam(value="userId",
							required=false) 
				String id,
				@RequestParam(value="userPassword",
							required=false)
				String password,
				HttpSession session) {
		
		if ("himedia".equals(id) && "himedia".equals(password)) {
			UserVo userVo = new UserVo();
			userVo.setUserId(id);
			userVo.setUserPassword(password);
			
			session.setAttribute("authUser", userVo);
		}
		return "redirect:/";	
	}
}
