package com.ServerSep3.Server.Model;

import java.util.Date;

public class DateModel {
    public static void main(String[] args) {
        int day=10;
        int month=5-1;
        int year=2003-1900;
        Date date= new Date(year,month,day);
        System.out.println(date.toString());
        System.out.println(date.getDay()+7);
        System.out.println(date.getMonth()+1);
        System.out.println(date.getYear()+1900);
    }
}
