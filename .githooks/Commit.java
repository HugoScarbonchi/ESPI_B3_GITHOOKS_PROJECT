import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Commit {
    public static void main(String[] args) throws IOException{
        String data = "";

        data = new String(Files.readAllBytes(Paths.get(args[0])));
        data = data.trim();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        currentDate = dtf.format(now);

        System.out.println(currentDate);

        System.exit(1);
    }
}