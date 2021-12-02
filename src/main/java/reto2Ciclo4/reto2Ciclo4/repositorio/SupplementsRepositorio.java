/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2Ciclo4.reto2Ciclo4.repositorio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reto2Ciclo4.reto2Ciclo4.interfaces.InterfaceSupplements;
import reto2Ciclo4.reto2Ciclo4.modelo.Supplements;

/**
 *
 * @author FAMILIA4
 */
@Repository
public class SupplementsRepositorio {
    @Autowired
    
    private InterfaceSupplements repository;
    
    public List<Supplements> getAll() {
        return repository.findAll();
    }
    
    public Optional<Supplements>getClothe(String reference){
        return repository.findById(reference);
    }
    
    
    public Supplements create(Supplements clothe) {
        return repository.save(clothe);
    }

    public void update(Supplements clothe) {
        repository.save(clothe);
    }
    
    public void delete(Supplements clothe) {
        repository.delete(clothe);
    }
}
   
