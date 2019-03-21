/**
 * C6Exercise15:
 * (2)Create a class inside a package. Your class ahould contain a protected
 * method. Outside of the package, try to call the protected method and explain
 * the results. Now inherit from your class and call the protected method from
 * inside a method of your derived class.
 */

 class protecedClass {
   protected void sayHello() {
     System.out.println("Hello");
   }
 }

class inheritClass extends protecedClass {
   
  public static void main(String[] args) {
    protecedClass foo = new protecedClass();
    foo.sayHello();
  }
}
