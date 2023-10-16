package functional;


public class Customer {

    public String id;
    public String location;
    public Gender gender;
    public int age;

    public Customer(String id, String location, Gender gender, int age) {
        this.id = id;
        this.location = location;
        this.gender = gender;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        return builder.append(id).append(" : ").
                append(location).append(" : ").
                append(gender).append(" : ").
                append(age).toString();
    }
}
