package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Product> productList=new ArrayList<>();
        productList.add(new Product(1, "Хлеб",40));
        productList.add(new Product(2, "Батон",42));
        productList.add(new Product(3, "Конфеты шоколадные",400));
        productList.add(new Product(4, "Колбаса вареная",300));
        productList.add(new Product(5, "Сахар белый песок",350));
        productList.add(new Product(6, "Зубная паста",100));
        productList.add(new Product(7, "Помидоры сливки",70));
        productList.add(new Product(8, "Помидоры Тепличные",95));
        productList.add(new Product(9, "Шоколад",150));
        productList.add(new Product(10, "Рыба",350));

        System.out.println("Ввывод больше 200 рублей");
        List<Product> newList=productList.stream().
                filter(product -> product.getPrice()>200).
                collect(Collectors.toList());
        newList.stream().forEach(product -> System.out.println(product));

        System.out.println("Ввывод равно 100 рублей");

        List<Product> newList100 = productList.stream()
                .filter(product -> product.getPrice() == 100)
                .collect(Collectors.toList());

        newList100.forEach(product -> System.out.println(product));

        System.out.println("Ввывод где буква 'С'");

        List<Product> newListC = productList.stream()
                .filter(product -> product.getName().indexOf('C') >= 0)
                .collect(Collectors.toList());
        newListC.stream().forEach(product -> System.out.println(product));

    }
}
