package org.estudos;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdfBirthday = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        Date birthday = sdfBirthday.parse(sc.nextLine());
        Client client = new Client(name, email, birthday);

        System.out.println("Enter order Data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());
        System.out.print("How many items to this order? ");
        int itemsQuantity = Integer.parseInt(sc.nextLine());
        Order order = new Order(status, client);

        for (int i = 1; i <= itemsQuantity; i++) {
            System.out.println("Enter #" + i + " item data: ");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = Double.parseDouble(sc.nextLine());
            System.out.print("Quantity: ");
            int quantity = Integer.parseInt(sc.nextLine());

            order.addOrderItem(new OrderItem(new Product(productName, productPrice), quantity));
        }

        System.out.println(order);
    }
}