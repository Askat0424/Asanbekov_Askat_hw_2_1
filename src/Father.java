public class Father extends GrandFather{
    private String name;
    private String profession;
    private House house;
    private HabitEnum habitEnum;

    public Father(String name, String profession,  House house, HabitEnum habitEnum) {
        super(name, profession);
        this.name = name;
        this.profession = profession;
        this.house = house;
        this.habitEnum = habitEnum;
    }

    @Override
    public String getName() {
        return name;
    }

    public House getHouse() {
        return house;
    }

    public HabitEnum getHabitEnum() {
        return habitEnum;
    }

    @Override
    public String getProfession() {
        return profession;
    }
    public void makeVoice(){
        System.out.println(" Ударить");
    }
    public void  makeVoice( final String voice){
        System.out.println(voice);

    }

    public String getInfo() {
        return " Name : " + getName() +
                " Profession : " + getProfession() +
                " \nHouse Address : " + house.getAddress() +
                " \nHouse  How Many Rooms In The House : " + house.getHowManyRoomsInTheHouse() +
                " \nHouse How Many People Are In The House : " + house.getHowManyPeopleAreInTheHouse() +
                " \nHabitEnum : " + habitEnum;
    }



    }
