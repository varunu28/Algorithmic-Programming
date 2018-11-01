import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandling {

    public List<String> readFile(String fileName) throws IOException {
        List<String> lines = new ArrayList<>();
        File file = new File(fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }

        br.close();

        return lines;
    }

    public void writeToFile(List<String> data, String fileName) throws IOException {
        File file = new File(fileName);
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        for (String line : data) {
            bw.write(line + "\n");
        }

        bw.close();
    }
}

