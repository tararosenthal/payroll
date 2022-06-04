//package com.tararosenthal.payroll;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DatabaseLoader implements CommandLineRunner {
//    private final EmployeeRepository repository;
//
//    @Autowired
//    public DatabaseLoader(EmployeeRepository repository) {
//        this.repository = repository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        this.repository.save(new Employee("Gandalf", "the Grey", "wizard"));
//        this.repository.save(new Employee("Meriadoc", "Brandybuck", "pony rider"));
//        this.repository.save(new Employee("Peregrin", "Took", "pipe smoker"));
//    }
//}
