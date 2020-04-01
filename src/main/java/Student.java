class Student {
    String name;    // имя
    String surname; // фамилия
    int age;        // возраст

    Student()
    {
        this("Alisa  ", "Pidgorna ",  30);
    }
    Student(String name, String surname, int age)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    void displayInfo(){
        System.out.printf("Name: %s   Surname: %s   \tAge: %d\n", name, surname, age);
    }
}
