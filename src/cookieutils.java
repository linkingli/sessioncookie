import javax.servlet.http.Cookie;

public class cookieutils {

	//通过名字获取value
	public static String getvaluebuname(String name,Cookie[] cookie)
	{
		for(Cookie i:cookie)
		{
			if(name.equals(i.getName()))
					{
						return i.getValue();
					}
		}
		return null;
	}

}
