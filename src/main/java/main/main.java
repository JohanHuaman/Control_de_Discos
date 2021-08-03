package main;

import datos.DiscoDAOImpl;
import modelo.Disco;

public class main {
    public static void main(String[] args) {
        
        DiscoDAOImpl discoDAO = new DiscoDAOImpl();
        
        //Listar Discos
//        List<Disco> discos = discoDAO.Listar();
//        for (Disco disco : discos) {
//            System.out.println("Disco: " +disco);
//        }

        //Buscar por ID
        Disco buscarDisco = new Disco(4);
        System.out.println(discoDAO.buscar(buscarDisco));

        //Insertar Nuevo disco
//        Disco discoNuevo = new Disco("asdffffff", "affff", "Rff", "CD", 30);
//        discoDAO.insertar(discoNuevo);
//        System.out.println("Disco agregado de manera correcta");

        //Editar disco
//        Disco discoActualizado = new Disco(12, "Johan", "Huaman", "Rock", "CD", 1000);
//        discoDAO.editar(discoActualizado);
//        System.out.println("Disco actualizado de manera correcta");

        //Eliminar disco
//        Disco discoEliminado = new Disco(12);
//        discoDAO.eliminar(discoEliminado);


        //Formas Simplificadas de crear los objetos para tomar acciones
        //Listar
//        DiscoDAOImpl discoDAO = new DiscoDAOImpl();
//        discoDAO.insertar(new Disco("prueba", "prueba2", "Rock", "CD", 30));
//        System.out.println("Disco agregado de manera correcta");

        //Eliminar
//        DiscoDAOImpl discoDAO = new DiscoDAOImpl();
//        discoDAO.eliminar( new Disco(16));
//        System.out.println("Disco eliminado de manera exitosa");

        //Actualizar
//        DiscoDAOImpl discoDAO = new DiscoDAOImpl();
//        discoDAO.editar( new Disco(16, "Johan", "Huaman", "Castañeda", "CD", 1000));
//        System.out.println("Disco Actualizado de manera exitosa");
    }
}
