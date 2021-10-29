package com.nedeleva.springmvc.repository;

import com.nedeleva.springmvc.model.Patient;
import com.nedeleva.springmvc.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class HospitalDAO {
    private DataSource dataSource;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Patient> allPatients() {
        List<Patient> patients = new ArrayList<Patient>();
        try {
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            String SQL = "SELECT * FROM Patient";
            ResultSet resultSet = statement.executeQuery(SQL);

            while (resultSet.next()) {
                Patient patient = new Patient();
                patient.setId(resultSet.getInt("id"));
                patient.setFullName(resultSet.getString("fullName"));
                patient.setAge(resultSet.getInt("age"));
                patients.add(patient);
            }

        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return patients;
    }

    public List<Doctor> allDoctors() {
        List<Doctor> doctors = new ArrayList<Doctor>();
        try {
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            String SQL = "SELECT * FROM Doctor";
            ResultSet resultSet = statement.executeQuery(SQL);

            while (resultSet.next()) {
                Doctor doctor = new Doctor();
                doctor.setId(resultSet.getInt("id"));
                doctor.setFullName(resultSet.getString("fullName"));
                doctor.setPosition(resultSet.getString("position"));
                doctor.setAge(resultSet.getInt("age"));
                doctors.add(doctor);
            }

        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return doctors;
    }
}
