package pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strings {
    public static void main(String[] args) {
        String kelime="ar ka,das türkiye nmkln hhth";

      String [] yeni=kelime.split("  ", 2);
        for (String e: yeni
             ) {
            System.out.println(e);

        }

    }
}
