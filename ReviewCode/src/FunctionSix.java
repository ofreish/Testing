import java.util.InputMismatchException;
import java.util.Scanner;

public class FunctionSix {

  /**
   * This is the main method of this class, users input number of 'a', 'b', 'x',
   * then the function output an answer.
   * If users input mismatched inputs, such as punctuation and character,
   * the console will give users prompt message,
   * users can input again.
  */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a;
    double b;
    double x;
    while (true) {
      System.out.println("Please input a: ");
      try {
        a = sc.nextDouble();
        break;
      } catch (InputMismatchException e) {
        System.out.println("a is not a number, please input it again.");
        sc.nextLine();
      }
    }
    while (true) {
      System.out.println("Please input b: ");
      try {
        b = sc.nextDouble();
        break;
      } catch (InputMismatchException e) {
        System.out.println("b is not a number, please input it again.");
        sc.nextLine();
      }
    }
    while (true) {
      System.out.println("Please input x: ");
      try {
        x = sc.nextDouble();
        break;
      } catch (InputMismatchException e) {
        System.out.println("x is not a number, please input it again.");
        sc.nextLine();
      }
    }
    System.out.println(a + "*" + b + "^" + x + "=" + pow(b, x) * a);
  }

  /**
   * This is a floor function method and it is similar to Math.floor() in Java library,
   * it round down a number. It mainly services for pow function.
   * In pow method,, it checks if the number is zero.
  */
  public static int floorAbs(double n) {
    int i = (int) n;
    if (n >= 0) {
      return (i);
    } else {
      return (1 - i);
    }
  }

  /**
   * This is pow function method, and it is the core function of this class.
   * It is similar to Math.pow(double, double) in Java math library.
   * According to input values- b,x, this function will return a result of 'b^x'.
  */
  public static double pow(double b, double x) {
    boolean gt1 = (sqrtRoot((b - 1) * (b - 1)) <= 1) ? false : true;
    int oc = -1;
    final int iter = 20;
    double p;
    double m;
    double sumX;
    if ((x - floorAbs(x)) == 0) {
      p = b;
      for (int i = 1; i < x; i++) {
        p *= b;
      }
      return p;
    }
    m = (gt1) ? (b / (b - 1)) : (b - 1);
    sumX = (gt1) ? (1 / m) : m;
    for (int i = 2; i < iter; i++) {
      p = m;
      for (int j = 1; j < i; j++) {
        p *= m;
      }
      double tempX = (gt1) ? (1 / (i * p)) : (p / i);
      sumX = (gt1) ? (sumX + tempX) : (sumX + (tempX * oc));
      oc *= -1;
    }
    double x2;
    double sumY;
    x2 = x * sumX;
    sumY = 1 + x2;
    for (int i = 2; i <= iter; i++) {
      p = x2;
      for (int j = 1; j < i; j++) {
        p *= x2;
      }
      int tempY = 2;
      for (int j = i; j > 2; j--) {
        tempY *= j;
      }
      sumY += p / tempY;
    }
    return sumY;
  }

  /**
   * This is a sqrt function method, it gets a sqrt root of a number.
   * It is a substitute of Math.sqrt().
   * It mainly services for pow function. In pow method, it checks a number if it less than one.
  */
  public static double sqrtRoot(double d) {
    if (d == 0) {
      return 0;
    }
    double i = 0;
    double x1 = 0;
    double x2 = 0;
    while ((i * i) <= d) {
      i += 0.1;
    }
    x1 = i;
    for (int j = 0; j < 10; j++) {
      x2 = d;
      x2 /= x1;
      x2 += x1;
      x2 /= 2;
      x1 = x2;
    }
    return x2;
  }
}