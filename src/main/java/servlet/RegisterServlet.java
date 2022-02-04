package servlet;


import dao.RegisterDao;
import model.Member;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class RegisterServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("memberRegister.jsp").include(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String password = request.getParameter("password");

        Member member = new Member(username, password, email, phone);

        RegisterDao registerDao = new RegisterDao();
        String result = registerDao.insert(member);
        try {
            response.getWriter().print(result);
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}