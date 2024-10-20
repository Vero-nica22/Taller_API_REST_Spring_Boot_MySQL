package com.example.api_gestion_horas_extras.Controller;

import com.example.api_gestion_horas_extras.Model.HoraExtra;
import com.example.api_gestion_horas_extras.Service.HoraExtraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/horas-extras")
public class HoraExtraController {
    @Autowired
    private HoraExtraService service;
    @GetMapping
    public List<HoraExtra> listarHorasExtras() {
        return service.obtenerHorasExtras();
    }
    @PostMapping
    public HoraExtra registrarHoraExtra(@RequestBody HoraExtra horaExtra) {
        return service.registrarHoraExtra(horaExtra);
    }
}
