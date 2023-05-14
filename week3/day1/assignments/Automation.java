package week3.day1.assignments;

public class Automation extends MultipleLangauge implements Language, TestTool{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automation at = new Automation();
		at.python();
		at.java();
		at.Selenium();
		at.ruby();
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("java");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby");
	}

}
