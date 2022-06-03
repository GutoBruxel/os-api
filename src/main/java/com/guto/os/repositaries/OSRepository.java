package com.guto.os.repositaries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guto.os.domain.OS;

@Repository
public interface OSRepository extends JpaRepository<OS, Integer>{

}
