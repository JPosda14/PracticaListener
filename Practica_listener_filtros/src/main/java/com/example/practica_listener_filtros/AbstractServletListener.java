package com.example.practica_listener_filtros;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebListener
public class AbstractServletListener implements ServletContextListener, ServletRequestListener, HttpSessionListener {
    private ServletContext servletContext;
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        sce.getServletContext().log("inicia la aplicación");
        servletContext = sce.getServletContext();
        servletContext.setAttribute("mensaje", "Hola a todos desde el servidor");
        //se pone el mensaje a un attribute del context de el servlet
    }
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        servletContext.log("inicializando el request");
        sre.getServletRequest().setAttribute("mensaje", "guardando algun valor para el request");
        // se pone el mensaje a un attribute de la petición del servlet
    }

}
