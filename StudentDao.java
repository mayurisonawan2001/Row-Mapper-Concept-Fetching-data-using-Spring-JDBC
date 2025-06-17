//Add getStudentById() in StudentDao.java

public Student getStudentById(int studentId) {
    String query = "SELECT * FROM Student WHERE id = ?";
    RowMapper<Student> rowMapper = new StudentRowMapper();
    return jdbcTemplate.queryForObject(query, rowMapper, studentId);
}
