package servlet;

import db.DBManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

import java.io.IOException;

@WebServlet(value = "/addUser")
public class AddUserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("userName"); // Zhansaya
        String surname = req.getParameter("userSurname"); // Kulbaeva
        User user = new User(name,surname); // User user = new User("Zhansaya","Kulbaeva")
        DBManager.addUser(user);
        resp.sendRedirect("/home");
    }
}
