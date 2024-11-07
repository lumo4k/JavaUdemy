package org.estudos;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertDataGlobal {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T15:03:25");
        Instant d03 = Instant.parse("2022-07-20T01:30:25Z");

        System.out.println("D01 = " + d01);
        System.out.println("D02 = " + d02);
        System.out.println("D03 = " + d03);

        System.out.println("Conversoes a partir daqui:");

        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

        System.out.println("R1 = " + r1);
        System.out.println("R2 = " + r2);
        System.out.println("R3 = " + r3);
        System.out.println("R4 = " + r4);

        System.out.println("D01 Dia = " + d01.getDayOfMonth());
        System.out.println("D01 Mês = " + d01.getMonthValue());
        System.out.println("D01 Ano = " + d01.getYear());
        System.out.println("D02 Hora = " + d02.getHour());
        System.out.println("D02 Minutos = " + d02.getMinute());

    }
}
