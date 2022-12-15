package numberClass;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Masukan Nama : ");
        String nama = scanner.nextLine();


        System.out.println("Masukan Tgl Lahir ");
        String tglLahir = scanner.nextLine();
        Date tglLahirDate = formater.parse(tglLahir);
        System.out.println("tgl Lahir: "+ tglLahirDate);

        Date currentDate = new Date();
        String tglSekarang = formater.format(currentDate);
        System.out.println("tgl Sekarang Date "+ currentDate);
        System.out.println("tgl Sekarang "+ tglSekarang);

        // hitung umur
        Calendar calendar = Calendar.getInstance();

        // tgl date => calender
        calendar.setTime(tglLahirDate);
        System.out.println("calender tgl lahir "+ calendar.getTime());
        Calendar currentCalendar = Calendar.getInstance();
        currentCalendar.setTime(new Date());

        // check calender sekarang
        System.out.println("tgl Sekarang "+ currentCalendar.getTime());


        // ambil selesih
        Long time = (currentCalendar.getTimeInMillis() - calendar.getTimeInMillis())/1000;
        System.out.println("bentuk Second "+ time);
        // second => hour
        Long hour = time/3600;
        System.out.println("bentuk Hour "+ hour);

        // hour => day
        Long day = hour/24;
        System.out.println("bentuk Day "+ day);
//
        // day => week
        Long week = day/7;
        System.out.println("bentuk Week "+ week);
//
        // day => month
        Long month = day/30;
        System.out.println("bentuk Month " + month);
//
        // day => year
        Long year = day/365;
        System.out.println("bentuk Year "+ year);

    }
}

