/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vito.appv.service;

import com.vito.appv.dto.dtoPersona;
import com.vito.appv.entity.Persona;
import com.vito.appv.repository.RPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class SPersona implements dtoPersona {
@Autowired RPersona rPersona;

    @Override
    public List<Persona> getPersonas() {
         List<Persona> persona = rPersona.findAll();
        return persona;
    }

    @Override
    public void savePersonas(Persona persona) {
        rPersona.save(persona);
    }

    @Override
    public void deletePersonas(Long id) {
        rPersona.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = rPersona.findById(id).orElse(null);
        return persona;
    }
    
}
