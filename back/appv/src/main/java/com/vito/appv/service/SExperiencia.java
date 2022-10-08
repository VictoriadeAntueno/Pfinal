/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
package com.vito.appv.service;


import com.vito.appv.dto.dtoExperiencia;
import com.vito.appv.entity.Experiencia;
import com.vito.appv.repository.RExperiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */

/**
@Service
@Transactional
public class SExperiencia  {
    @Autowired RExperiencia rExperiencia;
    

    @Override
    public List<Experiencia> getExperiencia() {
        return rExperiencia.findAll();
    }

    @Override
    public Experiencia saveExperiencia(Experiencia experiencia) {
       return rExperiencia.save(experiencia);
    }

    @Override
    public void deleteExperiencia(Long id) {
        rExperiencia.deleteById(id);
    }

   @Override
    public Optional <Experiencia> getOne(Long id) {
          return rExperiencia.findById(id); }

    @Override
    public Experiencia editExperiencia(Experiencia experiencia) {
         return rExperiencia.save(experiencia);
    }
    
    
     //   public List<Experiencia> list() {
    //    return rExperiencia.findAll();
    //}

    //public Optional<Experiencia> getOne(int id) {
      //  return rExperiencia.findById(id);
    //}

//public Optional<Experiencia> getByNombreE(String nombreE) {
  //      return rExperiencia.findByNombreE(nombreE);
    //}

    //public void save(Experiencia experiencia) {
      //  rExperiencia.save(experiencia);
    //}
    
     //public void delete(int id) {
      //  rExperiencia.deleteById(id);
    //}

    //public boolean existsById(int id) {
      //  return rExperiencia.existsById(id);
    //}

    //public boolean existsByNombreE(String nombreE) {
      //  return rExperiencia.existsByNombreE(nombreE);
    //}  
    
    
    
}
 **/