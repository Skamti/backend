package com.portfolio.jac.Security.Repository;

import com.portfolio.jac.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{
    Optional<Usuario> findByNombreUsuario (String nombreUsuario);    
    
    boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByEmail(String Email);
}
