class TrickyMoment {
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println("The answer is: " + child.getAnswer());
	}
}

/* 
 * It's even not necessary to specify: "class Parent implements Answerable".
 * The method getAnswer() is available in Parent class and goes through inheritance to Child class.
 * The getAnswer() method is available now in Child class, so it implements Answerable interface. That's it.
 */
class Parent {
	public String getAnswer() {
		return "42";
	}
}

class Child extends Parent implements Answerable {
	/* 
	 * There is no explicitly declared getAnswer() method, 
	 * but it goes here through inheritance from Parent class.
	 */
}

interface Answerable {
	String getAnswer();
}