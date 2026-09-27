import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class Pr12 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        LocalDate today = LocalDate.now();
        System.out.println(today.format(formatter));

        LocalDate birthDate = LocalDate.of(1999, 11, 5);
        System.out.println(birthDate.format(formatter));

        Period age = Period.between(birthDate, today);
        System.out.println(age.getYears());

        LocalDate birthdayThisYear = birthDate.withYear(today.getYear());
        if (birthdayThisYear.isBefore(today)) {
            birthdayThisYear = birthdayThisYear.plusYears(1);
            long daysUntilBirthday = birthdayThisYear.toEpochDay() - today.toEpochDay();
            System.out.println(daysUntilBirthday);}
        else {
            long daysUntilBirthday = birthdayThisYear.toEpochDay() - today.toEpochDay();
            System.out.println(daysUntilBirthday);
        }

    }
}
