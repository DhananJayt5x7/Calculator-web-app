package Mypackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jakarta.servlet.RequestDispatcher;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private List<String> history = new ArrayList<>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("bt1");

        if ("history".equals(action)) {
            request.setAttribute("history", history);
            RequestDispatcher dispatcher = request.getRequestDispatcher("history.jsp");
            dispatcher.forward(request, response);
        } else {
            handleCalculation(request, response);
        }
    }

    private void handleCalculation(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = 0;
        String operation = request.getParameter("bt1");
        double result = 0;
        boolean isUnaryOperation = false;

        if (!operation.equals("7")) {  // For √, no need to parse num2
            num2 = Double.parseDouble(request.getParameter("num2"));
        }

        switch (operation) {
            case "1":
                result = num1 + num2;
                break;
            case "2":
                result = num1 - num2;
                break;
            case "3":
                result = num1 * num2;
                break;
            case "4":
                result = num1 / num2;
                break;
            case "5":
                result = num1 % num2;
                break;
            case "6":
                result = Math.pow(num1, num2);
                break;
            case "7":
                result = Math.sqrt(num1);
                isUnaryOperation = true;
                break;
        }

        String record = isUnaryOperation
                ? "√" + num1 + " = " + result
                : num1 + " " + getOperationSymbol(operation) + " " + num2 + " = " + result;
        history.add(record);

        request.setAttribute("result", result);
        request.setAttribute("operation", record);

        RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
        dispatcher.forward(request, response);
    }

    private String getOperationSymbol(String operation) {
        switch (operation) {
            case "1": return "+";
            case "2": return "-";
            case "3": return "*";
            case "4": return "/";
            case "5": return "%";
            case "6": return "^";
            case "7": return "√";
            default: return "";
        }
    }
}
