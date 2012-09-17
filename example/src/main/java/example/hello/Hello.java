package example.hello;

import javax.servlet.http.HttpServlet;
import java.io.Writer;

public class Hello extends HttpServlet {
    protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp)
            throws javax.servlet.ServletException, java.io.IOException {
        Writer writer;

        resp.setContentType("text/html");
        writer = resp.getWriter();
        writer.write("<html><body><h1>Hello, Jasmin</h1>\n");
        writer.write("  <a href='xml/jasmin/admin/'>Admin page</a><br/>\n");
        writer.write("  <a href='xml/jasmin/get/no-expires/hello-jasmin-foo-bar/js/lead'>foo/bar.js</a><br/>\n");
        writer.write("  <a href='xml/jasmin/get/no-expires/hello-jasmin-foo-bar/js-min/lead'>foo/bar.js minimiert</a><br/>\n");
        writer.write("  <a href='xml/jasmin/get/no-expires/hello-jasmin-foo-bar/css/lead'>foo/bar.css</a><br/>\n");
        writer.write("  <a href='xml/jasmin/get/no-expires/hello-jasmin-foo-bar/css-min/lead'>foo/bar.css minimiert</a><br/>\n");
        writer.write("</body></html>\n");
        writer.close();
    }

}
