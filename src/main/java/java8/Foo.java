package java8;

public class Foo {
  public static void main(String[] args) {
    //익명 내부 클래스 anonymous inner class
//    RunSomething runSomething = new RunSomething() {
//      @Override
//      public void doIt() {
//        System.out.println("Hello");
//      }
//    };
    //함수형 인터페이스를 구현할때 쓸수있는 람다 표현식
    RunSomething runSomething = () -> System.out.println("Hello World");
    RunSomething runSomething2 = () -> {
      System.out.println("Hello World");
      System.out.println("안녕하세요");
    };
    runSomething.doIt();
    runSomething2.doIt();
  }
}
