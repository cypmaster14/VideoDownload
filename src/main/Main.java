package main;

import java.io.File;
import java.net.URL;

import com.github.axet.vget.VGet;


public class Main {

    public static void main(String[] args) {
        try {
            // ex: http://www.youtube.com/watch?v=Nj6PFaDmp6c
            String url = "https://www.youtube.com/watch?v=uo35R9zQsAI";
            // ex: "/Users/axet/Downloads"
            String path = "";
            File f = new File(path);
            System.out.println(f.getAbsolutePath());
            VGet v = new VGet(new URL(url), new File(path));
            v.download();
           System.out.println("Download Final");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
