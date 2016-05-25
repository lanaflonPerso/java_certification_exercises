public class CallEnumValueOnJustDeclaredEnumVariable {

	private static Hobbit hobbitStaticClassMember;
	
	public static void main(String[] args) {
		/* That's obvious, we always do it in this way */
		System.out.println(Hobbit.FRODO);
		
		/* It prints 'null' - and that's ok, as every object type class (or instance) variables get initialized by null  */
		System.out.println(hobbitStaticClassMember + " - static variable");
		
		/* But this was surprise for me. I thought that it didn't compile. 
		  * But it works :)  */
		System.out.println(hobbitStaticClassMember.BILBO);
		
		/*  It also works fine, because instance variables are also getting initialized while creating */
		ClassWithEnumAsInstanceMember instance = new ClassWithEnumAsInstanceMember();
		System.out.println(instance.hobbitInstanceMember.BILBO);
		
		/* It doesn't compile because hobbitVariable is not defined.
		 * But in case above that were a class member (or instance member)
		 * and it gets initialized somehow and gets a defaul value */
		Hobbit hobbitVariable;
		/* System.out.println(hobbitVariable.BILBO); */
		
		Hobbit frodo = Hobbit.FRODO;
		System.out.println(frodo);
		/* That also looks strange, 
		  * but it compiles and works fine */
		System.out.println(frodo.BILBO);
		
		/* For enums we can get constant even on null object of enum type */
		Hobbit nullHobbitEnum = null;
		System.out.println(nullHobbitEnum.FRODO);
		
		/* Hmm. We can call any static member on null object without any problems / NullPointerException's */
		ClassWithEnumAsInstanceMember instanceWithNullValue = null;
		System.out.println(instanceWithNullValue.staticVar);
		System.out.println(instanceWithNullValue.staticMethod());
	}
}

enum Hobbit {
	BILBO, FRODO
}

class ClassWithEnumAsInstanceMember {
	Hobbit hobbitInstanceMember;
	static int staticVar = 42;
	static String staticMethod() { return "static method"; }
}