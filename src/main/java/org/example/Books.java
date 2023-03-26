package org.example;

import java.util.Scanner;

public class Books {
    public static String shape;

    public static void setShape(String shape) {
        Books.shape = shape;
        System.out.print("\n" +
                "                .-~~~~~~~~~-._       _.-~~~~~~~~~-.\n" +
                "            __.'              ~.   .~              `.__\n" +
                "          .'//                  \\./                  \\\\`.\n" +
                "        .'//                     |                     \\\\`.\n" +
                "      .'// .-~\"\"\"\"\"\"\"~~~~-._     |     _,-~~~~\"\"\"\"\"\"\"~-. \\\\`.     Unknown\n" +
                "    .'//.-\"                 `-.  |  .-'                 \"-.\\\\`.\n" +
                "  .'//______.============-..   \\ | /   ..-============.______\\\\`.\n" +
                ".'______________________________\\|/______________________________`.");
    }
}
