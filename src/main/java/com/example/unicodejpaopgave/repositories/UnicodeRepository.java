package com.example.unicodejpaopgave.repositories;

import com.example.unicodejpaopgave.model.Unicode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnicodeRepository extends JpaRepository<Unicode, Integer> {

}
