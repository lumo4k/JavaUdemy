package org.estudos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class DateAntigo {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf01 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf02 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf03 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf03.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = new Date(0L);
        Date x4 = new Date(1000L * 60L * 60L * 5L);

        Date y1 = sdf01.parse("25/06/2018");
        Date y2 = sdf02.parse("25/06/2018 15:42:07");
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println("X1 = " + x1);
        System.out.println("X2 = " + x2);
        System.out.println("X3 = " + x3);
        System.out.println("X4 = " + x4);
        System.out.println("Y1 = " + y1);
        System.out.println("Y2 = " + y1);
        System.out.println("Y3 = " + y1);
        System.out.println("--------------------------");
        System.out.println("X1 = " + sdf02.format(x1));
        System.out.println("X2 = " + sdf02.format(x2));
        System.out.println("X3 = " + sdf02.format(x3));
        System.out.println("X4 = " + sdf02.format(x4));
        System.out.println("Y1 = " + sdf01.format(y1));
        System.out.println("Y2 = " + sdf02.format(y2));
        System.out.println("Y3 = " + sdf02.format(y3));
        System.out.println("--------------------------");
        System.out.println("X1 = " + sdf03.format(x1));
        System.out.println("X2 = " + sdf03.format(x2));
        System.out.println("X3 = " + sdf03.format(x3));
        System.out.println("X4 = " + sdf03.format(x4));
        System.out.println("Y1 = " + sdf03.format(y1));
        System.out.println("Y2 = " + sdf03.format(y2));
        System.out.println("Y3 = " + sdf03.format(y3));

    }

}
