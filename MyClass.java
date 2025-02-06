class MyClass 
{
  public static void main(String a[])
  {
    
    int num1 = 5;
    // num1++;
    
    int preRes = ++num1; // - First increment then fetch
    int postRes = num1++; // - First fetch then increment
    System.out.println(postRes);
  }
}
