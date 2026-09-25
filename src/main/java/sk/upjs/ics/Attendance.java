package sk.upjs.ics;

import java.time.LocalDate;
import java.util.List;

public record Attendance(
        LocalDate date,
        String subject,
        List<User> students
) {

}
