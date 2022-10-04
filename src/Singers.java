public class Singers {
    /* Lab 1 - COMP 228
     * 301166925
     * Nandu
     */
    public static void main(String[] args) {

    }

    private int singerID;
    private String singerName;
    private String singerAddress;
    private String dob;
    private int numOfAlbums;

    //constructors
    public Singers() {
        this.singerID = 0;
        this.singerName = "unknown";
        this.singerAddress = "unknown";
        this.dob = "00/00/00";
        this.numOfAlbums = 0;
    }

    public Singers(int singerID) {
        this.singerID = singerID;
    }

    public Singers(int singerID, String singerName) {
        this.singerID = singerID;
        this.singerName = singerName;
    }

    public Singers(int singerID, String singerName, String singerAddress) {
        this.singerID = singerID;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
    }
    public Singers(int singerID, String singerName, String singerAddress, String dob) {
        this.singerID = singerID;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dob = dob;
    }

    public Singers(int singerID, String singerName, String singerAddress, String dob, int numOfAlbums) {
        this.singerID = singerID;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dob = dob;
        this.numOfAlbums = numOfAlbums;
    }

    //setters
    void setSingerID(int id) {
        this.singerID = id;
    }

    void setSingerName(String name) {
        this.singerName = name;
    }

    void setSingerAddress(String address) {
        this.singerAddress = address;
    }

    void setDob(String dob) {
        this.dob = dob;
    }

    void setNumOfAlbums(int numOfAlbums) {
        this.numOfAlbums = numOfAlbums;
    }

    void setAll(int singerID, String singerName, String singerAddress, String dob, int numOfAlbums) {
        this.singerID = singerID;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dob = dob;
        this.numOfAlbums = numOfAlbums;
    }

    //getters
    int getSingerID() {
        return this.singerID;
    }

    String getSingerName() {
        return this.singerName;
    }

    String getSingerAddress() {
        return this.singerAddress;
    }

    String getDob() {
        return this.dob;
    }

    int getNumOfAlbums() {
        return this.numOfAlbums;
    }

    public String toString() {
        return ("Singer ID: " + singerID + "\nSinger name: " + singerName + "\nSinger Address: " + this.singerAddress + "\nDate of birth: " + this.dob + "\nNumber of albums: " + this.numOfAlbums);
    }
}

