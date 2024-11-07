package org.estudos;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt04 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt05 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("D01V1 = " + d01.format(fmt01));
        System.out.println("D01V2 = " + fmt01.format(d01));
        // Excluído pelo Garbage Collector
        System.out.println("D01V3 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("D02V1 = " + d02.format(fmt01));
        System.out.println("D02V2 = " + d02.format(fmt02));
        System.out.println("D02V3 = " + d02.format(fmt04));

        // Instant não deixa formatar sem o fuso horário, gera exceção
        System.out.println("D03 = " + fmt03.format(d03));
        System.out.println("D03 = " + fmt05.format(d03));

    }
}