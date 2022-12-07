public class House {
    private String address;
    private String howManyRoomsInTheHouse;
    private String howManyPeopleAreInTheHouse;


    public House(String address, String howManyRoomsInTheHouse, String howManyPeopleAreInTheHouse) {
        this.address = address;
        this.howManyRoomsInTheHouse = howManyRoomsInTheHouse;
        this.howManyPeopleAreInTheHouse = howManyPeopleAreInTheHouse;


    }
    public String getAddress() {
        return address;
    }

    public String getHowManyRoomsInTheHouse() {
        return howManyRoomsInTheHouse;
    }

    public String getHowManyPeopleAreInTheHouse() {
        return howManyPeopleAreInTheHouse;
    }


}
