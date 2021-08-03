package datos;

import java.util.List;
import modelo.Disco;

public interface DiscoDAO {
    
    public List<Disco> Listar();
    public void insertar (Disco disco);
    public void editar (Disco disco);
    public void eliminar (Disco disco);
    public Disco buscar (Disco disco);
}
