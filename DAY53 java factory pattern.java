import java.util.*;
import java.security.*;
interface Food {
     public String getType();
    }
    class Pizza implements Food {
     public String getType() {
     return "Someone ordered a Fast Food!";
     }
    }
//I implemented the part starting here    
        class Cake implements Food {

         public String getType() {
         return "Someone ordered a Dessert!";
         }
        }

    class FoodFactory {
        public Food getFood(String order) {

if (order.equalsIgnoreCase("Pizza")){
        return new Pizza();}

else return new Cake();

}//End of getFood method; this is the end of the part I implemented

    }//End of factory class

    public class Solution {

     public static void main(String args[]){
            Do_Not_Terminate.forbidExit();

        try{

            Scanner sc=new Scanner(System.in);
            //creating the factory
            FoodFactory foodFactory = new FoodFactory();

            //factory instantiates an object
            Food food = foodFactory.getFood(sc.nextLine());


            System.out.println("The factory returned "+food.getClass());
            System.out.println(food.getType());
        }
        catch (Do_Not_Terminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
     }
    }
