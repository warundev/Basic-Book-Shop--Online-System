import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        Item it5 =new Item("Type-C Cable",20,1250.75);
        Item it1 =new Item("Nokia Phone",1,6750.50);
        Item it2 =new Item("Power Bank",5,10000.00);
        Item it3 =new Item("Type-C Cable",20,1250.75);
        Item it4 =new Item("Power Bank",5,10000.00);
        Item it6 =new Item("Type-C Cable",20,1250.75);

        ArrayList <Item> ar  =new  ArrayList<>();
        //remove Array
        ArrayList <Item> removeArray = new ArrayList<>();

        ar.add(it1);
        ar.add(it2);
        ar.add(it3);
        ar.add(it4);
        ar.add(it6);
        ar.add(it5);

        //remove using while
        boolean flag = true;

        while (flag) {
            flag = ar.remove(it2);
        }

        //print List
        for(Item x : ar)
        {
            System.out.println(x);
        }

        System.out.println("--------------------------------------------------------");

        //remove using another Arraylist
        removeArray.add(it6);
        removeArray.add(it4);


        ar.removeAll(removeArray);

        //print List
        for(Item x : ar)
        {
            System.out.println(x);
        }

    }
}

class Item
{
    private String name;
    private int qty;
    private double price;


    Item(String name,int qty,double price)
    {
        this.name=name;
        this.qty=qty;
        this.price=price;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }

    public void setQty(int qty)
    {
        this.qty=qty;
    }

    public int getQty()
    {
        return qty;
    }

    public void setPrice(double price)
    {
        this.price=price;
    }

    public double getPrice()
    {
        return price;
    }

    @Override
    public String toString()
    {
        return "[ Name : "+name+" , Qty : "+qty+" , Price : "+price+" ]";
    }


    @Override
    public boolean equals(Object ob)
    {
        boolean flag = ob instanceof Item;

        if (flag) {
            Item it = (Item)ob;
            if ((it.name.equals(this.name)) && (it.qty == this.qty) && (it.price == this.price)) {
                return true;
            }
        }
        return false;
    }
}