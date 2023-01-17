import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Orders
{
    private int personNO;
    private int prepTime;

    public int getPersonNO() {
        return personNO;
    }


    public int getPrepTime() {
        return prepTime;
    }



    public Orders(int personNO, int prepTime) {
        this.personNO = personNO;
        this.prepTime = prepTime;
    }

}

public class JimAndTheOrders {

    public static void main(String[] args) {
        List<List<Integer>> list= new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(8,1)));
        list.add(new ArrayList<>(Arrays.asList(4,2)));
        list.add(new ArrayList<>(Arrays.asList(5,6)));
        list.add(new ArrayList<>(Arrays.asList(3,1)));
        list.add(new ArrayList<>(Arrays.asList(2,9)));

        System.out.println(jimOrders(list));
    }


    public static List<Integer> jimOrders(List<List<Integer>> orders) {

        List<Orders> orderList = new ArrayList<>();
        int n = orders.size();
        for(int i=1;i<=n;i++)
        {
            int index = i-1;
            int preptime = orders.get(index).get(0) + orders.get(index).get(1);
            Orders o1 = new Orders(i,preptime);
            orderList.add(o1);

        }

        //this is lambda expression to sort a list of objects with a property (JAVA 8 feature)
        orderList.sort(Comparator.comparing(Orders::getPrepTime));
        List<Integer> res = new ArrayList<>();
        for(Orders order:orderList)
        {
            res.add(order.getPersonNO());
        }


        return res;
    }



}
