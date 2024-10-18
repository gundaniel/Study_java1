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
	
	@Override
	public String toString() {
		return super.toString() + "[용도] " + use + "\t[시리즈] "  + series;
	}
	

}
