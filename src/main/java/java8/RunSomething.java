package java8;
/*
* 람다식 활용
* 추상메서드가 한개만있으면 함수형 인터페이스
* public생략 static, default 메서드선언
* @FunctionalInterface 어노테이션 정의
* */
@FunctionalInterface
public interface RunSomething {
  void doIt();

  public static void printName(){
    System.out.println("static 메서드");
  }

  default void printAge(){
    System.out.println("40");
  }
}
