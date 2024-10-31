package exam_collection_set;

public class Key {
  private int number;

  public Key(int number) {
      this.number = number;
  }
  
  /* Object 클래스의 메서드를 오버라이딩 함. */
  @Override
  public boolean equals(Object obj) { //슈퍼클래스 참조변수 = 서브클래스의 주솟값 -> 업캐스팅.  
      if(obj instanceof Key) {
          Key compareKey = (Key) obj; // 서브클래스 참조변수 = (서브클래스)슈퍼클래스타입 참조변수; -> 다운캐스팅
          if(this.number == compareKey.number) {
              return true;
          }
      }
      return false;
  }
  /* 업캐스팅이 되었을 때 참조변수는 서브클래스가 가진 필드 중에 슈퍼클래스로부터 상속받은 필드만 접근가능.
   * 업캐스팅이 되었을 때 참조변수는 서브클래스가 가진 메서드 중에 슈퍼클래스로부터 상속받은 메서드만 접근가능. 단 오버라이딩되었다면 우선순위를 가짐.
   * 
   * 다운캐스팅 되었을 때 참조변수는 서브클래스가 선언한 필드 접근.
   * 다운캐스팅 되었을 때 참조변수는 서브클래스가 선언한 메서드 접근.
   * */
  
  @Override
  public int hashCode() {
      return number;
  }

  @Override
  public String toString(){
      return "number : " + number;
  }
}
