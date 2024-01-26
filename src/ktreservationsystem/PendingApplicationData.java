package ktreservationsystem;

public class PendingApplicationData {
    private String firstname;
    private String middlename;
    private String lastname;
    private int age;
    private String sex;
    private String occupation;
    private String address;
    private String nationality;
    private String destination;
    private String departureDate;
    private String seatClass;

    public PendingApplicationData(String firstname, String middlename, String lastname, int age, String sex, String occupation, String address, String nationality,
                                  String destination, String departureDate, String seatClass) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex;
        this.occupation = occupation;
        this.address = address;
        this.nationality = nationality;
        this.destination = destination;
        this.departureDate = departureDate;
        this.seatClass = seatClass;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getAddress() {
        return address;
    }

    public String getNationality() {
        return nationality;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public Object[] toRowData() {
        return new Object[]{firstname, middlename, lastname, age, sex, occupation, address,
                nationality, destination, departureDate, seatClass};
    }
}


