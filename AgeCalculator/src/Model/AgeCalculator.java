package Model;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    private final LocalDate birthday;

    public AgeCalculator(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getResult() {
        Period ageDiff = Period.between(birthday, LocalDate.now());

        String year = String.valueOf(ageDiff.getYears());

        String month = String.valueOf(ageDiff.getMonths());

        String day = String.valueOf(ageDiff.getDays());

        return "You are " + year + " years " + month + " months " + day + " days old";
    }


}
