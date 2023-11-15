package ra.academy.controller;

import ra.academy.model.Post;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "HomeServlet", value = "/HomeServlet")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action != null) {
            switch (action) {
                case "HOME":
                    // tạo danh sách
                    List<Post> list = Arrays.asList(
                            new Post("https://icdn.24h.com.vn/upload/4-2023/images/2023-11-13/255x170/1699857097-299-thumbnail-width740height555.jpg","tiêu đề 1","Nội dung 1","Author 1"),
                            new Post("https://icdn.24h.com.vn/upload/4-2023/images/2023-11-13/255x170/1699857097-299-thumbnail-width740height555.jpg","tiêu đề 2","Nội dung 2","Author 2"),
                            new Post("https://icdn.24h.com.vn/upload/4-2023/images/2023-11-13/255x170/1699857097-299-thumbnail-width740height555.jpg","tiêu đề 3","Nội dung 3","Author 3")
                            );
                    request.setAttribute("list",list);
                    request.setAttribute("action","home");
                    request.getRequestDispatcher("/").forward(request, response);
                    break;
                case "PRODUCT":
                    request.setAttribute("action","product");
                    request.getRequestDispatcher("/WEB-INF/views/list-product.jsp").forward(request, response);
                    break;
                case "ABOUT":
                    request.setAttribute("action","about");
                    request.getRequestDispatcher("/WEB-INF/views/about.jsp").forward(request, response);
                    break;
                case "PROFILE":
                    request.setAttribute("action","profile");
                    request.getRequestDispatcher("/WEB-INF/views/my-profile.jsp").forward(request, response);
                    break;
                case "CART":
                    request.setAttribute("action","cart");
                    request.getRequestDispatcher("/WEB-INF/views/cart.jsp").forward(request, response);
                    break;
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}