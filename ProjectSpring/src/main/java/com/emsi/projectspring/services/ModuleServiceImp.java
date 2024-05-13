package com.emsi.projectspring.services;

import com.emsi.projectspring.entities.Module;
import com.emsi.projectspring.repositories.DossierRepository;
import com.emsi.projectspring.repositories.ModuleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ModuleServiceImp implements ModuleService {
    private ModuleRepository moduleRepository;
    @Override
    public Module saveModule(Module module) {
        return moduleRepository.save(module);
    }

    @Override
    public Module updateModule(Module module) {
        return moduleRepository.save(module);
    }

    @Override
    public void deleteModuleById(Long id) {
        moduleRepository.deleteById(id);
    }

    @Override
    public void deleteAllModules() {
        moduleRepository.deleteAll();
    }

    @Override
    public Module getModuleById(Long id) {
        return moduleRepository.findById(id).get();
    }

    @Override
    public List<Module> getAllModules() {
        return moduleRepository.findAll();
    }
}
