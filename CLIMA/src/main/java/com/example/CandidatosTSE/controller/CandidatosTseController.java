package com.example.CandidatosTSE.controller;

import com.example.CandidatosTSE.service.CandidatosTseService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CandidatosTseController {
    private final CandidatosTseService candidatosTseService;

    public CandidatosTseController(CandidatosTseService candidatosTseService) {
        this.candidatosTseService = candidatosTseService;
    }

@GetMapping("/")
public String index (
    @RequestParam(required=false) String genero,
    @RequestParam(required=false) String escolaridade,
    @RequestParam(required=false) String idadeMin,
    @RequestParam(required=false) String idadeMax,
    Model model){
        return "";
    }
}