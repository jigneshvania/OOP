class A {
int i; // public by default
int j; // private to A
void setij(int x, int y) {
i = x;
j = y;
//System.out.println("Total is " + j);
}
}
// A's j is not accessible here.
class B extends A {
int total;
void sum() {
total = i + j; // ERROR, j is not accessible here
}
}
class Access {
public static void main(String args[]) {
A obj = new A();
B subOb = new B();
subOb.setij(10, 12);
subOb.sum();
System.out.println("Total is " + subOb.total);
//System.out.println("Total is " + obj.j);
}
}