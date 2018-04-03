package servlet4.pushbuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Source code github.com/petrakus
 *
 * @author Petar Petrov (Petrakus)
 * @version 1.0
 */
@WebServlet("/duke")
public class DukeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.newPushBuilder()
                .path("resources/images/duke.png")
                .push();

        getServletContext().getRequestDispatcher("/duke.jsp").forward(request, response);

    }
}