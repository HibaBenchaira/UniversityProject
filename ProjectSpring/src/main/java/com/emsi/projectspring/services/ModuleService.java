package com.emsi.projectspring.services;

import com.emsi.projectspring.entities.Module;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ModuleService {
    Module saveModule(Module module);
    Module updateModule(Module module);
    void deleteModuleById(Long id);
    void deleteAllModules();
    Module getModuleById(Long id);
    List<Module> getAllModules();
}
