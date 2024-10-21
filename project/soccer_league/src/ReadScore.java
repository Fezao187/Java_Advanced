import soccer.play.Team;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadScore {
    private BufferedReader getReader(String fileName) {
        BufferedReader br = null;
        try{
            File file = new File(fileName);
            br = new BufferedReader(new FileReader(file));
        }catch (FileNotFoundException e) {
            System.out.println("File not found!");
            System.exit(0);
        }
        return br;
    }

    private Team readScore(BufferedReader br) {
       Team team1 = new Team();
       Team team2 = new Team();
       return team2;
    }
}
