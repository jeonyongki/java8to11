package java8;

import java.util.function.*;

public class Plus10Example {
  public static void main(String[] args) {
    //기본
    Plus10 plus10 = new Plus10();
    System.out.println(plus10.apply(1));

    //T 타입을 받아서 R 타입을 리턴하는 함수 인터페이스 람다 표현식으로 바로구현
    Function<Integer, Integer> plus = (i) -> i + 10;
    Function<Integer, Integer> multiply = (i) -> i * 2;

    System.out.println(plus.apply(1));

    //compose
    Function<Integer, Integer> multiplyAndPlus = plus.compose(multiply);
    System.out.println("multiplyAndPlus.apply(2) = " + multiplyAndPlus.apply(2));

    //andThen
    System.out.println(plus.andThen(multiply).apply(2));

    //입력값과 리턴값이 같을떄 또는 입력값이 하나일경우
    UnaryOperator<Integer> plus2 = (i) -> i + 10;
    UnaryOperator<Integer> multiply2 = (i) -> i * 2;

    System.out.println("plus2.andThen(multiply2) = " + plus2.andThen(multiply2).apply(2));

    //두 개의 값(T, U)를 받아서 R 타입을 리턴하는 함수 인터페이스
    BiFunction<Integer,Integer,Long> add = (a,b) -> (long)a + b;
    Long r = add.apply(1,2);//R apply(T t, U u)
    System.out.println("r = " + r);
    
    //T 타입을 받아서 아무값도 리턴하지 않는 함수 인터페이스
    Consumer<Integer> printT = (num) -> System.out.println("num = " + num);
    printT.accept(10);
   
    //T 타입의 값을 제공하는 함수 인터페이스 T get()
    Supplier<Integer> get10 = () -> 10;
    System.out.println("get10 = " + get10.get());
    
    //T 타입을 받아서 boolean을 리턴하는 함수 인터페이스 test(T t)
    Predicate<String> startsWithArin = (play) -> play.startsWith("arin");
    System.out.println("startWithArin = " + startsWithArin.test("arin"));
    Predicate<Integer> isEven = (e) -> e%2 ==0;
    System.out.println("isEven = " + isEven.test(0));

  }
}
