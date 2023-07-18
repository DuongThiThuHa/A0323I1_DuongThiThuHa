package ss9_List.baitap.LinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        class Student{
            private int id;
            private String name;

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        MyLinkedlist<Student> myLinkedlist = new MyLinkedlist<>();
        Student student1 = new Student(1,"T");
        Student student2 = new Student(2,"H");
        Student student3 = new Student(3,"D");
        Student student4 = new Student(4,"H");
        Student student5 = new Student(5,"U");

        myLinkedlist.addFirst(student1);
        myLinkedlist.addFirst(student2);
        myLinkedlist.addLast(student3);
        myLinkedlist.add(1,student4);

        myLinkedlist.remove(2);
        myLinkedlist.remove(student1);

        for (int i = 0; i < myLinkedlist.size(); i++) {
            Student student = (Student) myLinkedlist.get(i);
            System.out.println(student.getName());
        }

        MyLinkedlist<Student> cloneLinkedList = myLinkedlist.clone();
        for (int i = 0; i < cloneLinkedList.size(); i++) {
            Student student = (Student) cloneLinkedList.get(i);
            System.out.println(student.getName());
        }

        System.out.println(myLinkedlist.constrains(student5));

        System.out.println(myLinkedlist.indexOf(student3));
    }
}
