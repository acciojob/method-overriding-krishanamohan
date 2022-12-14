package com.driver;

public class Main {
    public static class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }

    public static class B extends A{
        @Override
        public String meth(){
            return "Invoking method from class B";
        }
    }
  public static void main(String args[]){
      A a=new A();
      String s=a.meth();
      System.out.println(s);
      B b=new B();
      String s2= b.meth();
      System.out.println(s2);

  }
}
