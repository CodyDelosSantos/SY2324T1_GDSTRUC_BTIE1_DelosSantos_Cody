public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "AJ Astilla");
        Student student2 = new Student(2, "Ayran Gauna");
        Student student3 = new Student(3, "Neal Padama");
        Student student4 = new Student(4, "Gigette Tria");
        Student student5 = new Student(5, "Patrick Monzon");

        SimpleHashtable hashtable = new SimpleHashtable(10);
        hashtable.put(student1.getName(), student1);
        hashtable.put(student2.getName(), student2);
        hashtable.put(student3.getName(), student3);
        hashtable.put(student4.getName(), student4);
        hashtable.put(student5.getName(), student5);

        hashtable.remove("AJ Astilla");

        hashtable.printHashtable();
        System.out.println("\ngetting element from hashtable with key: AJ Astilla");
        System.out.println(hashtable.get("AJ Astilla"));
    }
}