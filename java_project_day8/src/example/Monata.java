package example;

public class Monata extends Car{
	
	private String series;
	private String use;
	
	//생성자 선언
	public Monata(String color, int account, String series, String use) {
		super(color, account);
		this.series = series;
		this.use = use;
	}
	
	public String toString() {
		return String.format(super.toString() + "[용도] %-10s[시리즈] %-10s", use ,series);
	}
	

}
