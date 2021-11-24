package chapterOne.access_modifiers;

import java.util.Date;
import java.sql.*;
import java.util.Random;


public class ImportExample {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}

class Conficts {
    Date date;
    java.sql.Date sqlDate;
}
