package restaurant;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RestaurantMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int id;
Map<Integer,Restaurant> map=new HashMap<Integer,Restaurant>();

map.put(1, new Restaurant("Chicken Biryani",130));
map.put(2, new Restaurant("Paneer Butter Masala",120));
map.put(3, new Restaurant("Fried Chicken Momo",80));
map.put(4, new Restaurant("Chicken Manchurian",110));
map.put(5, new Restaurant("Mushroom Chilli",140));

System.out.println("Welcome to C3805 Restaurant");
System.out.println("============================");
System.out.println("MENU");
System.out.println("=============================");
System.out.println("ITEMS\t\t\tPRICE");

for(Map.Entry em:map.entrySet())
{
Restaurant rest=(Restaurant) em.getValue()	;
System.out.print(em.getKey()+")");
rest.display();
}
System.out.println();
do {
System.out.println("Enter Food ID :");
id=sc.nextInt();
Restaurant rest=map.get(id);
Billing.order(rest.getFname(), rest.getPrice());
Billing.cont();
	}while(true);

}
}
