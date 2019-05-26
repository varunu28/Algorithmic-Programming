import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        while (n-- > 0) {
            list.add(br.readLine());
        }

        boolean seatFound = false;

        for (int i = 0; i < list.size(); i++) {
            String seat = list.get(i);
            String row1 = seat.split("\\|")[0];
            String row2 = seat.split("\\|")[1];

            if (row1.equals("OO")) {
                seatFound = true;
                String newSeat = new StringBuilder().append("++").append("|").append(row2).toString();
                list.set(i, newSeat);
                break;
            }

            if (row2.equals("OO")) {
                seatFound = true;
                String newSeat = new StringBuilder(row1).append("|").append("++").toString();
                list.set(i, newSeat);
                break;
            }
        }

        if (seatFound) {
            System.out.println("YES");
            for (String seat : list) {
                System.out.println(seat);
            }
        }
        else {
            System.out.println("NO");
        }
    }
}

