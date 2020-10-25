public final class PersonInfo implements Comparable
{
    private final String Name;
    private final String Surname;
    private final int Age;
    private final String City;

    public String GetName()
    {
        return Name;
    }

    public String GetSurname()
    {
        return Surname;
    }

    public int GetAge()
    {
        return Age;
    }

    public String GetCity()
    {
        return City;
    }

    public PersonInfo(String _name,String _surname,int _age,String _city)
    {
        Name=_name;
        Surname=_surname;
        Age=_age;
        City=_city;
    }

    public PersonInfo Clone()
    {
        return new PersonInfo(Name,Surname,Age,City);
    }

    @Override
    public String toString() {
        return "PersonInfo {" +
                "Name = '" + Name + '\'' +
                ", Surname = '" + Surname + '\'' +
                ", Age = " + Age +
                ", City = '" + City + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonInfo that = (PersonInfo) o;
        return Age == that.Age &&
                Name.equals(that.Name) &&
                Surname.equals(that.Surname) &&
                City.equals(that.City);
    }

    @Override
    public int hashCode() {
        int result=22;
        result*=2+Name.hashCode();
        result*=3+Surname.hashCode();
        result*=Age;
        result*=4+City.hashCode();
        return result;
    }

    @Override
    public int compareTo(Object o)
    {
        try
        {
            PersonInfo other=(PersonInfo) o;
            if(this.Age<other.Age)
                return -1;
            else if(this.Age==other.Age)
                return 0;
            return 1;
        }
        catch (Exception e)
        {
            System.out.println("Compared argument is not a PersonInfo instance");
            throw e;
        }
    }
}