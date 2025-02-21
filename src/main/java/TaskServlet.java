//package com.example.todo;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/addTask")
public class TaskServlet extends HttpServlet {
    private static List<Task> tasks = new ArrayList<>();
    private static int taskIdCounter = 1;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        Task task = new Task(taskIdCounter++, description);
        tasks.add(task);
        response.sendRedirect("index.jsp");
    }
}
