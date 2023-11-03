
package Tienda_BENICIO.demo.dao;
//Imports de la clase
import Tienda_BENICIO.demo.domain.Categoria; 
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<Categoria, Long> {
    
    
    
}// Fin de la clase
