package exam_multi_type_parameter;

public class Product<T,M> {
	//필드선언
	private T kind; //상품의 종류
	private M model; //상품의 모델
	//생성자 선언
	public Product() {}
	public Product(T kind, M model) {
		this.kind = kind;
		this.model = model;
	}
	
	//접근자, 설정자
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	//출력메서드
	@Override
	public String toString() {
		return "kind : " + kind.getClass().getSimpleName().toUpperCase() + " model : " + model;	 //getSimpleName 대문자 변경
	}
	
}
