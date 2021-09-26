package hoanghiep.javacore.java8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> numberConverter = (str) -> Integer.parseInt(str);
        System.out.println(numberConverter.apply("1"));

        Function<LocalDate, String> dateConverter = localDate -> localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(dateConverter.apply(LocalDate.now()));
    }
}
