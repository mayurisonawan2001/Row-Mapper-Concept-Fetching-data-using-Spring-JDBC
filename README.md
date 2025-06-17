Use RowMapper to read data from the Student table and convert each row into a Student object.

🔁 Table Assumed
sql
Copy code
CREATE TABLE Student (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    city VARCHAR(100)
);
🧠 What is RowMapper?
RowMapper<T> is a Spring interface.

It maps each row of a ResultSet to your custom object (Student in our case).

It’s used with JdbcTemplate.query() method.

✅ Step-by-Step Implementation
1️⃣ Create StudentRowMapper.java
2️⃣ Add getStudentById() in StudentDao.java
3️⃣ (Optional) Fetch All Students
public List<Student> getAllStudents() {
    String query = "SELECT * FROM Student";
    RowMapper<Student> rowMapper = new StudentRowMapper();
    return jdbcTemplate.query(query, rowMapper);
} 
4️⃣ Call from App.java
StudentRowMapper.java -	Maps ResultSet to Student
StudentDao.java -	Contains query methods
App.java -	Calls the methods
