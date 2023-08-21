
public interface Payme {
    double getPaymentAmount();
    default void display() {
    	System.out.println(this);
    }
}

/*
 * Default methods are useful when you want to add new functionality to existing interfaces 
 * without affecting classes that already implement those interfaces. 
 * They provide a way to achieve backward compatibility in Java interfaces.
 */
/*
 * "this" refers to the current object on which the method is called, 
 * will automatically call the toString() method of that object and print its string representation.
 */