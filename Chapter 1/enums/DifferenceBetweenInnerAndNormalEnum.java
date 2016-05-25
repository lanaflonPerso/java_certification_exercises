public class DifferenceBetweenInnerAndNormalEnum {
	/* Even inner enum can't be declared as final, but it can be declared as static */
	private static /* final */ enum HomeAnimal {
		DOG, CAT
	}
	
	protected enum SemicolonCanBeUsed {
		VAL_1, VAL_2
	}; /* <-- */
	
	public static void main(String[] args) {
		HomeAnimal homeAnimal = HomeAnimal.DOG;
		System.out.println(homeAnimal);
		
		WildAnimal wildAnimal = WildAnimal.LION;
		System.out.println(wildAnimal);
		
		/* Enum types MUST not be local, only normal or inner (inside class) */
		/* enum EnumInsideMethodIsNotAllowed {VAL_1, VAL_2} */
	}
}

/* The only possible modifier for normal (not inner) enums - 
 * public access modifier (and absence of it - default access level) */
/* static final */ enum WildAnimal {
	WOLF, LION
}

/* Of course, enums can't be abstract (we can't extend it) */
/* abstract */ enum Animal {Home, Wild}

/* For declaration of normal (not inner) enum we can't use protected access level
 * but we can do it for inner enums */
/* protected */ enum TestEnumNotProtected {Home, Wild}

interface SomeInterface {
	/* Enum inside interface MUST not use final, protected modifiers */
	/* protected final */ enum EnumInsideInterfaceIsAllowed {VAL_1, VAL_2}
	
	/* As for enums inside classe, enums inside interface can be marked as static */
	static enum EnumInsideInterfaceCanBeStatic {VAL_1, VAL_2}
}

enum EnumWithConstantSpecificClassBody {
	VAL_1(1), VAL_2(2), VAL_N(999) {
		/* This stuff (something like anonymous class)
		 * is called "constant spacific class body" */
		public void printNumber() {
			System.out.println("This is the last item");
		}
	/* } */
	}; /* <-- this semicolon is REQUIRED (!!!) in case of constant spacific class body */
	
	EnumWithConstantSpecificClassBody(int number) {
		this.number = number;
	}
	
	private int number;
	
	public void printNumber() {
		System.out.println("This is an item #" + number);
	}
}