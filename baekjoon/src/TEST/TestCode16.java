package TEST;

public class TestCode16 {
	public static void main(String[] args) {
		class Animal { 
			public String noise() {
				return "peep" ; 
			}
		}
		
		class Dog extends Animal {
			public String noise() {
				return "brak";
			}
		}
		
		class Cat extends Animal{
			public String noise() {
				return "meow";
			}
		}
		
		Animal animal = new Dog();
		Cat cat = new Cat();
		System.out.println(cat.noise());
	}
}

