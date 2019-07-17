package com.tw.apistackbase.repository;

import com.tw.apistackbase.model.Prosecutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ProsecutorRepository extends JpaRepository<Prosecutor, String> {
}
