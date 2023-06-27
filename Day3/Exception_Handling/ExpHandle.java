class ExpHandle {
  public static void main(String[] args) {
    try {
      // code that generates exception
      int divideByZero = 10 / 2;
      System.out.println("Division is "+divideByZero);
      int div=10/0;
    }

    catch (ArithmeticException e) {
      System.out.println("ArithmeticException => " + e.getMessage());
    }
    
    finally {
      System.out.println("This is the finally block");
    }
  }
}