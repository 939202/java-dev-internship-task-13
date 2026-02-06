package com.jdbc;

public class Main {

    public static void main(String[] args) {

        DAO dao = new DAO();

        // INSERT
        dao.insertStudent("Ravi", "ravi@gmail.com");
        dao.insertStudent("Anu", "anu@gmail.com");

        // READ
        dao.getAllStudents();

        // UPDATE
        dao.updateStudent(1, "Ravi Kumar");

        // DELETE
        dao.deleteStudent(2);

        // READ AGAIN
        dao.getAllStudents();
    }
}
