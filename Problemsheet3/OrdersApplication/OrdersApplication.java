package ordersapplication;

/**
 *
 * @author 20pt02
 */
   
public class OrdersApplication {

    public static void main(String[] args) 
    {
        //Orders O[];
        Orders O[] = new Orders[4];
        O[0] = new Orders();
        O[1] = new RushOrder(1);
        O[2] = new RushOrder(2);
        O[3] = new RushOrder(3);
        int max = 100;
        int min = 50;
        Scanner sc = new Scanner(System.in);
        while(true)
        {    
            System.out.println("Enter UPSC code of item or type done to exit: ");
            String code = sc.nextLine();
            if(!"done".equals(code))
            {
                System.out.println("Enter quantity: ");
                int quantity = sc.nextInt();
                int price = (int)(Math.random()*(max-min+1)+min);
                OrderItem O1 = new OrderItem(code,quantity,price);
                int deliveryday = (int)(Math.random()*(7-1+1)+1);
                if(deliveryday == 1)
                {
                    O[1].addOrderItemList(O1);
                }
                else if(deliveryday == 2)
                {
                    O[2].addOrderItemList(O1);
                }
                else if(deliveryday == 3)
                {
                    O[3].addOrderItemList(O1);
                }
                else
                {
                    O[0].addOrderItemList(O1);
                }   
            }
            else
            {
                break;
            }
        }
        for(int i = 0;i<4;i++)
        {
            System.out.println(O[i]);
            O[i]. printOrderItems();
            System.out.println("Subtotal" + O[i].getTotal());
        }
        
    }
    
}
