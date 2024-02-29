package java8;

import java.util.function.Function;

public class Plus10Example {
  public static void main(String[] args) {
    //람다 표현식으로 바로구현
    Function<Integer, Integer> plus = (i) -> i + 10;
    Function<Integer, Integer> multiply = (i) -> i * 2;

    System.out.println(plus.apply(1));

    //compose
    Function<Integer, Integer> multiplyAndPlus = plus.compose(multiply);
    System.out.println("multiplyAndPlus.apply(2) = " + multiplyAndPlus.apply(2));

    //andThen
    System.out.println(plus.andThen(multiply).apply(2));

    
    Plus10 plus10 = new Plus10();
    System.out.println(plus10.apply(1));

  }
}
