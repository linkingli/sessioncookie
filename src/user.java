
public class user {
	private String name;
	private int id;
	private String passwd;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public user() {
		
	}
	@Override
	public String toString() {
		return "user [name=" + name + ", id=" + id + ", passwd=" + passwd + "]";
	}
	
}
