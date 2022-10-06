package Task3;

import Task2.Room;

import java.util.ArrayList;

public class Main
{
    static ArrayList<Customer> customers = new ArrayList<>();

    public static void main (String[] args) {
        Customer customer1 = new Customer("Elsa", "Durmishaj", "elsdu1");
        Customer customer2 = new Customer("Jeanette", "Gættsche", "jegæ2");
        Customer customer3 = new Customer("Katja", "Jensen", "kat3");
        Customer customer4 = new Customer("Ole", "Jensen", "ol4");
        Customer customer5 = new Customer("Signe", "Larsen", "sig5");
        Customer customer6 = new Customer("Sofie", "Jensen", "sof6");

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);

        printCustomers(customers);
    }

    public static void printCustomers(ArrayList<Customer> customers)
    {
        for (Customer cust: customers)
        {
            System.out.println(cust);
        }
    }
}