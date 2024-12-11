package be.project.pojo;

import be.project.dao.SiteDAO;

public class Test {

    public static void main(String[] args) {
        SiteDAO siteDAO = new SiteDAO();
        Site site = siteDAO.getSiteById(1); // Exemple : récupérer le site avec l'ID 1

        if (site != null) {
            System.out.println("Site trouvé : " + site.getCity());
        } else {
            System.out.println("Site non trouvé.");
        }
    }
}
