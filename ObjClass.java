class Calc {
  int add(int n1, int n2){
    int r = n1 + n2;
    return r;
  }
  int sub(int n1, int n2){
    int r = n1 - n2;
    return r;
  }
  int mul(int n1, int n2){
    int r = n1 * n2;
    return r;
  }
  int div(int n1, int n2){
    int r = n1 / n2;
    return r;
  }
}

public class ObjClass {
  public static void main(String[] args){
    int num1 = 8;
    int num2 = 4;
    Calc calc = new Calc();
    System.out.println(calc.add(num1, num2));
    System.out.println(calc.sub(num1, num2));
    System.out.println(calc.mul(num1, num2));
    System.out.println(calc.div(num1, num2));
  }
}