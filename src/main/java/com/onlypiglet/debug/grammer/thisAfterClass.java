package com.onlypiglet.debug.grammer;

public class thisAfterClass {

  public void run(){

    System.out.println(this);
    System.out.println(thisAfterClass.this);

  }


  public class InnerClass{


    public void run(){

      System.out.println(this);
      System.out.println(thisAfterClass.this);

    }


  }


}
