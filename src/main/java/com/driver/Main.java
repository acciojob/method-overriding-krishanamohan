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
      B a=new B();
       a.meth();

      B b=new B();
       b.meth();


  }
}
