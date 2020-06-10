package bean;

public class Ch {
	private int id;
	private String name;
	private String main;
	private String mail;
	private String time;

	public Ch(){

	}
	public Ch(int id,String name,String main,String mail,String time){
		this.id = id;
		this.name = name;
		this.main = main;
		this.mail = mail;
		this.time = time;
	}

	public int getId() {
		return id;

	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getMain() {
		return main;

	}

	public void setMain(String main) {
		this.main = main;
	}

	public String getMail() {
		return mail;

	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTime(){
		return time;
	}

	public void setTime(String time){
		this.time = time;
	}

}
