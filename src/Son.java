public class Son extends Father{
    private final String name;
    private final String profession;


    public Son(String name, String profession, House house, HabitEnum habitEnum  ) {
        super(name, profession, house, habitEnum);
        this.name = name;
        this.profession = profession;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getProfession() {
        return profession;
    }


    @Override
    public String getInfo() {
        return super.getInfo()+
                " \nName : " + name +
                " \nProfession : " + profession  ;

    }
}
