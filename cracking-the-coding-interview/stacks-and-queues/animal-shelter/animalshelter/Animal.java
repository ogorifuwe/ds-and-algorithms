/**.
 * File: Animal.java
 * -----------------
 */
package animalshelter;

public abstract class Animal {
    
    private int order;
    protected String name;
    
    /**. initializes a new Animal with name */
    public Animal(String name) {
        this.name = name;
    }

    public abstract String name();

    /**. mutator for order */
    public void setOrder(int order) {
        this.order = order;
    }

    /**. accessor for order */
    public int getOrder() { return order; }

    /** determines which animal is older */
    public boolean isOlderThan(Animal a) {
        return this.order < a.getOrder();
    } 
}
