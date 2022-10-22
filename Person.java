public class Person {
    protected String name;
    protected String YearOfBirth;
    public Person(String name, String yearOfBirth) {
        this.name = name;
        YearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearOfBirth() {
        return YearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        YearOfBirth = yearOfBirth;
    }
    public String toString()
    {
        String fullInfo= name+" "+YearOfBirth;
        return fullInfo;
    }

}
