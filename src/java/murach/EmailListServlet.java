package murach;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/emailList")
public class EmailListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Forward về index.jsp
        RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";
        }

        String url = "/index.jsp";
        if (action.equals("join")) {
            url = "/index.jsp";   // Hiển thị form nhập
        }
        else if (action.equals("add")) {
            // Lấy dữ liệu từ form
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");

            // Tạo User object
            murach.business.User user = new murach.business.User(firstName, lastName, email);

            // Lưu user vào request
            request.setAttribute("user", user);

            // Chuyển đến trang thanks.jsp
            url = "/thanks.jsp";
        }

        RequestDispatcher rd = request.getRequestDispatcher(url);
        rd.forward(request, response);
    }
}
