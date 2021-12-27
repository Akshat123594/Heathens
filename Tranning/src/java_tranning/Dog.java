package java_tranning;
class Dog
{
static int legs=4;
static void eat()
{
System.out.println("Eats Bones");
}
public static void main(String args[])
{
Dog.eat();
System.out.println(Dog.legs);
Dog d=new Dog();
d.eat();
System.out.println(d.legs);
}
}



