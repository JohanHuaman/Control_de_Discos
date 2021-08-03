package controlador;

import datos.DiscoDAOImpl;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Disco;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String accion = request.getParameter("accion");

        if ("listarDiscos".equals(accion)) {
            listarDiscos(request, response);
        } else if ("editarDisco".equals(accion)) {
            editarDisco(request, response);
        } else if ("eliminarDisco".equals(accion)) {
            eliminarDisco(request, response);
        } else {
            accionDefault(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String accion = request.getParameter("accion");

        if ("agregarDisco".equals(accion)) {
            agregarDisco(request, response);
        } else if ("modificarDisco".equals(accion)) {
            modificarDisco(request, response);
        } else {
            accionDefault(request, response);
        }
    }

    private void accionDefault(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    private void eliminarDisco(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idDisco = Integer.parseInt(request.getParameter("id"));

        //Creamos el objeto del Disco
        Disco disco = new Disco(idDisco);

        DiscoDAOImpl discoDAO = new DiscoDAOImpl();
        discoDAO.eliminar(disco);

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    private void editarDisco(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idDisco = Integer.parseInt(request.getParameter("id"));
        Disco discoID = new Disco(idDisco);
        DiscoDAOImpl discoDAO = new DiscoDAOImpl();
        Disco disco = discoDAO.buscar(discoID);
        request.setAttribute("disco", disco);
        String jspEditar = "/vista/editarDisco.jsp";
        request.getRequestDispatcher(jspEditar).forward(request, response);
    }

    private void listarDiscos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DiscoDAOImpl discosListados = new DiscoDAOImpl();
        List<Disco> discos = discosListados.Listar();
        System.out.println(discos);
        HttpSession sesion = request.getSession();
        sesion.setAttribute("discos", discos);
        String listarPath = "/vista/listarDiscos.jsp";
        request.getRequestDispatcher(listarPath).forward(request, response);
    }

    private void modificarDisco(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String nombre = request.getParameter("nombre");
        String banda = request.getParameter("banda");
        String genero = request.getParameter("genero");
        String formato = request.getParameter("formato");

        //Validamos el precio ingresado
        int precioDisco = 0;
        String precioString = request.getParameter("precio");
        if (precioString != null && !"".equals(precioString)) {
            precioDisco = Integer.parseInt(precioString);
        }

        //Creamos u objeto del tipo disco.
        Disco disco = new Disco(id, nombre, banda, genero, formato, precioDisco);

        DiscoDAOImpl discoModificado = new DiscoDAOImpl();
        discoModificado.editar(disco);

        response.sendRedirect("index.jsp");
    }

    private void agregarDisco(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String banda = request.getParameter("banda");
        String genero = request.getParameter("genero");
        String formato = request.getParameter("formato");

        //Validamos el precio ingresado
        int precioDisco = 0;
        String precioString = request.getParameter("precio");
        if (precioString != null && !"".equals(precioString)) {
            precioDisco = Integer.parseInt(precioString);
        }

        //Creamos u objeto del tipo disco.
        Disco disco = new Disco(nombre, banda, genero, formato, precioDisco);

        DiscoDAOImpl discoAgregado = new DiscoDAOImpl();
        discoAgregado.insertar(disco);

        response.sendRedirect("index.jsp");
    }
}