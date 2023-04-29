package com.example.practica_listener_filtros;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "Servletcapture", value = "/Servletcapture")
public class Servletcapture extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        String mensajeRequest = (String) req.getAttribute("mensaje");  // me da el mensaje de guardando algun valor para el request
        String mensajeApp = (String) getServletContext().getAttribute("mensaje"); // me da el mensaje de Hola a todos desde la application
        System.out.println("hola");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {


    }
}
