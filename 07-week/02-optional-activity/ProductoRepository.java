import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    // Consulta por método: JPA genera automáticamente el SQL
    // a partir del nombre del método (sin escribir una sola línea de SQL)
    List<Producto> findByCategoria(String categoria);
}