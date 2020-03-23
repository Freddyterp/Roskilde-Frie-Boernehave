public class Teacher {
    //attributes
    private String firstName;
    private String lastName;
    private String adresse;
    int age;
    private int id;


    public Teacher(String firstName, String lastName, String adresse, int age, int id )
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adresse = adresse;
        this.age = age;
        this.id = id;
    }

    public String getFristName() {
        return fristName;
    }

    public void setFirstName(String firstName) {
        this.fristName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
