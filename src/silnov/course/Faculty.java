package silnov.course;

public class Faculty {

	public Faculty(Employee dean, String name) {
		this.dean = dean;
		this.name = name;
	}

	private Employee dean;
	private String name;

	public Employee getDean() {
		return dean;
	}

	public void setDean(Employee dean) {
		this.dean = dean;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCountLecturers(){
		return 100;
	}


}