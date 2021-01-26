package edu.security;

import javax.annotation.security.RolesAllowed;
import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/manager/page")
//@RolesAllowed({"managers", "bosses", "admins"})
//@ServletSecurity(
//        @HttpConstraint()
//)
public class ManagerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("User principal class: " + req.getUserPrincipal().getClass().getCanonicalName());
        resp.getWriter().write("We are in manager servlet. User: " + req.getUserPrincipal().getName());
        resp.getWriter().close();
    }
}
