/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vito.appv.dto;

import com.vito.appv.entity.Persona;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface dtoPersona {
    //traer una lista de personas
    public List<Persona> getPersonas();
    
    //guardar un objeto de tipo persona
    public void savePersonas(Persona persona);
    
    //Eliminar un usuario por id
    public void deletePersonas(Long id);
    
    //buscar una persona por id
    public Persona findPersona(Long id);
}
