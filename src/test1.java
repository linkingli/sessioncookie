

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class test1
 */
@WebServlet("/test1")
//test1.jsp
//jsp的字符集
//jsp的三种定义
//cookie,
//中文转义，urlencode(转义),urldecode（解析）
//cookie大小有限制，个数也有限制
public class test1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@SuppressWarnings("deprecation")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Cookie cookie=	new Cookie("username","linking");
	cookie.setMaxAge(10);
	response.addCookie(cookie);
	//初始化cookie
	Cookie[] cookies = request.getCookies();
	for(Cookie c:cookies)
	{
		System.out.println(c.getName()+""+c.getValue());
		
	}
	//获取cookie,方法一
	
	String string = cookieutils.getvaluebuname("username", request.getCookies());
	System.out.println(string);
	//获取cookie，方法二
	
	cookie.setPath("/");
	//设置path,
	@SuppressWarnings("unused")
	Cookie cookie1=	new Cookie("username",URLEncoder.encode("卡萨丁"));
	//保存中文格式的cookie
	
	//初始化session
	
	request.getSession().setAttribute("code", "mmp");
	//设置属性
	Object attribute = request.getSession().getAttribute("code");
	String coe=(String) attribute;
	System.out.println(coe);
	//获取session，方法一。
	String id=request.getSession().getId();
	System.out.print(id);
	//获取session，方法二
	request.getRequestDispatcher("/test1.jsp").forward(request, response);
	//获取session,在jsp中，类似于方法一
	
	user user=new user();
	user.setId(18);
	user.setName("linkig");
	user.setPasswd("linjdas");
	request.getSession().setAttribute("user", user);
	request.getSession().setMaxInactiveInterval(10);
	Object object = request.getSession().getAttribute("user");
	String useraaaaa=(String)object;
	System.out.println(useraaaaa);
	//object对象的session设置
	//类似的方法也可以在jsp中实现
	//jsp是在web实现，servlet是在服务器实现
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
