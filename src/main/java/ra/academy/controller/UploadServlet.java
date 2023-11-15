package ra.academy.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@MultipartConfig(
        maxFileSize = 5*1024*1024, // 5MB
        maxRequestSize = 25*1024*1024 // 25MB,
        ,fileSizeThreshold = 1024*1024  // bộ nhớ đệm
)
@WebServlet(name = "UploadServlet", value = "/UploadServlet")
public class UploadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action!=null && action.equals("Upload")){
            //  lấy ra đương dẫn muốn upload đến ;
             String uploadPath = getServletContext().getRealPath("/uploads");// lấy ra đối tương Servletcontext
             File file = new File(uploadPath);
             if(!file.exists()){
                 file.mkdirs(); // tạo thư mục
             }

             List<String> filenames = new ArrayList<>();
             // lấy ra danh sách file upload
            Collection<Part> listFile = request.getParts();
            for (Part p: listFile) {
                if(p.getName().equals("image")){
                    // upload image
                   String nameFile = p.getSubmittedFileName();
                   p.write(uploadPath+File.separator+nameFile);
                   filenames.add(nameFile);
                }else if (p.getName().equals("avatar")){
                    //upload avatar
                    String nameFile = p.getSubmittedFileName();
                    p.write(uploadPath+File.separator+nameFile);
                    filenames.add(nameFile);
                }
            }
            // gửi link ảnh sang
            request.setAttribute("images",filenames);
            request.getRequestDispatcher("/WEB-INF/views/image-upload.jsp").forward(request,response);
        }
    }
}