package com.example.SpringBootRestAPIProject.repository;

import com.example.SpringBootRestAPIProject.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
