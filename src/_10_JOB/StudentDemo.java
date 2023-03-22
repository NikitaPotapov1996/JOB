package _10_JOB;

public class StudentDemo {
    public static void main(String[] args) {
/*        Student student1 = new Student("Nikita", "Potapov", "3", 4.5);
        Student student2 = new Student("Maria", "Lebedeva", "4", 5.0);
        Aspirant aspirant1 = new Aspirant("Kaban", "Kabanich", "6", 5.0,
                "doctor");
        Aspirant aspirant2 = new Aspirant("Kaban2", "Kabanich2", "5", 4.0,
                "electric");
        Aspirant aspirant3 = new Aspirant();*/

        Student[] students = new Student[4];
        students[0] = new Student("Nikita", "Potapov", "3", 4.5);
        students[1] = new Student("Maria", "Lebedeva", "4", 5.0);
        students[2] = new Aspirant("Kaban", "Kabanich", "6", 5.0,
                "doctor");
        students[3] = new Aspirant("Kaban2", "Kabanich2", "5", 4.0,
                "electric");

        for (int i = 0; i < 4; i++) {
            students[i].show();
            System.out.println();;
        }

        System.out.println(students[0].getScholarship());
        System.out.println(students[1].getScholarship());
        System.out.println(students[2].getScholarship());
        System.out.println(students[3].getScholarship());
/*        System.out.println(aspirant3.getScholarship());*/
    }
}
