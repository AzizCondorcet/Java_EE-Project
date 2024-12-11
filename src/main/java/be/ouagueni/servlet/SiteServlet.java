package be.ouagueni.servlet;

import be.project.pojo.Site;
import be.project.dao.SiteDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

public class SiteServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Récupérer un site par son ID
        SiteDAO siteDAO = new SiteDAO();
        Site site = siteDAO.getSiteById(1); // Exemple : récupérer le site avec l'ID 1

        // Ajouter le site à l'attribut de la requête
        if (site != null) {
            request.setAttribute("site", site);
        } else {
            request.setAttribute("errorMessage", "Site non trouvé.");
        }

        // Rediriger vers la page JSP pour afficher le résultat
        request.getRequestDispatcher("/site.jsp").forward(request, response);
    }
}
