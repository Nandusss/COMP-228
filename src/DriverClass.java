import java.util.Scanner;

class DriverClass {
    public static void main(String[] args) {
        Singers singer1 = new Singers();

        displaySinger(singer1);

        System.out.println();
        updateSinger(singer1);

        System.out.println();
        displaySinger(singer1);

    }

    //display singer object values
    public static void displaySinger(Singers singer) {
        System.out.println(singer.toString());
    }

    //set singer object value
    public static void updateSinger(Singers singer) {
        int singerID;
        String singerName;
        String singerAddress;
        String dob;
        int numOfAlbums;

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        //getting user inputs for each variables
        System.out.print("Enter the singer id: ");
        singerID = scanner.nextInt();

        System.out.print("Enter the singer's name: ");
        singerName = scanner.next();

        System.out.print("Enter singer address: ");
        singerAddress = scanner.next();

        System.out.printf("Enter the date of birth of %s: ", singerName);
        dob = scanner.next();

        System.out.print("Enter the number of albums: ");
        numOfAlbums = scanner.nextInt();

        //set all the values to the object
        singer.setAll(singerID, singerName, singerAddress, dob, numOfAlbums);
    }
}

