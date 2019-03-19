package c5exercise9.foreign;
import c5exercise9.local.*;

public class Foreign {

  public static void main(String[] args) {
    PackagedClass pc = new PackagedClass();
  }  
}
// 1. The class PackagedClass should be public, or a foreign package method can
// not use it.
// 2. There will be no that restrict above when using a class in the same package.
// So by making the Foreign class part of the local package would fix the problem.
