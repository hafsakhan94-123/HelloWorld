package ICE4;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package pizzashop;



/** To achieve Liskov principle, pepperoni class should extend cheesePizza class and not pizza class.
    Pepperoni pizza only needs to add pepperoni on cheesePizza which is extra on it.
    addTopping() method is commented out because it is not needed, since no toppings are needed to make pepperoni pizza.
 */
public class PepperoniPizza extends CheesePizza
{
    public PepperoniPizza()
    {
        super();
        // super.addTopping("cheese");
        super.addTopping("pepperoni");
    }
    
    public void bake(int temp)
    {
        super.bakeTemp = temp;
        //do some baking here, code not implemented yet
        //not necessary for the review
    }
}
