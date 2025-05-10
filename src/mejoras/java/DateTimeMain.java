package mejoras.java;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeMain {

    /**
     * java.time   java  8/ 11+   sin cambios hasta Java +17
     *
     * Date
     *
     */
    /**
     * LocalDate :
     *
     * Representa la fehca en un formato mas sensillo
     *  año, mes dia  .... no maneja la zona hora o horas
     *
     * LocalTime
     */
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        System.out.println("hoy " + hoy);

        LocalDate cumpleanos = LocalDate.of(1999,2,23);

        System.out.println("cumpleanos " + cumpleanos);

        LocalTime timeNow = LocalTime.now();
        LocalTime horaInicio = LocalTime.of(11,40);

        System.out.println("time " + timeNow);
        System.out.println("tihoraIniciome " + horaInicio);

        LocalDateTime fullTime = LocalDateTime.now();
        LocalDateTime myFullTime = LocalDateTime.of(1999,2,23,11,40,1);
        System.out.println("fullTime " + fullTime);
        System.out.println("myFullTime " + myFullTime);

        //zonas horarias
        /**
         * ZonaDateTime
         *
         *  los ZonaDateTime extienden del LocalDateTime
         *
         *  Usan el ZoneID
         *
         */

        ZonedDateTime paris = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        ZonedDateTime bogota = ZonedDateTime.now(ZoneId.of("America/Bogota"));
        System.out.println("time now paris " + paris);
        System.out.println("time now bogota " + bogota);


        /**
         * Instant - Tiene la hora UTC
         *
         * Reprenta le tiempo en UTC
         */
        Instant instantNow = Instant.now();
        System.out.println(instantNow);

        /**
         * Period =   java.time.<Period> => Diferencias entre fechas
         *
         *  Period Representa la diferencia entre dos fechas ---- años , dias, meses....
         *
         *
         */
        System.out.println("******************");
        LocalDate nacimiento = LocalDate.of(1998,Month.FEBRUARY,23);
        LocalDate today = LocalDate.now();

        Period diff = Period.between(nacimiento,today);

        System.out.println("Años " + diff.getYears());
        System.out.println("Meses " + diff.getMonths());
        System.out.println("Dias " + diff.getDays());




        /**
         * Duration
         * Representa la diferencia en tiempo
         */
        LocalTime inicio = LocalTime.of(7,0);
        LocalTime fin = LocalTime.now();
        Duration d = Duration.between(inicio,fin);

        System.out.println("horas => " +  d.toHours());
        System.out.println("minutos => " + d.toMinutes());


        // cuantos meses han trascurrido desde la posesion de petro a la fecha
        /**
         * ChronoUnit  ENUM (ENUMERADOR)  es usa e el package java.time.ChronoUnit(fix)
         * Representa las unidades de tiempo ...
         *
         * ChronoUnit => me ayuda a calcular las diferencias entre tiempos es mas flexible que period o duration
         */


        System.out.println("******ChronoUnit*******");
        LocalDate petro = LocalDate.of(2022,Month.AUGUST,7);
        LocalDate fechaActual = LocalDate.now();

        long ages = ChronoUnit.YEARS.between(petro,fechaActual);
        long months = ChronoUnit.MONTHS.between(petro,fechaActual);
        long days = ChronoUnit.DAYS.between(petro,fechaActual);


        System.out.println("años de mandato "+ ages);
        System.out.println("meses mandato " + months);
        System.out.println("dias mandato " + days);



        System.out.println("******ChronoUnit*******");
        LocalDateTime petro2 = LocalDateTime.of(2022,Month.AUGUST,7,12,30);
        LocalDateTime fechaActual2 = LocalDateTime.now();

        ages = ChronoUnit.YEARS.between(petro2,fechaActual2);
        months = ChronoUnit.MONTHS.between(petro2,fechaActual2);
        days = ChronoUnit.DAYS.between(petro2,fechaActual2);
        long horas = ChronoUnit.HOURS.between(petro2,fechaActual2);
        long  minutos = ChronoUnit.MINUTES.between(petro2,fechaActual2);
        long  segundos = ChronoUnit.SECONDS.between(petro2,fechaActual2);


        System.out.println("años de mandato "+ ages);
        System.out.println("meses mandato " + months);
        System.out.println("dias mandato " + days);
        System.out.println("dias horas " + horas);
        System.out.println("dias minutos " + minutos);
        System.out.println("dias segundos " + segundos);

        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨_______¨¨¨¨¨¨¨");
        System.out.println(petro2);
        petro2=petro2.plusHours(24);
        petro2=petro2.plusMonths(90);
        System.out.println(petro2);

        petro2=petro2.minusDays(10);
        System.out.println(petro2);
        /**
         *
         * formatt
         */
        System.out.println("**********FORMAT********");
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter iso_local = DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter iso_local_time = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        DateTimeFormatter formatFull = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm");
        System.out.println(petro2.format(formatDate));
        System.out.println(petro2.format(iso_local));
        System.out.println(petro2.format(iso_local_time));
        System.out.println(petro2.format(formatFull));
        System.out.println(petro2);


        /**
         * Hora zonaID
         */



        ZonedDateTime horaColombia = ZonedDateTime.now(ZoneId.of("America/Bogota"));


        ZonedDateTime japonZona = horaColombia.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));




        System.out.println("hora toko " + japonZona.format(formatFull));
        System.out.println("hora Colombia " + horaColombia.format(formatFull));


        LocalDateTime localMia = LocalDateTime.of(1993,Month.FEBRUARY,23,10,20);

        ZonedDateTime horaNacidoColombia = localMia.atZone(ZoneId.of("America/Bogota"));


        ZonedDateTime japonNacimientoZona = horaNacidoColombia.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));


        System.out.println("hora toko " + horaNacidoColombia.format(formatFull));
        System.out.println("hora Colombia " + japonNacimientoZona.format(formatFull));



    }
}
