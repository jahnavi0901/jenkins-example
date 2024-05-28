package com.example.demo.ifaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Tasks;

@Repository
public interface TasksRepository  extends JpaRepository<Tasks,Integer>{

}
