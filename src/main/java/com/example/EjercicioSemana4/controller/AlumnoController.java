/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.EjercicioSemana4.controller;

import com.example.EjercicioSemana4.model.Alumno;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author casti
 */
@Controller
public class AlumnoController {

    @GetMapping("/registro")
    public String mostrarFormulario(Model model) {
        model.addAttribute("alumno", new Alumno());
        return "registro";
    }

    @PostMapping("/registrar")
    public String registrarAlumno(@ModelAttribute Alumno alumno, Model model) {
        model.addAttribute("alumno", alumno);
        return "exito";
    }
}
