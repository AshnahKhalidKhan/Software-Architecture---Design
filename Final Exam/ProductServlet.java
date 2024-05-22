// Problem:
// The code violates the separation of concerns principle in MVC. It directly writes HTML
// content to the response within the Servlet (). This makes the code less maintainable
// and harder to test.

// Your Task:
// Refactor the code to comply with the MVC architecture.


public class ProductServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String action = request.getParameter("action");
        if (action.equals("list"))
        {
            // Logic to retrieve product list from database (replace with actual logic)
            List<Product> products = new ArrayList<>();
            // ... (database access code)
            // Directly write HTML content to response (MVC Violation)
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h1>Products</h1>");
            out.println("<ul>");
            for (Product product : products)
            {
                out.println("<li>" + product.getName() + " - $" + product.getPrice() + "</li>");
            }
            out.println("</ul>");
            out.close();
        }
        else if (action.equals("details"))
        {
            // Logic to retrieve product details based on ID (replace with actual logic)
            int productId = Integer.parseInt(request.getParameter("id"));
            Product product = null;
            // ... (database access code)
            // Directly write HTML content to response (MVC Violation)
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            if (product != null) 
            {
                out.println("<h1>" + product.getName() + "</h1>");
                out.println("<p>Price: $" + product.getPrice() + "</p>");
            }
            else 
            {
                out.println("Product not found!");
            }
            out.close();
        }
    }
}


// NOTE: I cannot figure out how to write the Java code for this quickly because I'm out of time
// But this is what I wanted to do:
// Create separate classes for ProductServletView, ProductServletController and ProductServlet.
// In Product, I am assuming it is part of the model layer of MVC and is the model class of Product
// so only has details related to that.
// In ProductServlet, I would be adding all the logic of retriving the product data from
// the database and populating the product list, and applying business logic to it.
// In ProductServletController, I would only be taking data from ProductServlet and passing it to
// ProductView. Please note that I would haVE NO business logic here.
// In the ProductView, I would be taking the data from ProductServletController and then applying all the UI
// HTML specifications given below to implement that.
// It would look something like this but individual code inside these I do not have time to fix.


public class ProductServlet extends HttpServlet
{
    // gets data from database
    // applies business logic before passing to controller
}

public class ProductServletController
{
    // Holds no business logic
    // passes data to productVwie
}

public class ProductView
{
    //takes data from ProductServletController (and maybe aur koi controller bhi) and just displays it
    
}