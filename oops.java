import java.util.*;


/**
 * 
 * public - accessible everywhere
 * private - only within the class where it is defined.
 * 
 * protected - same class, same package, and derived classes which are in other package as well
 * 
 * default ( package private(only within package), when no modifier is specified)
 * 
 * 
 * */

class Test{

	int n;
	//constructor
	public Test(){
		System.out.println("Default cons called");
	}

	// void method
	public void printTest(int num){
		n = num;
		System.out.println(n);
	}
	public int sum(int n1, int n2){
		return n1+n2;
	}

}

//constructor
class BankAccount{
	int balance;
	public BankAccount(){
		balance = 100;
	}
	public void printBalance(){
		System.out.println(balance);
	}
}

//parameterised Constructro
class Bank{
	int balance;
	String accountType;
	public Bank(int balance){
		this.balance = balance;
		this.accountType = "Savings";
	}
	public Bank(int _balance, String _accountType){
		balance = _balance;
		accountType = _accountType;
	}
	public void printBalance(){
		System.out.println(balance);
	}
	public void printAccountType(){
		System.out.println(accountType);
	}
}


//inheritance

//base class
class Vehicle{
	String vehicleNum;
	public Vehicle(String vehicleNum){
		this.vehicleNum = vehicleNum;
	}
	public void honk(){
		System.out.println("Honk!!!!!!");
	}
	public void printNumber(){
		System.out.println(vehicleNum);
	}
}
//derived classes
class Car extends Vehicle{
	public Car(String numofCar){
		super(numofCar);
	}
	//polymorphism
	@Override
	public void honk(){
		System.out.println("Give me way");
	}
	
}
class Bus extends Vehicle{
	public Bus(String noofBus){
		super(noofBus);
	}
}

//Abstraction
abstract class Baroda{
	double balance;
	abstract void addMoney(double amount);
	abstract void canwithdraw(double amount);

	void updateBalance(double _balance){
		balance = _balance;
	}
	public double getBalance(){
		return balance;
	}
}

class SavingsAccount extends Baroda{
	public SavingsAccount(){
		super.updateBalance(2000);
	}
	public void addMoney(double amount){
		super.updateBalance(super.getBalance()+amount);
	}
	public void canwithdraw(double amount){
		if(amount <= super.getBalance()){
			System.out.println("User can withdraw");
		}
		else{
			System.out.println("Cannot withdraw");
		}
	}
}

class CurrentAccount extends Baroda{
	public CurrentAccount(){
		super.updateBalance(5000);
	}

	int MinLimit = 1500;
	public void addMoney(double amount){
		super.updateBalance(super.getBalance()+amount);
	}
	public void canwithdraw(double amount){
		if(super.getBalance()-amount >=MinLimit){
			System.out.println("User can withdraw");
		}
		else{
			System.out.println("User cannot withdraw");
		}
	}
}


//Interface

interface Animal{
	void bark();
	default void sleep(){
		System.out.println("Sleeping......");
	}
	static void haha(){
		System.out.println("This is haahaaaa");
	}
}
interface Pet{
	void ownerName();
}

public class Dog implements Animal,Pet{
	public void bark(){
		System.out.println("Dog is Barking....");
	}
	public void sleep(){
		System.out.println("Dog is Sleeping");
	}
	public void ownerName(){
		System.out.println("XYZZZZ");
	}
}

public class Cat implements Animal{
	public void bark(){
		System.out.println("Meowww");
	}
}

public class oops {
	//for directly access the methods they should be static. so that they can be
	//called from psvm.
	public static int number(int age){
		return age;
	}
    public static void main(String[] args) {
        // Your code here

        int age = number(16);
        System.out.println(age);
        Test t1 = new Test();
        t1.printTest(4);

        Test t2 = new Test();
        t2.printTest(5);

        Test t3 = new Test();
        System.out.println(t3.sum(5,4));

        //constructor
        BankAccount b = new BankAccount();
        b.printBalance();

        Bank b1 = new Bank(150,"Savings");
        b1.printBalance();
        b1.printAccountType();

        Bank b2 = new Bank(150, "Current");
        b2.printBalance();
        b2.printAccountType();

        //Inheritance
        Car c = new Car("TG3693");
        c.printNumber();
        c.honk();
        
        Bus bus =new Bus("TG4675");
        bus.printNumber();
        bus.honk();

        //Abstraction
        SavingsAccount sz = new SavingsAccount();
        sz.canwithdraw(4000);
        CurrentAccount cz = new CurrentAccount();
        cz.canwithdraw(5000);

        //interfaces
        Dog dg = new Dog();
        dg.bark();
        dg.sleep();
        dg.ownerName();

        Cat ct = new Cat();
        ct.bark();
        ct.sleep();

        //static method call
        Animal.haha();
    }

}