package org.example;

import ru.netology.services.CountService;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CountService service = new CountService();
        int count = service.calculate(100_000, 60_000, 150_000);
        System.out.println(count);
    }
}
