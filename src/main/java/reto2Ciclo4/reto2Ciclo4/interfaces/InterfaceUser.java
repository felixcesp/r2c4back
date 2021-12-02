/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package reto2Ciclo4.reto2Ciclo4.interfaces;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import reto2Ciclo4.reto2Ciclo4.modelo.User;



/**
 *
 * @author FAMILIA4
 */
public interface InterfaceUser extends MongoRepository<User, Integer>{
    
    Optional<User> findByEmail(String email);    
    Optional<User> findByEmailAndPassword(String email, String password);
    
}
