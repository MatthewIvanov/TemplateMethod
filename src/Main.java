import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("Input user name: ");
        String userName = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();


        System.out.print("Input message: ");
        String message = reader.readLine();

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - VKontakte\n" +
                "2 - Odnoklassniki\n" +
                "3 - Telegram");
        int choice = Integer.parseInt(reader.readLine());


        if (choice == 1) {
            network = new VKontakte(userName, password);
        } else if (choice == 2) {
            network = new Odnoklassniki(userName, password);
        } else if (choice == 3){
            network = new Telegram(userName,password);
        }
        network.post(message);
    }
}