package edu.security;

import javax.annotation.security.RolesAllowed;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/boss/page")
//@RolesAllowed({"bosses", "admins"})
public class BossServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("User principal class: " + req.getUserPrincipal().getClass().getCanonicalName());
        resp.getWriter().write("We are in boss servlet. User: " + req.getUserPrincipal().getName());
        resp.getWriter().close();
    }
}
