public class Test { // direkt kopyalandı

        public static void main(String[] args) {
		
		Student stu = new Student(1, "Ali", "ali@mail.com", "12345", 3.5);
		
		Staff staff = new Staff(2, "Ayşe", "ayse@mail.com", "SEN", 123456);
		
		Professor pro = new Professor(3, "Mehmet", "mehmet@mail.com", "CMP", 23456, "Dr.", 4);
		
		System.out.println(stu.getInfo());
		stu.study();
		
		System.out.println(staff.getInfo());
		staff.work();
		
		System.out.println(pro.getInfo());
		pro.teach();

	}


    }

