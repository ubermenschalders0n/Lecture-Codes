
public class LAB6 {
static int a = 5;
static int fun2() {
return a;
}
static int fun1() {
a = 17;
return 3;
}
public static void main(String[] args) {
a = a+++(++a); 
System.out.println("a=" + a);
}
}
