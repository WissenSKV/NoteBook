package com.example.notebook2.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.notebook2.models.Student;

import java.util.List;

@Dao
public interface StudentDao {
    @Query("SELECT*FROM students")
    List<Student> getAll();

    @Insert
    void insert(Student student);

    @Delete
    void delete(Student student);

    @Update
    void update(Student student);

    @Query("SELECT * FROM students ORDER BY name_sur ASC")
    List<Student> sortAll();





}
