class MyClass7 {
public static void main(String[] args) {
byte n, a;
n = 127;
a=177;
System.out.println(n); // prints 127
System.out.println(a); // throws an error because it cannot store more than 127 bits
}
}