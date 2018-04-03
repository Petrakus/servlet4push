package servlet4.pushbuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.PushBuilder;
import java.io.IOException;

/**
 * Source code github.com/petrakus
 *
 * @author Petar Petrov (Petrakus)
 * @version 1.0
 */
@WebServlet("/multiple")
public class MultipleResourceServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PushBuilder pushBuilder = request.newPushBuilder();

        if (pushBuilder != null) {
            pushBuilder.path("images/duke.png").push();
            pushBuilder.path("css/simple.css").push();
            pushBuilder.path("js/simple.js").push();
        }

        getServletContext().getRequestDispatcher("/duke.xhtml").forward(request, response);

    }
}