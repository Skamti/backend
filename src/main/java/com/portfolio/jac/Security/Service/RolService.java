package com.portfolio.jac.Security.Service;

import com.portfolio.jac.Security.Entity.Rol;
import com.portfolio.jac.Security.Enums.RolNombre;
import com.portfolio.jac.Security.Repository.IRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    IRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
  
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
