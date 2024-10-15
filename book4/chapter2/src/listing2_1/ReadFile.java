package listing2_1;

import java.io.*;
import java.text.NumberFormat;

//Reading from a Text File
public class ReadFile {
    public static void main(String[] args) {
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        BufferedReader in = getReader("C:\\BootCamp\\9_Java_Advanced\\My_Java\\book4\\chapter2\\src\\listing2_2\\movies2.txt");
        Movie movie = readMovie(in);
        while (movie != null) {
            String msg = Integer.toString(movie.year);
            msg
                    += ": " + movie.title;
            msg
                    += " (" + cf.format(movie.price) + ")";
            System.out.println(msg);
            movie = readMovie(in);
        }
    }

    private static BufferedReader getReader(String name) {
        BufferedReader in = null;
        try {
            File file = new File(name);
            in = new BufferedReader(
                    new FileReader(file));
        } catch (FileNotFoundException e) {
            System.out.println(
                    "The file doesn't exist.");
            System.exit(0);
        }
        return in;
    }

    private static Movie readMovie(BufferedReader in) {
        String title;
        int year;
        double price;
        String line = "";
        String[] data;
        try {
            line = in.readLine();
        } catch (IOException e) {
            System.out.println("I/O Error");
            System.exit(0);
        }
        if (line == null)
            return null;
        else {
            data = line.split("\t");
            title = data[0];
            year = Integer.parseInt(data[1]);
            price = Double.parseDouble(data[2]);
            return new Movie(title, year, price);
        }
    }

    private static class Movie {
        public String title;
        public int year;
        public double price;

        public Movie(String title, int year, double price) {
            this.title = title;
            this.year = year;
            this.price = price;
        }
    }
}
