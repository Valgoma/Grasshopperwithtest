package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void readfFile(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("INPUT"));
        int n = sc.nextInt();
        int xb = sc.nextInt();
        int yb = sc.nextInt();
        int l = sc.nextInt();
        int[][] coords = new int[n][2];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            coords[i][0] = x;
            coords[i][1] = y;
        }
        if (countAll(coords, xb, yb, l) == -1) {
            Files.writeString(Path.of("OUTPUT"), "YES");
        } else {
            int i = countAll(coords, xb, yb, l);
            String s = String.valueOf(i + 1);
            Files.writeString(Path.of("OUTPUT"), s);
        }
    }

    static double countDistance(int x, int y, int x1, int y1) {
        double d = Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));
        return d;
    }

    static int countAll(int[][] coords, int x, int y, int l) throws IOException {
        for (int i = 0; i < coords.length; i++) {
            int x1 = coords[i][0];
            int y1 = coords[i][1];
            double d = countDistance(x1, y1, x, y);
            if (d <= l) {
                return i;
            }
        }
            return -1;
        }
        }







