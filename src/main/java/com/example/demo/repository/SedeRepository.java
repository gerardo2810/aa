package com.example.demo.repository;

import com.example.demo.entity.Sede;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SedeRepository extends  JpaRepository<Sede,Integer>{

}
