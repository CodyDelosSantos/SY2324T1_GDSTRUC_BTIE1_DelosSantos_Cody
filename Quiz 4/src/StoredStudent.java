public class StoredStudent {
    public String key;
    public Student value;

    public StoredStudent(String key, Student value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "StoredStudent{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}
