public class Test {// Test File is Copied



    public static void main(String[] args) {
        // 1. Testing Faculty Objects and Aggregation Relationship
        // Demonstrating how one Faculty object references another as a supervisor 
    	Faculty coordinator = new Faculty("Dr. Derya Bodur", "Instructor");
    	Faculty member = new Faculty("Merve Ariturk", "Lab Assistant");
        member.setSupervisor(coordinator);

        System.out.println("--- Faculty Aggregation Test ---");
        System.out.println("Coordinator: " + member.getSupervisorName()); // Expected: Dr. Bodur
        System.out.println("Lab Assistant: " + member.getName());        
        System.out.println();

        // 2. Testing Student Objects and Encapsulation
        // Verifying calculated logic for BMI and Honor Student status 
        Student s1 = new Student("Alice", 20, 65.0, 1.70, 3.8, "SEN");
        Student s2 = new Student("Bob", 22, 95.0, 1.85, 3.2, "SEN");

        System.out.println("--- Student Logic & Encapsulation Test ---");
        System.out.println(s1.getName() + " BMI Status: " + s1.getStatus()); 
        System.out.println(s1.getName() + " Honor Student: " + s1.isHonorStudent()); 
        System.out.println(s2.getName() + " BMI Status: " + s2.getStatus()); 
        System.out.println(s2.getName() + " Honor Student: " + s2.isHonorStudent()); 
        System.out.println();

        // 3. Testing Course Objects and Composition
        // Represents an ownership relationship where the Course 'has' students 
        Course javaCourse = new Course("Object-Oriented Programming", member);
        javaCourse.addStudent(s1);
        javaCourse.addStudent(s2);

        // 4. Testing Department and Association
        // Describes a general binary relationship where a Department offers courses 
        Department senDept = new Department("Software Engineering", "BAU");
        senDept.addCourse(javaCourse);

        // 5. Testing StringBuilder for Efficient Report Generation
        // Utilizing StringBuilder as it is more flexible and efficient than String 
        System.out.println("--- Final Course Report (Using StringBuilder) ---");
        System.out.println(javaCourse.getCourseReport());
    }
}









