/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vito.appv.security.repository;

import com.vito.appv.security.entity.Rol;
import com.vito.appv.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario
 */
@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
     Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
