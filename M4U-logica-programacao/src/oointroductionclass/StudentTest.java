package oointroductionclass;

public class StudentTest {

    public static void main(String[] args) {

        Student student = new Student();
        Student student2 = new Student();

        student.name = "Marcos";
        student.age = 32;
        student.sex = 'M';

        student2.name = "Anne";
        student2.age = 31;
        student2.sex = 'F';

        System.out.println("Nome do estudante: " + student.name);
        System.out.println("Idade do estudante: " + student.age);
        System.out.println("Sexo do estudante: " + student.sex);

        System.out.println("==================================");

        System.out.println("Nome do estudante: " + student2.name);
        System.out.println("Idade do estudante: " + student2.age);
        System.out.println("Sexo do estudante: " + student2.sex);

    }
}
