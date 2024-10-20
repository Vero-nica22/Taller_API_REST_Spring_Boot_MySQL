package com.example.api_gestion_horas_extras.Repository;

import com.example.api_gestion_horas_extras.Model.HoraExtra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoraExtraRepository extends JpaRepository<HoraExtra, Long> {
}


