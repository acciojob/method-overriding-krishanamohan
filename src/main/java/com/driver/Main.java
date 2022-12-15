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
    //  A a=new A();
    //   System.out.println(a.meth());

      B b=new B();
      System.out.println(b.meth());

  }
}
