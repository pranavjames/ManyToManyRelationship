package com.manytomany.main;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface POCRepository extends JpaRepository<POC, Long> {
}
