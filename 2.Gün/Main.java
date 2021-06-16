
public class Main {

    public static void main(String[] args) {

        Category category1 = new Category(1, "Kategori: ","Tümü");
        Category category2 = new Category(2, "Kategori: ", "Programlama");

        Category[] categories = {category1, category2};
        for(Category category : categories) {
            System.out.println(category.categoryName + " + " + category.categoryKind);
        }

        Cours course1 = new Cours(1, "Java & React kursu");
        Cours course2 = new Cours(2, "C# & Angular kursu");
        Cours course3 = new Cours(3, "Programlamaya giriş için temel kurs");

        Cours[] courses = {course1, course2, course3};
        for(Cours cours : courses){
            System.out.println("Kurs bilgisi: " + cours.coursId + " + " + cours.coursName);
        }

        Student student = new Student();
        student.addToCourse(Cours list);

        Student student1 = new Student();
        student1.finisesCourse(Cours list);
    }
}
