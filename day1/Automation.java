package week3.day1;

public class Automation extends MultipleLanguage implements Language, TestTool {
	public void ruby() {
		System.out.println("ruby used for building servers and data processing, web scraping, and crawling");
	}
	public void java() {
		System.out.println("Java is a widely used object-oriented programming language and software platform");
	}
	public void Selenium() {
		System.out.println("Selenium is an open-source tool that automates web browsers");
	}
	
	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.ruby();
		auto.Selenium();
		auto.java();
		auto.python();
			
		
	}
	
}
