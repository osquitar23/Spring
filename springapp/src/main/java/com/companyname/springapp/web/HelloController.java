package com.companyname.springapp.web;
/*Controlador de MVC*/
/*Mapea hacia una vista*/
/*Aqui se importan las librerias o las clases*/
import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller/*Corresponde a la libreria de spring*/
public class HelloController {

    protected final Log logger = LogFactory.getLog(getClass());
    /*Mapeos o redireccion*/
    @RequestMapping(value="/hello.htm")/*request mapping me hace un mapeo del jsp al htm 
    o me hace una conversion de fichero*/
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String now = (new Date()).toString();/*Creas la variable Date para mostrarlo en el jsp*/
        logger.info("Returning hello view with " + now);/*Variable de la fecha*//*libreria para sacar los mensajes
        en consola->Logger, retorna un modelandview con el info.*/
        
        /*El crea una variable cualquiera*/
        return new ModelAndView("hello", "now", now);/*y esto hace que me devuelva el jsp y la fecha
        del servidor*//*hello.jsp es la vista y el primer now es lo que va a mostrarme en el jsp y el otro now es 
        que hace que me cargue la variable con el framework creado*/
    }
    
    /*Mapeos*/
    @RequestMapping(value="/Servicios.htm")
    public ModelAndView llamarServicios(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	String nombre = "Oscar";
    	
        logger.info("Returning hello view de servicios");

        return new ModelAndView("Servicios","minombre",nombre);
    
}
}