package java8;

public class Foo2 {
  public static void main(String[] args) {
  //순수함수 = 수학적 함수 > 입력받은값이 동일한경우 결과가 같아야된다.
    RunSomething2 runSomething = (number) -> {
      return number + 10;
    };

    int result = runSomething.sum(1);
    System.out.println("result = " + result);
    System.out.println(runSomething.sum(1));
    System.out.println(runSomething.sum(1));
    System.out.println(runSomething.sum(1));
    System.out.println(runSomething.sum(2));
    System.out.println(runSomething.sum(2));
    System.out.println(runSomething.sum(2));
  }
}
