public class Program {
    public static void main(String[] args) {
        System.out.println("Students: ");

        Student Alisa = new Student();
        Alisa.displayInfo();

        Student Mariya = new Student("Mariya ","Bondarenko", 28);
        Mariya.displayInfo();

        Student Natasha = new Student ("Natasha", "Fedorenko", 31);
        Natasha.displayInfo();

        Student Rita = new Student("Oleksiy", "Shyshkin",34);
        Rita.displayInfo();

        System.out.println("Teachers: ");

        Teacher t1 = new Teacher("Olena", "Malyshko", 38);
        t1.setName("Olga     ");
        t1.setSurname("Dmytrova ");
        t1.setAge(32);

        Teacher t2 = new Teacher("Alex", "Volynets", 41);
        t2.setName("Oleh   ");
        t2.setSurname("Slusar ");
        t2.setAge(37);

        Teacher t3 = new Teacher("George", "Nikson", 54);
        t3.setName("Kevin   ");
        t3.setSurname("Jackson ");
        t3.setAge(48);

        Teacher t4 = new Teacher();
        t4.setName("Mykola");
        t4.setSurname("Rudenko");
        t4.setAge(29);

        System.out.println("Name:    " + t1.getName() + t2.getName() + t3.getName() + t4.getName());
        System.out.println("Surname: " + t1.getSurname() + t2.getSurname() + t3.getSurname() + t4.getSurname());
        System.out.println("Age:     " + t1.getAge() + "       " + t2.getAge() + "     " + t3.getAge() + "      " + t4.getAge());
    }
}

