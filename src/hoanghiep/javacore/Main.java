package hoanghiep.javacore;

import org.apache.logging.log4j.core.util.CronExpression;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

public class Main {

    private static final String EXISTED = "EXISTED";
    private static final String NOT_EXISTED = "NOT_EXISTED";

    public static void main(String[] args) {
	// write your code here
        List<String> existedPhone = Arrays.asList("1", "2");

        List<String> notExistedPhone = Arrays.asList("3", "4");

        Map<String, List<String>> phones = new HashMap<>();
        phones.put(EXISTED, existedPhone);
        phones.put(NOT_EXISTED, notExistedPhone);
        for(Map.Entry<String, List<String>> entry : phones.entrySet()){
            switch(entry.getKey()){
                case EXISTED:
                    System.out.println("EXISTED");
                    System.out.println(entry.getValue());
                    break;
                case NOT_EXISTED:
                    System.out.println("NOT_EXISTED");
                    System.out.println(entry.getValue());
                    break;
                default:
                    break;
            }
        }

        System.out.println("hour: " + LocalDateTime.now().getHour());
        switch (LocalDateTime.now().getHour()){
            case 14:
                System.out.println(LocalDate.now().minusDays(1).atTime(7, 0, 0));
                break;
        }
        String cronString = "0 0 7,12 * * ?";
        try {
            CronExpression cronExpression = new CronExpression(cronString);
//            cronExpression.setTimeZone(TimeZone.getTimeZone(ZoneId.systemDefault()));
//            System.out.println(cronExpression.getExpressionSummary());
            LocalDateTime now = LocalDateTime.now();
            Date nowDate = new Date();
            Date preDateConverted = cronExpression.getPrevFireTime(nowDate);
            LocalDateTime prevLocalDatetime = preDateConverted.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

            System.out.println("localdatetime: " + LocalDateTime.now());
            System.out.println("date converted: " + nowDate);

            System.out.println("prev date converted: " + preDateConverted);
            System.out.println("prev datetime converted: " + prevLocalDatetime);
            System.out.println("prev datetime converted: " + LocalDateTime.of(2021, 8, 23, 12, 0, 0));
        } catch (Exception ex){
            System.out.println("parser exception: " + ex.getMessage());
        }

        Collection<String> list = Collections.emptyList();
        for(String item : list){
            System.out.println("item: " + item);
        }
        list.stream().peek(item -> System.out.println(item)).count();
    }
}
